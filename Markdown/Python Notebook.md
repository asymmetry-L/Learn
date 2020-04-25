

# Python 基础

## Python 基础语法

### Python 编码规范

python 编写代码时建议遵循[PEP8](https://legacy.python.org/dev/peps/pep-0008/)规范，许多项目有自己的编码规范，当出现冲突时，项目自身的规范优先

### 变量和赋值

#### 变量

##### 变量命名规则

1.不能使用 python 关键字，即标记不能提前被占用，python 关键字包括：
|||||||||
|---|---|---|---|---|---|---|---|
|'and'|'as'| 'assert'| 'break'| 'class'| 'continue'| 'def'| 'del'|
| 'elif'| 'else'| 'except'| 'exec'| 'finally'| 'for'| 'from'| 'global'|
| 'if'| 'import'| 'in'| 'is'| 'lambda'| 'not'| 'or'| 'pass'|
| 'print'| 'raise'| 'return'| 'try'| 'while'| 'with'| 'yield'| 

2.变量名的**第一个字符**不能为**数字** 3.变量名只能是**字母、数字、下划线**(\_)的任意组合

#### 赋值

python 中变量赋值使用符号[=]

如：

```python
a = 10
#(1)在内存中创建值[10]
#(2)创建标记[a]
#(3)将标记[a]指向值[10]
```

```python
a = 10
b = a
a = 20
#问 b = ?
#a -> 10
#b -> a ?事实上 b -> a -> 10 即 b -> 10
```

### 获取输入

#### 输出(print)

```python
print('烧饼的缩写是sb')

a = 10
print(a)

ptint(a*10)

# ******cmd time******
# 烧饼的缩写是sb
# 10
# 100
```

#### 输入(input)

```python
name = input('引号里可以随便输')
text = name + '烧饼'
print(text)

#注：input输入的数据类型位'str'
#******cmd time******
#广坤
#广坤烧饼
```

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

## 常用数据类型

python 中常用数据类型共有 int/bool/str/list/tuple/dict/set 六种。可以通过 type()来查看变量的数据类型

```python
print(type(变量))
```

### 整型[int]

整型即使十进制整数的统称包括 0、1、2……等

```python
number = 888
print(type(number))

#********cmd time******
# <class 'int'>
```

- 转换为整型

  ```python
  int_0 = int(变量)

  # 例如将布尔值转换为整型
  int_t = int(True)  #True -> 1
  int_f = int(False)  #False -> 0

  # 将字符串转换为整型
  #int()默认 base = 10 ,所以对于十进制数可以省略base
  #当字符串没不为十进制时，须添加 base = 对应进制数

  str_10 = '100'
  int_10 = int(str_10,base = 10) 
  #将字符看成十进制的数，再转换为十进制整数
  int_10 = int(str_10)
  
  str_2 = '0b1000'
  int_2 = int(str_2,base = 2) #0b1000 -> 8 o
  #将字符看成二进制[0b表示二进制]的数，再转换为十进制整数
  
  str_8 = '0o123'
  int_8 = int(str_8,base = 10) #0o123 -> 83
  #将字符看成八进制[0o表示二进制]的数，再转换为十进制整数
  
  str_16 = '0xffffffff'
  int_16 = int(str_16,base = 16) #0xffffffff -> 4294967295
  #将字符看成十六进制[0x表示二进制]的数，再转换为十进制整数
  ```

### 布尔值[bool]
布尔值只有两个值<code>True</code>和<code>False</code>，表示‘真’和‘假’

虽然布尔值只有两个值，但也可以进行转换，而且很比较常用

```python
False:整型[0]、空字符串、空列表、空字典、空元组、空集合
True:除False外均为True
```
```python
re = bool(变量)
```

### 字符串[str]
字符串或串(String)是由数字、字母、下划线组成的一串字符。
```python
str_0 = '要吃烧饼吗？'
str_0 = "要吃烧饼吗？"
str_0 = """
所以
要吃烧饼吗？
"""
# 字符串需要使用引号引起来，可使用'',"",""" """
# """ """支持多行表示一个字符串
```
+ 常见独有方法
    1. 删除字符串开头和结尾空格[strip()],得到新的字符串

        ```python
        str_1 = ' hello world! '
        print(str_1.strip())
        print(str_1)

        #*******cmd time******
        #hello world!
        # hello world! 
        ```

    2. （英文）字符串变大[upper()]/小写[lower()]，得到一个新字符串

        ```python
        str_1 = 'Do you want eat sb'
        str_u = str_1.upper()
        str_l = str_1.lower()
        print(str_u)
        print(str_l)
        print(str_1)

        #******cmd time******
        #DO YOU WANT EAT SB
        #do you want eat sb
        #Do you want eat sb
        ```

    3. 字符串内容替换，得到一个新字符串[replace('原字符','替换为')]

        ```python
        str_1 = 'Do you want drink Coca-Cola'
        str_2 = str_1.replace('Coca-Cola','Pepsi-Cola')
        print(str_2)
        print(str_1)

        #******cmd time******
        #Do you want drink Pepsi-Cola
        #Do you want drink Coca-Cola
        ```

    4. 字符串切割，得到一个列表[split()]

        ```python
        str_1 = '烧饼/肥宅快乐水/刑部尚书/经典打野刀'
        str_list = str_1.split('/')
        print(str_list)
        print(str_1)

        #******cmd time******
        #['烧饼', '肥宅快乐水', '刑部尚书', '经典打野刀']
        #烧饼/肥宅快乐水/刑部尚书/经典打野刀
        ```
    
    5. 字符串拼接，得到一个新字符串[join()]

        ```python
        str_list = ['烧饼', '肥宅快乐水', '刑部尚书', '经典打野刀']
        str_0 = '吃'.join(str_list)
        ptint(str_0)
        ptint(str_list)

        #******cmd time******
        #烧饼吃肥宅快乐水吃刑部尚书吃经典打野刀
        #['烧饼', '肥宅快乐水', '刑部尚书', '经典打野刀']
        ```

    6. 判断字符串是否已XX开头/结尾，返回bool值

        ```python
        str_1 = '烧饼好了'
        result_1s = str_1.startswith('烧饼')
        #字符串str_1是否以'烧饼'开头
        print(result_1s)
        result_1e = str_1.endswith('烧饼')
        #字符串str_1是否以'烧饼'结尾
        print(result_1e)
        print('*********妖娆的分隔符*********')

        str_2 = '请吃烧饼'
        result_2s = str_2.startswith('烧饼')
        print(result_2s)
        result_2e = str_2.endswith('烧饼')
        print(result_2e)

        #******cmd time*******
        #True
        #False
        #*********妖娆的分隔符*********
        #False
        #True
        ```
    7. 字符串格式化

        * %s
            ```python
            a = '亡下七武海'
            b = '亡不留行'
            print('这里有人原地去世，呼叫%s支援' % a)
            print('有了%s让你%s,居家好帮手%s' % (a,b,a))

            #******cmd time******
            #这里有人原地去世，呼叫亡下七武海支援
            #有了亡下七武海让你亡不留行,居家好帮手亡下七武海 
            ```
        * format
            ```python
            a = '亡下七武海'
            b = '亡不留行'
            print('这里有人原地去世，呼叫{}支援'.format(a))
            print('有了{}让你{},居家好帮手{}'.format(a,b,a))

            #******cmd time******
            #这里有人原地去世，呼叫亡下七武海支援
            #有了亡下七武海让你亡不留行,居家好帮手亡下七武海 
            ```
        * f
            ```python
            a = '亡下七武海'
            b = '亡不留行'
            print(f'这里有人原地去世，呼叫{a}支援')
            print('有了{a}让你{b},居家好帮手{a}')

            #******cmd time******
            #这里有人原地去世，呼叫亡下七武海支援
            #有了亡下七武海让你亡不留行,居家好帮手亡下七武海 
            ```

+ 公共功能

    1. 获取字符串长度[len()]
        ```python
        str_1 = 'fdaaaaaaaaaaaaaaaafsfs'
        print(len(str_1))

        #*******cmd time******
        #22
        ```
    
    2. 索引
        ```python
        str_1 = 'fdaaaaaaaaaaaaaaaafsfs'
        print(str_1[0])
        print(str_1[1])
        print(str_1[20])
        print(str_1[22])

        #******cmd time******
        #f #列表索引默认从零开始
        #d
        #f
        #发生异常: IndexError 
        #string index out of range
        #str_1[22]实际索引第23个值，超出索引范围就会报错
        ```

### 列表[list]

列表可以看作有序的容器，可以存放很多元素

```python

```

### 元组[tuple]

### 字典[dict]

### 集合[set]

### collection 系列

## 运算

### 算术运算

### 比较运算

### 赋值运算

### 逻辑运算

### 成员运算

### 身份运算

### 位运算

### 运算符优先级

## 字符编码与转码

### Unicode 和 UTF-8

### encode 和 decode

## 文件处理

### open

### with……open……as……

### r/w/a/+/U/b 模式

### readline/readlines/tell/seek/truncate/write 等

## 函数与装饰器

### 函数定义

### 函数作用域

### 函数参数

### 高阶函数与函数返回值

### lambda 匿名函数

### 装饰器原理

### 带参数的装饰器

### 装饰器应用

### 开放封闭原则

### 闭包概念

## 迭代器和生成器

### 迭代器原理

### next()方法和 iter()方法

### 迭代器应用

### 生成器原理

### yield 关键字

### 生成器应用

## 递归与反射

### 递归的特性

### 尾递归优化

### 反射的原理

### hasattr/getattr/setattr/deltte

## 内置方法

### 个内置方法

### copy 和 deepcopy

### map/filter

### functools

## 常用标准库

### re 模块

### os/sys 模块

### subprocess 模块

### shutil/shelve/itertools 模块

### hashlib 模块

### logging 日志模块

### time/datatime 模块

### traceback 模块

### json/pickle/xml/yaml/configparser 模块

### urllib 模块

### paramiko 模块

## 面向对象编程

### 面向对象简介

### 类和对象

### 经典类和新式类

### 面向对象三大特性:封装，继承，多态

### 类的普通成员

### 类的字段，方法，属性

### 类的高级成员

### 静态字段，静态方法，静态属性

### 类方法

### MateClass 和 AbstractClass

### 类成员修饰符

### 函数式编程与面向对象编程对比

### 面向对象编程的本质

## 程序开发规范

### 程序目录结构设计

### 程序模块划分设计

### 程序日志设计

### README

### 程序流程图

# 网络编程

## Socket 网络编程

### Socket 原理

### Socket 网络通信开发

### socketServer 模块源码刨析

### FTP 服务器开发

## 线程

### 线程操作

### 线程锁

### 信号

### 事件

### 线程池

### Python 的 GIL 锁内部机制

## 进程

### 进程操作

### 进程池

### 进程数据共享

## 协程

### greenlet

### Gevent

## select/poll/epoll 高性能 IO 多路复用

### 同步 IO

### 异步 IO

### select

### poll

### epoll

## 队列和 RabbitMQ

### RabbitMQ 介绍

### RabbitMQ 安装配置

### RabbitMQ 使用-pika 模块

### 生产者消费者模型

### SSH 审计服务器开发

## Memcached 和 Redis

### Memcached 介绍

### Memcached 使用

### Redis 安装配置

### Redis 使用-redis 模块

## MySQL 数据库

### MySQL 安装配置

### MySQL 数据类型

### MySQL 必备之变量和函数

### MySQL 必备之外键、索引和约束

### MySQL 必备之存储过程

### MySQL 必备之视图和触发器

### MySQL 必备之事务和游标

### 数据库设计三大范式

### SQL 语句

### Python 连接数据库

### 数据库连接池

## ORM 对象关系映射

### SQLAlchemy 介绍

### SQLAlchemy 核心

### SQLAlchemy ORM

# web 基础

## HTML

### HTML 文档结构

### HTML 标签

## CSS

### CSS 语法

### CSS 选择器

### CSS 常用属性

### 伪类

## JavaScript

### JavaScript 基础语法之变量和数据类型

### JavaScript 基础语法之函数

### JavaScript 基础语法之类和对象

### JavaScript 基础语法之原型

### JavaScript 之 DOM 操作

## BootStrap 框架

### BootStrap 布局

### BootStrap 应用

## jQuery 框架

### jQuety 选择器

### jQuety 属性和 CSS 操作

### jQuety 文档处理

### jQuety 筛选

### jQuety 事件

### jQuety 动画

### jQuety 拓展

### Ajax 原理及 jQuety Ajax

### JSON 原理及 jQuety JSON

## CSRF/Session/Cookie

### CSRF 的由来及实现

### Session 原理及应用

### Cookie 原理及应用

### FontAwesome

## 常用插件

### SweetAlert

### jQueryUI

### jQuery Validate

## Anjular JS

### Anjular JS 介绍

### 路由

### 指令

### Service 和 Provider

### Anjular JS 核心原理剖析

# web 框架

## WSGI 自定义开发 Web Server

### Web 框架本质

### Web 请求生命周期

### WSGI 介绍

### 自定义开发 Web 框架

## MVC 架构

### MVC 架构发展史

### MVC 架构组成

## Django 框架

### Django 路由系统

### Django 模板引擎

### Django 模型绑定

### Django Form 表单

### Django Session 和 Cookie

### Django 中间件介绍】

### 分页及自定义 tag

### Django 缓存

### XSS 和 CSRF

### Django 信号

### Django Admin

## Tornado 框架

### Tornado 框架介绍

### Tornado 源码剖析

## Python 其他 Web 框架

### Flask 框架学习

### Web.py 框架学习

### Bottle 框架学习

## 其他常用组件

### highchart 动态画图

### 分布式任务队列 Celery 学习

# 项目实战

## BBS 论坛项目开发

## Web 聊天室项目开发

## CRM 系统开发

## 购物商城项目开发

## 分布式监控项目开发

## CMDB 项目开发

## 主机管理项目开发

## 分布式爬虫项目开发

## Docker 管理平台项目开发

## OpenStack 二次开发

## 金融分析项目开发

## 机器学习项目开发

# 算法和设计模式

## 算法

### 算法定义

### 事件复杂度

### 冒泡排序

### 插入排序

### 快速排序

### 选择排序

### 二叉树及堆排序

## 设计模式

### 设计模式介绍

### 设计模式分类

### 设计模式六原则

### 常用设计模式

# 爬虫

## 爬虫基础

### 爬虫介绍

### 爬虫原理

### 下载页面-reuqests 模块

### 解析页面-BeautifulSoup 模块

### 异步 IO 模块-asyncio、aiohttp、gevent、Twisted、Taornado

## Scrapy 框架

### Command line tool

### Spiders

### Selectors

### Items

### Items Loaders

### Scpray shell

### Item Pipeline

### Requests and Responses

### Sttings

### Telnet Console

# 协作开发

## 敏捷开发和持续集成

### 软件开发团队工作流程

### 敏捷开发

### Jekins+SaltStack+Docker 实现持续集成开发

## 代码版本控制系统

### SVN 介绍

### Git 介绍

### Github 介绍
