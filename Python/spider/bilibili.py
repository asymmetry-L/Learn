#!/usr/bin/env python
# -*- encoding: utf-8 -*-

# Here put the improt lib
import json
import re
import time
import hashlib
import requests
from difflib import SequenceMatcher

def logo():
    print('                     //')
    print('         \\\         //')
    print('          \\\       //')
    print('    ##3333333333333333333333##')
    print('    ## 22222222222222222222 ##    ________   ___   ___        ___   ________   ___   ___        ___')
    print('    ## hh                hh ##   |\   __  \ |\  \ |\  \      |\  \ |\   __  \ |\  \ |\  \      |\  \\')
    print('    ## hh    //    \\\    hh ##   \ \  \|\ /_\ \  \\\ \  \     \ \  \\\ \  \|\ /_\ \  \\\ \  \     \ \  \\')
    print('    ## hh   //      \\\   hh ##    \ \   __  \\\ \  \\\ \  \     \ \  \\\ \   __  \\\ \  \\\ \  \     \ \  \\')
    print('    ## hh                hh ##     \ \  \|\  \\\ \  \\\ \  \____ \ \  \\\ \  \|\  \\\ \  \\\ \  \____ \ \  \\')
    print('    ## hh      wwww      hh ##      \ \_______\\\ \__\\\ \_______\\\ \__\\\ \_______\\\ \__\\\ \_______\\\ \__\\')
    print('    ## hh                hh ##       \|_______| \|__| \|_______| \|__| \|_______| \|__| \|_______| \|__|')
    print('    ## 22222222222222222222 ##        【exit】退出')
    print('    ##3333333333333333333333##        【达拉崩吧】说明')
    print('\n')

def explain():
    print('Instruction Book')
    print('奖号依据：程序运行时刻的微博热搜词top1=>MD5加密=>奖号')
    print('奖券号：楼层数+昵称+id=>MD5加密=>奖券号')
    print('抽奖时取奖券号最接近奖号的一位')

def getAv(code):  # 获取视频av号
    url = f'https://www.bilibili.com/video/{video_code}'
    response = requests.get(url)
    response.encoding = 'utf-8'
    html = response.text
    av_code = re.findall(
        r'<meta data-vue-meta="true" property="og:url" content="https://www.bilibili.com/video/av(.*?)/">', html)[0]
    return av_code


def getData(av_code, page_num=1, sort=0): #评论区username&id
    url = f'https://api.bilibili.com/x/v2/reply?callback=jQuery1720266519964639113_1586919135667&pn={page_num}&type=1&oid={av_code}&sort={sort}&_=1586919138435'
    # url = f'https://api.bilibili.com/x/v2/reply?callback=jQuery1720266519964639113_1586919135667&pn=1&type=1&oid=540177402&sort=0&_=1586919138435'
    # pn 页码
    # oid 视频id
    # sort == 0 按时间排序
    # sort == 2 按热度排序
    response = requests.get(url)
    response.encoding = 'utf-8'
    html = json.loads(response.text)
    page_data = html['data']['page']
    floor = page_data['count']
    pageNum = page_data['count'] // page_data['size'] + 1
    # print(pprint.pprint(html['data']['replies']))

    cmMap = {}  # 第xxl楼：{'usr_name':xxxxx,'id':xxxxx}
    for num in range(1, pageNum + 1):
        dir_url = f'https://api.bilibili.com/x/v2/reply?callback=jQuery1720266519964639113_1586919135667&pn={num}&type=1&oid={av_code}&sort={sort}&_=1586919138435'
        # dir_url = f'https://api.bilibili.com/x/v2/reply?callback=jQuery1720266519964639113_1586919135667&pn={num}&type=1&oid=540177402&sort=0&_=1586919138435'
        response_d = requests.get(dir_url)
        response_d.encoding = 'utf-8'
        html_d = json.loads(response_d.text)
        for i in html_d['data']['replies']:
            user_data = {'user_name': i['member']
                         ['uname'], 'id': i['member']['mid']}
            # print(i['member']['mid'] + ':' + i['member']['uname'])
            # print(user_data)
            cmMap[str(floor)] = user_data
            floor -= 1
        # print(num)
        # print(dir_url)
        time.sleep(0.5)
    #去重复
    re_list=[]
    for key,value in cmMap.items():
        for k,v in cmMap.items():
            if k in re_list:
                continue
            if key != k and value == v:
                re_list.append(k)
        # print(re_list)
    del_list = re_list[:-1]
    # print(del_list)
    for i in del_list:
        del cmMap[i]
    # print(cmMap)
    return cmMap

def  weiboHot(): #微博热词
    url = 'https://s.weibo.com/top/summary?cate=realtimehot'
    reponse = requests.get(url)
    reponse.encoding = 'utf-8'
    html = reponse.text
    hot_tbody = re.findall(r'<tbody>(.*?)</tbody>',html,re.S)[0]
    hot_top = re.findall(r'<tr class="">(.*?)</tr>',hot_tbody,re.S)[1]
    hot_word = re.findall(r'target="_blank">(.*?)</a>',hot_top,re.S)[0]
    return hot_word

def hashMd5(args): #哈希算法
    hash_md5 = hashlib.md5()
    hashMd5 = hash_md5.update(args.encode('utf-8'))#hash.hexdigest（）
    hash_code = hash_md5.hexdigest()
    return hash_code


def similarity(a, b):
    return SequenceMatcher(None, a, b).ratio()

if __name__ == "__main__":
    logo()
    while True:
        video_code = input('BV号:')
        if video_code=='达拉崩吧':
            explain()
        elif video_code=='exit':
            break
        elif len(video_code)==12:
            max_num = 0
            hot_word = weiboHot()
            hash_code_hot = hashMd5(hot_word)
            
            print(time.asctime( time.localtime(time.time())))
            
            print('微博热搜top1:'+ hot_word)
            
            print('哈希值:' + hash_code_hot)
            
            av_code = getAv(video_code)
            
            cm_dict = getData(av_code)
            
            for key,value in cm_dict.items():
                # print(key,value)
                userName = value['user_name']
                uid = value['id']
                cm_word = key + userName + uid
                # print(cm_word)
                hash_code_cm = hashMd5(cm_word)
                # print(hash_code_cm)
                # print(f'\r{hash_code_cm}' , end = '')
                
                if similarity(hash_code_hot,hash_code_cm) > max_num:
                    max_num = similarity(hash_code_hot,hash_code_cm)
                    lucky_code = hash_code_cm
                    # print('\n*************************')
                    # print(lucky_code + '--'+ str(max_num) +'--')
                    # print('*************************')
                    # print(f'\r{lucky_code}|相似度:{max_num}', end = '')
                    # print(f'\r***LUCKY MAN***')
                    print(f'\r第{key}楼  NAME:{userName}  ID:{uid}',end = '')
                # print(f'\r{cm_word}' , end = '')
                
                time.sleep(0.05)
            print('\n')
        else:
            print('BV号有误')

