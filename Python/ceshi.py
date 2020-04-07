#御坂10086的搜索模块

import requests
import re

search = input()
"""
url = f'https://cn.bing.com/search?q={search}&go=搜索&qs=ds&form=QBRE'
header = {
        'User-Agent':
        'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36 Edg/80.0.361.50'
    }
response = requests.get(url)
html = response.text
# 获取网页源代码
result = re.findall(r'<main aria-label="搜索结果">(.*?)</main>',html,re.S)[0]
result = result.replace('<strong>','').replace('</strong>','')

fb = open('C:/Users/Asymmetry/Desktop/01.txt' , 'w' , encoding = 'utf-8')
# fb.write(result_num)
fb.write(result)
print('ok')

result_num = re.findall(r'<span class="sb_count">(.*?)</span>',result,re.S)[0]
result_num = result_num.replace(',','')
# result_num = re.findall(r'\d+\.?\d*',result_num)[0]
p = re.compile('\d+')
result_num = p.findall(result_num)[0]
print('符合搜索项共计' + result_num + '条')
# print(result_num)
# 打印搜索结果数量
b = 0
result_list = re.findall(r'<li class="b_algo">(.*?)</li>',result,re.S)[b]
print(result_list)
# 打印第一条结果
# print(len(result_list))
next_page = re.findall(r'<nav role="navigation"(.*?)</nav>',result,re.S)[0]
next_page = re.findall(r'<li>(.*?)</li>',next_page,re.S)[-1]
print(next_page)
# 获取下一页的链接
"""
url = f'https://w.upupming.site/wiki/{search}'
    # 请求头部
headers = { 
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36' 
    }
response = requests.get(url)
html = response.text
# 获取网页源代码
result = re.findall(r'<table class="infobox biography vcard"(.*?)</table>',html,re.S)[0]
print(result)
# a = input('是否显示下一条结果【是/否】:')
# while a !='是':
#     if a == '否':
#         print('over')
#         break
#     else: 
#         a = input('是否显示下一条结果【是/否】:')
# else:
#     b += 1
#     result_list = re.findall(r'<li class="b_algo">(.*?)</li>',result,re.S)[b]
#     print(result_list)