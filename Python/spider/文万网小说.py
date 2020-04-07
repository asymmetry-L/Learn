#《生生不灭》
#!/usr/bin/env python
#_*_ conding:utf-8 -*-
import requests  #调用 requests 模块
import re

url = 'http://www.txtwan.com/read/21080/'
#定位一个网页
header = {'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36 Edg/80.0.361.50'}
#模拟浏览器发送http请求
response = requests.get(url)  #获取响应状态码：正常-->    <Response [200]>
response.encoding = 'utf-8'  #更改编码方式(网页乱码时用)
html = response.text  #获取html响应的网页源码
title = re.findall(r'<h3>(.*?)<small>狮子东 小说免费全文阅读</small></h3>',html)[0]#获取文件标题
fb = open("C:/Users/DELL/Desktop/%s.txt" % title , 'w' , encoding = 'utf-8')#创建文件
##获取章节信息
dl = re.findall(r'<div class="chapterlist">.*?</div>', html, re.S)[0]
#正则表达式re.findall(r'<div class="chapterlist">.*?</div>',html)中 . 代表匹配任意字符，但一般不匹配不可见字符如[换行符],所以要加re.S
#re.S  代表匹配包括不可见字符内的所有字符
#[0]：从列表中取出元素
chapter_info_list = re.findall(r'href="(.*?)">(.*?)<', dl)
#(.*?)反向捕获

for chapter_info in chapter_info_list:
    # chapter_title = chapter_info[1]
    # chapter_url = chapter_info[0]
    chapter_url, chapter_title = chapter_info
    chapter_url = 'http://www.txtwan.com%s' % chapter_url
    #下载章节内容
    chapter_response = requests.get(chapter_url)
    chapter_response.encoding = 'utf-8'
    chapter_html = chapter_response.text
    #提取章节内容
    chapter_content = re.findall(r'<p id="txt">(.*?)<ul class="pagination">', chapter_html, re.S)[0]
    #数据清洗
    chapter_content = chapter_content.replace(' ','')
    chapter_content = chapter_content.replace('&nbsp;','')
    chapter_content = chapter_content.replace('&nbsp','')
    chapter_content = chapter_content.replace('&nbs','')
    chapter_content = chapter_content.replace('&nb','')
    chapter_content = chapter_content.replace('&n','')
    chapter_content = chapter_content.replace('&','')
    chapter_content = chapter_content.replace('<br/>', '')
    chapter_content = chapter_content.replace('</p>', '')
    chapter_content = chapter_content.replace('<div>', '')
    chapter_content = chapter_content.replace('\n', '')
    chapter_content = chapter_content.replace('\r', '')
    
    #写入数据
    fb.write(chapter_title)
    fb.write(chapter_content)
    fb.write('\n')
    print(chapter_url)

