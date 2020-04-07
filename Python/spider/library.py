#!/usr/bin/env python
#_*_ conding:utf-8 -*-

get_html = 'v0.1'
import requests



def get_html(url):
    """
    这是我自用的函数
    :url: 要获取的地址
    :return: return response.text  #获取html响应的网页源码
    """
    header = {
        'User-Agent':
        'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36 Edg/80.0.361.50'
    }
    #模拟浏览器发送http请求
    response = requests.get(f'{url}')  #获取响应状态码
    response.encoding = 'utf-8'  #更改编码方式
    return response.text  #获取html响应的网页源码
