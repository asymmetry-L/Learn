#!/usr/bin/env python
#_*_ conding:utf-8 -*-
# 图灵api

import requests
import json

def robot(data):
    # if '我想听音乐' or '我想听歌' or '放个音乐' or '放歌' in data:
    #     muisc_name = input('御坂10086: ♪(^∇^*)你想听什么')
    #     muisc_url = f'https://music.163.com/#/search/m/?s={muisc_name}&type=1'
    #     heard = {'User_Agent':'ozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.106 Safari/537.36 Edg/80.0.361.54'}

    urls = 'http://openapi.tuling123.com/openapi/api/v2'
    data_dict = {
    "reqType": 0,  # 输入类型 0-文本, 1-图片, 2-音频
            "perception":  # 信息参数
            {
                "inputText":  # 文本信息
                {
                    "text": data
                },
            },
            "userInfo":
            {
                "apiKey": "5ac9f11245b84df8a752e9b539fb7b09",  # 改为自己申请的key
                "userId": "54250"  # 用户唯一标识(随便填, 非密钥)
            }
    } 
    # print(data_dict)
    result = requests.post(urls,json = data_dict) #post型请求
    content = (result.content).decode('utf-8')
    result_dic = json.loads(content)
    intent_code = result_dic['intent']['code']
    results_text = result_dic['results'][0]['values']['text']
    print('御坂10086:', results_text)

if __name__ == "__main__":
    print('我是[御坂10086]┗|｀O′|┛ 嗷~~\n')
    print('你好，你是???')
    username = input('我是')
    while True:
        user_data = input(username + ':')
        if '滚吧' in user_data:
            print('御坂10086:好的，爸爸！！')
            break
        robot(user_data)
        