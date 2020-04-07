import requests
import os
import re
from string import digits

url = 'https://pvp.qq.com/web201605/herolist.shtml'
heard = {'User_Agent':'ozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.106 Safari/537.36 Edg/80.0.361.54'}
response = requests.get(url)
response.encoding = 'gbk'
html = response.text
herolist = re.findall(r'<ul class="herolist clearfix">(.*?)</ul>', html, re.S)[0]

def hero_dic(key):
    #创建角色索引字典
    total_width = herolist.count('width')
    hero_total = 0
    hero_dic = {}
    while hero_total <= total_width - 1 :
        hero_key = re.findall(r'>(.*?)</a></li>', herolist)[hero_total]
        hero_velue = re.findall(r'href="herodetail/(.*?).shtml', herolist)[hero_total]
        # hero_dic.setdefault(hero_key,str(hero_velue))
        hero_dic[hero_key] = hero_velue
        # print(hero_key,hero_velue)
        hero_total += 1
    key_list = hero_dic.keys()
    if key in key_list:
        velue = hero_dic[u'{}'.format(key)]
    if key not in hero_dic:
        velue = '查无此熊'
    return velue

def download(key, hero_code):
    # 创建文件夹
    os.mkdir('C:/Users/16947/Desktop/' + key)
    os.chdir('C:/Users/16947/Desktop/' + key)
    # 获取源码
    hero_url = f'https://pvp.qq.com/web201605/herodetail/{hero_code}.shtml'
    response = requests.get(hero_url)
    response.encoding = 'gbk'
    hero_html = response.text
    #获取皮肤信息
    data_imgname = re.findall(r'<ul class="pic-pf-list pic-pf-list3" data-imgname="(.*?)">', hero_html)[0]
    data_imgname = re.sub('[&0-9]', '', data_imgname)
    data_num = len(data_imgname.split('|'))
    data_list = [data_num, data_imgname.split('|')]
    dress_list = data_list[1]
    # 下载图片
    num = 0
    # dress = ''
    while num < data_list[0]:
        dress_url = f'http://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/{hero_code}/{hero_code}-bigskin-{num+1}.jpg'
        dress_image = requests.get(dress_url)
        fb = open(f"C:/Users/16947/Desktop/{key}/{dress_list[num]}.jpg", 'wb')  #创建文件
        fb.write(dress_image.content)
        print(f'皮肤[{dress_list[num]}]写入完成')
        num += 1
    return data_list[0]

if __name__ == "__main__":
    key = input('请键入英雄:')
    print(f'您键入的英雄为{key}\n')
    hero_code = str(hero_dic(key))
    dress_msg = download(key,hero_code)
    print(f'该英雄包含皮肤数量:{dress_msg}\n')
    print('写入完成')