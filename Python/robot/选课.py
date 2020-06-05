#!/usr/bin/env python
#_*_ conding:utf-8 -*-

import requests

# url = '61.185.143.11:1170'
url = 'http://www.slxy.edu.cn:1170/jwglxt/xsxk/zzxkyzb_cxZzxkYzbPartDisplay.html?gnmkdm=N253512&su=18166209'
postdata = {
    'gnmkdm':'N253512',
    'su':'18166209',
}
cookie = {
    'JSESSIONID' : '49ECB7DB3B476CC42DE4705855324F30',
    'JSESSIONID' : '0F665513824623ABC6533E6203D0ECFA', 
    'route' : '68d58c011cb7465d132f3597597602ea'
}
reponse = requests.post(url,data=postdata,cookies = cookie)
text = reponse.text
print(text) 