#登录

"""
username=input("请输入用户名：")
passworld=input("请输入密码：")
if username=='alex':
    if passworld=='alex':
        print("登录成功")
    else:
        print("密码错误")
else:
    if passworld=='alex':
        print("用户名错误")
    else:
        print("用户名&密码错误,登录失败")


"""
username=input("请输入用户名：")
passworld=input("请输入密码：")
if username=='alex' and passworld=='alex':
    print("登录成功")
else:
    if passworld=='alex':
        print("用户名错误")
    elif username=='alex':
        print("密码错误")
    else:
        print("用户名&密码错误")
    print("登录失败")