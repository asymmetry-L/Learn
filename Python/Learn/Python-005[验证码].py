#!/usr/bin/env python
# -*- encoding: utf-8 -*-

def check_code(lenth = 4):
    import random
    import string
    check_code = ''.join(random.sample(string.ascii_letters + string.digits, lenth))
    # 从a-zA-Z0-9生成指定数量的随机字符
    code = input("请输入验证码 %s :" % (check_code, ))
    if code.upper() == check_code.upper():
        print("验证成功")
    else:
        print("验证码错误")
