import requests
import smtplib
import json
import datetime
from email.mime.text import MIMEText
from email.utils import formataddr

# addr = input('请输入位置:')

def weather(addr):
    #获取天气信息
    url = f'https://free-api.heweather.net/s6/weather/now?location={addr}&key=8a92371afde5490c9ecf3e9346ff189a&nbsp;'
    # url = f'http://t.weather.sojson.com/api/weather/city/{code}' #备用接口
    response = requests.get(url).text
    weather = json.loads(response)
    weather = weather['HeWeather6'][0]['now']
    return weather
# weather = weather(addr)

def message():
    #获取时间
    now = datetime.datetime.now()
    time = str(now.year) + '年' + str(now.month) + '月' + str(now.day) + '日' + '时间：' + str(now.hour) + ':' + str(now.minute)
    zero = '[--------------------]'
    b = ((now.day / 365) * 100) / 5
    b = round(b)
    progress = zero[:b] + '■' +zero[b+1:]
    cont = u'{}年进度: \n {} {:.00%}'.format(now.year, progress, now.day / 365)
    a = u' {} \n {} '.format(time.ljust(50), cont.center(50))
    inf = f'{a}\n'
    # inf = inf + 'wwwwwwwwwwwwwwwwwwwwwwwwwww\n'
    inf = inf + ' 云量：%s\n ' % weather['cloud']
    inf = inf + ' 天气：%s\n ' % weather['cond_txt']
    inf = inf + ' 温度：%s C°\n ' % weather['tmp']
    inf = inf + ' 体感温度：%s C°\n ' % weather['fl']
    inf = inf + ' 能见度：%sKm\n ' % weather['vis']
    inf = inf + ' 风向：%s\n ' % weather['wind_dir']
    inf = inf + ' 湿度：%s\n ' % weather['hum']
    return inf

def send_email(QQ, msg):
    #发送邮件
    mail_host = 'smtp.qq.com'
    mail_user = '1694714334@qq.com'
    mail_pass = 'dqbcjtqpgzyedcfg'
    mail_target = f'{QQ}@qq.com'
    message = MIMEText(f'{msg}')
    message['From'] = formataddr(['测试001', mail_user])
    message['TO'] = formataddr(['测试002', mail_target])
    message['Subject'] = '今日天气'
    server = smtplib.SMTP(mail_host, 25)
    server.login(mail_user, mail_pass)
    server.sendmail(mail_user, [mail_target,], message.as_string())
    server.quit()

if __name__ == "__main__":
    addr = input('请输入位置:')
    qq_code = input('请输入接收人QQ:')
    weather = weather(addr)
    msg = message()
    send_email(qq_code,msg)
    print('发送成功!')