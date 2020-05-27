#!/usr/bin/env python
#_*_ conding:utf-8 -*-

import requests

# url = '61.185.143.11:1170'
url = 'http://www.slxy.edu.cn:1170/jwglxt/xtgl/login_slogin.html?language=zh_CN&login_type='
postdata = {
    'yhm':'18166209',
    'mm':'a284515',
}
reponse = requests.post(url,data=postdata)
text = reponse.text
print(text) 