
import requests
import re

a = 41
for j in range(20):
    url = input()
    if url == 'exit':
        break
    heard = {'User_Agent':'ozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.106 Safari/537.36 Edg/80.0.361.54'}
    response = requests.get(url)
    response.encoding = 'utf-8'
    html = response.text
    urlList = re.findall(r'<img(.*?)>', html, re.S)
    imgliat = []
    print(len(urlList))
    for i in urlList:
        img_url = re.findall(r'src="(.*?)"',i,re.S)
        if len(img_url) > 0:
            a += 1
            print(a)
            print(img_url[0])
            fileCode = img_url[0].split('=')
            print(fileCode[1])
            dress_image = requests.get('https:' + img_url[0])
            fb = open(f"D:/图/{a}.jpg", 'wb')  #创建文件 {fileCode[1]}
            fb.write(dress_image.content)
            print('写入完成')
    
    # addr = re.findall(r'data-src="(.*?)"', html, re.S)[0]
    # print(i)
    # print(type(i))
    
