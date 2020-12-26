## 流程控制

### 条件语句

生活中我们常用<code>如果……就</code>或<code>如果……就……否则就……</code>

> 如果你是女生，就让你母胎 solo20 年的兄弟们爽爽

> 如果你挂了，我就去请专业的亡下七武海来抬你

> 如果你很哔 ~ ，就来段唱、跳、rap，否则就坐下

#### 基本条件语句

```python
if 条件:
    条件成立，执行此代码块
else:
    否则，执行此代码块

#********************
#如果条件不成立时不做任何操作，else可以省略
if 条件:
    条件成立，执行此代码块
```

```python
num = input("请输入一个数字：")
number = int(num)#字符串转化为整型
if number > 50 :
    print("大了")
else:
    print("小了")
```

#### 多条件判断

```python
if 条件a:
    条件 a 成立，执行该代码块
elif 条件b:
    条件 a 不成立，c:条件 b 成立，执行该代码块
elif 条件c:
    条件 a、b 不成立，条件 c 成立，执行该代码块
else:
    否则，执行该代码块
```

#### 条件语句嵌套

```python
if 条件a:
    if 条件A:
        条件 A 成立，执行该代码块
elif 条件b:
    条件 a 不成立，条件 b 成立，执行该代码块
else:
    否则，执行该代码块
```

```python
print('欢迎致电亡下七武海，提供服务如下：\n1.抬棺服务\n2.团队选择\n3.棺椁定制\n4.人工服务')
sever = input('请选择您所需要的服务：')
if sever =='1':
    print('以为您预约服务，请预留您的联系方式')
    num = input('微信请按1，电话请按2')
    if num =='1':
        wechat = input('请输入微信号：')
    elif num =='2':
        phone = input('请输入手机号：')
    else:
        print('输入不合法')
elif sever =='2':
    #懒得写了，省略
elif sever =='3':
    #懒得写了，省略
elif sever =='4':
    print('转接中，请稍后')
else:
    print('输入内容错误')
```

### 循环语句

写代码时常会遇到需要把一种操作重复多遍，如果只是重复 2-3 次，<code>ctrl+c，ctrl+v</code>就好了嘛，但要重复 100 次呢，懵逼了吧

这时候就要引入循环结构了

#### while 循环

while 就是解决重复问题的简单方法之一

```python
while 条件:
    条件成立，执行循环体代码块
    条件不成立时，跳出
#*************************
while expression:
    条件成立，执行循环体代码块
else:
    条件不成立，执行代码块
```

如

```python
while True:
    print('吃烧饼')

# 如果此时不进行操作，就会一直打印‘吃烧饼’
```

```python
n = 0
while n < 10:
    print('白嫖使我快乐')
    n = n + 1
print('白嫖失败')

#******************
n = 0
while n < 10:
    print('白嫖使我快乐')
    n = n + 1
else:
    print('白嫖失败')

# 当n<=9时，n<10为真->True
```

#### for 循环

for 循环则是另一种简单方法

```python
for target_list in expression_list:
    执行代码块
```

```python
string = input('请输入字符串：')
for s in string:
    print(s)
```

#### break 关键字

再循环过程中达成某项条件或用户需要终止循环时，就需要使用 break 来跳出循环，当循环遇到 break 时，break 后的循环体不再执行

```python
while True:
    username=input("请输入用户名：")
    passworld=input("请输入密码：")
    if username=='alex' and passworld=='alex':
        print("登录成功")
        break
        #当输入正确的的用户名和密码时跳出循环
        #当输入用户名或密码有误时，重复输入，直达用户名正确
    else:
        if passworld=='alex':
            print("用户名错误")
        elif username=='alex':
            print("密码错误")
        else:
            print("用户名&密码错误")
        print("登录失败")
```

#### continue 关键字

continue 同样是用来终止循环，但它与 break 的区别在于，break 是终止之后所有循环，而 continue 只是终止本次循环

```python
a = 0
b = 9
while True:
    a = a + 1
    if b in a:
        continue
        # 当a中含9时，跳出此次循环
    print(a)
# 打印所有不含9的数字，只要你不听它就能一直打en
```