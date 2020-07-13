# Python 基础

## Python 基础语法

### Python 编码规范

python 编写代码时建议遵循[PEP8](https://legacy.python.org/dev/peps/pep-0008/)规范，许多项目有自己的编码规范，当出现冲突时，项目自身的规范优先

### 变量和赋值

#### 变量

##### 变量命名规则

1.  不能使用 python 关键字，即标记不能提前被占用，python 关键字包括：

|||||||||
|---|---|---|---|---|---|---|---|
|'and'|'as'| 'assert'| 'break'| 'class'| 'continue'| 'def'| 'del'|
| 'elif'| 'else'| 'except'| 'exec'| 'finally'| 'for'| 'from'| 'global'|
| 'if'| 'import'| 'in'| 'is'| 'lambda'| 'not'| 'or'| 'pass'|
| 'print'| 'raise'| 'return'| 'try'| 'while'| 'with'| 'yield'|

2.  变量名的**第一个字符**不能为**数字** 

3.  变量名只能是**字母、数字、下划线**(\_)的任意组合

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

- 常见独有方法

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

  3. 字符串内容替换，得到一个新字符串[replace()]

     ```python
     str_1 = 'Do you want drink Coca-Cola'
     str_2 = str_1.replace('Coca-Cola','Pepsi-Cola')
     #replace('原字符','替换为')
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

  6. 判断字符串是否已 XX 开头/结尾，返回 bool 值

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

     - %s

       ```python
       a = '亡下七武海'
       b = '亡不留行'
       print('这里有人原地去世，呼叫%s支援' % a)
       print('有了%s让你%s,居家好帮手%s' % (a,b,a))

       #******cmd time******
       #这里有人原地去世，呼叫亡下七武海支援
       #有了亡下七武海让你亡不留行,居家好帮手亡下七武海
       ```

     - format

       ```python
       a = '亡下七武海'
       b = '亡不留行'
       print('这里有人原地去世，呼叫{}支援'.format(a))
       print('有了{}让你{},居家好帮手{}'.format(a,b,a))

       #******cmd time******
       #这里有人原地去世，呼叫亡下七武海支援
       #有了亡下七武海让你亡不留行,居家好帮手亡下七武海
       ```

     - f

       ```python
       a = '亡下七武海'
       b = '亡不留行'
       print(f'这里有人原地去世，呼叫{a}支援')
       print('有了{a}让你{b},居家好帮手{a}')

       #******cmd time******
       #这里有人原地去世，呼叫亡下七武海支援
       #有了亡下七武海让你亡不留行,居家好帮手亡下七武海
       ```

- 公共功能

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
list_0 = [12,97,True,'Asymmetry',False,'red']
```

- 常用方法

  1. 追加[append()]，在原列表尾部追加值

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red']
     int_1 = 99
     str_2 = 'ntr'
     list_0.append(int_1)
     list_0.append(str_1)
     print(list_0)

     #******cmd time******
     #[12, 97, True, 'Asymmetry', False, 'red', 99, 'ntr']
     ```

  2. 插入[insert()]，在原列表指定位置插入

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red']
     list_0.insert(0,'小泽玛利亚')
     print(list_0)

     #******cmd time******
     #['小泽玛利亚', 12, 97, True, 'Asymmetry', False, 'red']
     ```

  3. 扩展[extend()]，在原列表的尾部追加另一列表的元素

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red']
     list_1 = ['苍井空','小泽玛利亚','泷泽萝拉']
     list_0.extend(list_1)
     print(list_0)

     #******cmd time******
     #[12, 97, True, 'Asymmetry', False, 'red', '苍井空', '小泽玛利亚', '泷泽萝拉']
     ```

  4. 删除[remove()]，在列表中根据值删除（从左到右第一个）

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red',   True]
     list_0.remove(True)
     print(list_0)

     #******cmd time******
     #[12, 97, 'Asymmetry', False, 'red', True]
     ```

  5. 移除[pop()]，从原列表中移除某个元素

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red',   True,'厄舍府']
     value = list_0.pop() #默认移除最后一个
     v = list_0.pop(5)
     print(value + ' & ' + v)

     #******cmd time******
     # 厄舍府 & red
     ```

  6. 清空[clear()]，清空原列表

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red',   True,'厄舍府']
     list_0.clear()
     print(list_0)

     #******cmd time******
     #[]
     ```

  7. 反转[reverse()]，反转原列表

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red',   True,'厄舍府']
     list_0.reverse()
     print(list_0)

     #*******cmd time******
     #['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     ```

- Other

  1. 获取长度[len()]

     ```python
     list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     print(len(list_0))

     #******cmd time******
     #8
     ```

  2. 索引

     ```python
     list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     print(list_0[0])
     print(list_0[5])
     print(list_0[7])

     #******cmd time******
     #厄舍府
     #True
     #12
     ```

     - 根据索引替换元素

       ```python
       list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
       list_0[5] = '鲨鱼辣椒'
       print(list_0)

       #******cmd time******
       #['厄舍府', True, 'red', False, 'Asymmetry', '鲨鱼辣椒', 97, 12]
       ```

     - 根据索引删除元素

       ```python
       list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
       del list_0[7]
       print(list_0)

       #******cmd time******
       #['厄舍府', True, 'red', False, 'Asymmetry', True, 97]
       ```

  3. 切片(左闭右开)

     ```python
     list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     print(list_0[0:2])
     print(list_0[1:])
     print(list_0[:5])
     print(list_0[:-1])

     #******python******
     #['厄舍府', True]
     #[True, 'red', False, 'Asymmetry', True, 97, 12]
     #['厄舍府', True, 'red', False, 'Asymmetry']
     #['厄舍府', True, 'red', False, 'Asymmetry', True, 97]
     ```

  4. 步长

     ```python
     list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     print(list_0[0:7:2])
     print(list_0[1::2])
     print(list_0[::-1])
     print(list_0[:-2:-1])

     #******cmd time******
     # ['厄舍府', 'red', 'Asymmetry', 97]
     #[True, False, True, 12]
     #[12, 97, True, 'Asymmetry', False, 'red', True, '厄舍府']
     #[12]
     ```

  5. for 循环

     ```python
     list_0 = ['厄舍府', True, 'red', False, 'Asymmetry', True, 97, 12]
     for item in list_0:
         print(item)

     #******cmd time******
     #厄舍府
     #True
     #red
     #False
     #Asymmetry
     #True
     #97
     #12
     ```

  - 嵌套

    ```python
    list_0 = ['厄舍府', True, 'red', False, 'Asymmetry',['蟑螂恶霸','蜘蛛侦探','蝎子莱莱'], True, 97, 12]
    print(list_0[5][0])
    print(list_0[5][2])

    #******cmd time******
    #蟑螂恶霸
    #蝎子莱莱
    ```

### 元组[tuple]

元组与列表类似，也是一个容器，但不同的是，元祖中的元素不可以进行修改

```python
tup_0 = (123,223,323,'扶地魔','青铜树',True)
```

- Other（参考列表）

  1. 获取长度[len()]
  2. 索引
  3. 切片
  4. 步长
  5. for 循环

  - 嵌套

    ```python
    tup_1 = ([123,223,323],'扶地魔','青铜树',True)
    tup_2 = ((123,223,323),'扶地魔','青铜树',True)
    ```

    - 注：组中的元素不可修改，但元组中元素(非元组)的元素可以修改

      ```python
      tup_1 = ([123,223,323],'扶地魔','青铜树',True)
      tup_1[0][1] = 99
      print(tup_1)

      #******cmd time******
      #([123, 99, 323], '扶地魔', '青铜树', True)
      ```

### 字典[dict]

字典依然是个容器，但与列表、元组不同的是字典中的元素必须是键值对

```python
dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
# 注：字典的key必须可哈希[int/bool/str/tuple]
```

- 常用方法

  1. 获取

     - 获取键[keys()]

       ```python
       dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
       data = dict_0.keys()
       print(data)

       #******cmd time******
       #dict_keys(['id', 'psw', '烧饼'])
       ```

     - 获取值[values()]

       ```python
       dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
       data = dict_0.values()
       print(data)

       #******cmd time******
       #dict_values(['狂炫酷拽哔炸天', '1334567', ['123', 223]])
       ```

     - 获取键值对[item()]

       ```python
       dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
       data = dict_0.items()
       print(data)

       #******cmd time******
       #dict_items([('id', '狂炫酷拽哔炸天'), ('psw', '1334567'), ('烧饼', ['123', 223])])
       ```

     - for 循环
       ```python
       #键
       for key in dict_0.keys():
       #值
       for value in dict_0.values():
       #键值对
       for key,value in dict_0.items():
       ```

  2. 更新键值对[update()]

     ```python
     dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
     dict_0.update({'id':'你想吃烧饼吗','psw':8787587})
     print(dict_0)

     #******cmd time******
     #{'id': '你想吃烧饼吗', 'psw': 8787587, '烧饼': ['123', 223]}
     ```

  3. 移除键值对[pop()]

     ```python
     dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
     pop_data = dict_0.pop('烧饼',None)
     #pop方法是根据键查找对应键值对并移除，同时返回对应值
     #dict_0.pop('烧饼')当字典内中没有查找的键时则报错，
     #dict_0.pop('烧饼',None)当字典内中没有查找的键时则返回None
     print(dict_0)
     print(pop_data)

     #******cmd time******
     #{'id': '狂炫酷拽哔炸天', 'psw': '1334567'}
     #['123', 223]
     ```

  4. 根据键获取值[get()]

     ```python
     dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
     data = dict_0.get('烧饼',None)
     #get方法是根据键查找对应键值对，并返回对应值
     #dict_0.get('烧饼')当字典内中没有查找的键时则报错，
     #dict_0.get('烧饼',None)当字典内中没有查找的键时则返回None
     print(dict_0)
     print(data)

     #******cmd time******
     #{'id': '狂炫酷拽哔炸天', 'psw': '1334567', '烧饼': ['123', 223]}
     #['123', 223]
     ```

- Other【字典的增查删改】

  - 增

    ```python
    dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
    dict_0['name'] = '青蚨'
    print(dict_0)

    #******cmd time******
    #{'id': '狂炫酷拽哔炸天', 'psw': '1334567', '烧饼': ['123', 223], 'name': '青蚨'}
    ```

  - 查

    ```python
    dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
    id_code =  dict_0['id']
    print(id_code)

    #******cmd time******
    #狂炫酷拽哔炸天
    ```

  - 删

    ```python
    dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
    del dict_0['烧饼']
    print(dict_0)

    #******cmd time******
    #{'id': '狂炫酷拽哔炸天', 'psw': '1334567'}
    ```

  - 改

    ```python
    dict_0 = {'id':'狂炫酷拽哔炸天','psw':'1334567','烧饼':['123',223]}
    dict_0['psw'] = 1234567
    print(dict_0)

    #******cmd time******
    #{'id': '狂炫酷拽哔炸天', 'psw': 1234567, '烧饼': ['123', 223]}
    ```

### 集合[set]

集合同样用于做容器，但集合与其他容器的不同在于<code>元素不重复、元素可哈希、无序</code>

```python
set_0 = {11,55,'哈皮',True,'凉皮'}
#集合与字典都使用｛｝，但字典中存入的是键值对，集合中存的是值
```

- 常用方法

  1. 添加元素[add()]

     ```python
     set_0 = {11,55,'哈皮',True,'凉皮'}
     set_0.add('油泼面')
     print(set_0)

     #******cmd time******
     #{True, '油泼面', '哈皮', 11, '凉皮', 55}
     ```

  2. 删除元素[discard()]

     ```python
     set_0 = {11,55,'哈皮',True,'凉皮'}
     set_0.discard('哈皮')
     print(set_0)

     #******cmd time******
     #{True, '凉皮', 11, 55}
     ```

  3. 交集[&][intersection()]

     ```python
     set_1 = {'德芙巧克力','香草味八喜','可可布朗尼'}
     set_2 = {'德芙巧克力','可可布朗尼','榴莲','菠萝蜜','芝士玉米粒','鸡汁土豆泥','黑椒牛里脊','黄焖辣子鸡'}
     set_3 = set_1 & set_2
     set_4 = set_1.intersection(set_2)
     print(set_3)
     print(set_4)
     #******cmd time******
     #{'可可布朗尼', '德芙巧克力'}
     #{'可可布朗尼', '德芙巧克力'}
     ```

  4. 并集[|][union()]

     ```python
     set_1 = {'德芙巧克力','香草味八喜','可可布朗尼'}
     set_2 = {'德芙巧克力','可可布朗尼','榴莲','菠萝蜜','芝士玉米粒','鸡汁土豆泥','黑椒牛里脊','黄焖辣子鸡'}
     set_3 = set_1 | set_2
     set_4 = set_1.union(set_2)
     print(set_3)
     print(set_4)

     #******cmd time******
     #{'德芙巧克力', '黄焖辣子鸡', '菠萝蜜', '可可布朗尼', '香草味八喜', '鸡汁土豆泥', '榴莲', '芝士玉米粒', '黑椒牛里脊'}
     #{'德芙巧克力', '黄焖辣子鸡', '菠萝蜜', '可可布朗尼', '香草味八喜', '鸡汁土豆泥', '榴莲', '芝士玉米粒', '黑椒牛里脊'}
     ```

  5. 差集[-][difference()]

     ```python
     set_1 = {'德芙巧克力','香草味八喜','可可布朗尼'}
     set_2 = {'德芙巧克力','可可布朗尼','榴莲','菠萝蜜','芝士玉米粒','鸡汁土豆泥','黑椒牛里脊','黄焖辣子鸡'}
     set_3 = set_1 - set_2
     set_4 = set_1.difference(set_2)
     print(set_3)
     print(set_4)

     #******cmd time******
     #{'香草味八喜'}
     #{'香草味八喜'}
     ```

- Other

  - 获取长度
  - 因集合无序所以无索引、切片、步长等功能
  - for 循环

### collection 系列

## 运算

### 算术运算

| 运算符 | 说明                   | 实例      | 结果 |
| ------ | ---------------------- | --------- | ---- |
| +      | 加                     | 1 + 1     | 2    |
| -      | 减                     | 100 - 1   | 99   |
| \*     | 乘                     | 9 \* 9    | 81   |
| /      | 除                     | 100 / 16  | 6.25 |
| //     | 整除（只保留整数部分） | 100 // 9  | 11   |
| %      | 取余数                 | 100 % 9   | 10   | 1 |
| \*\*   | 幂/次方运算            | 2 \*\* 10 | 1024 |

### 比较运算

| 运算符 | 说明     |
| ------ | -------- |
| >      | 大于     |
| <      | 小于     |
| ==     | 等于     |
| >=     | 大于等于 |
| <=     | 小于等于 |
| !=     | 不等于   |

### 赋值运算

| 运算符 | 说 明            | 用法举例  | 等价形式     |
| ------ | ---------------- | --------- | ------------ |
| =      | 最基本的赋值运算 | x = y     | x = y        |
| +=     | 加赋值           | x += y    | x = x + y    |
| -=     | 减赋值           | x -= y    | x = x - y    |
| \*=    | 乘赋值           | x \*= y   | x = x \* y   |
| /=     | 除赋值           | x /= y    | x = x / y    |
| %=     | 取余数赋值       | x %= y    | x = x % y    |
| \*\*=  | 幂赋值           | x \*\*= y | x = x \*\* y |
| //=    | 取整数赋值       | x //= y   | x = x // y   |

### 逻辑运算

| 逻辑运算符 | 含义                           | 基本格式 | 说明                                                                                      |
| ---------- | ------------------------------ | -------- | ----------------------------------------------------------------------------------------- |
| and        | 逻辑与运算，等价于数学中的“且” | a and b  | 当 a 和 b 两个表达式都为真时，a and b 的结果才为真，否则为假。                            |
| or         | 逻辑或运算，等价于数学中的“或” | a or b   | 当 a 和 b 两个表达式都为假时，a or b 的结果才是假，否则为真。                             |
| not        | 逻辑非运算，等价于数学中的“非” | not a    | 如果 a 为真，那么 not a 的结果为假；如果 a 为假，那么 not a 的结果为真。相当于对 a 取反。 |

### 成员运算

| 运算符 | 描述                                                              |
| ------ | ----------------------------------------------------------------- |
| in     | 如果在指定的序列中找到一个变量的值，则返回 true，否则返回 false。 |
| not in | 如果在指定序列中找不到变量的值，则返回 true，否则返回 false。     |

### 身份运算

| 运算符 | 说明                             |
| ------ | -------------------------------- |
| is     | 判断两个变量所引用的对象是否相同 |
| is not | 判断两个变量所引用的对象是否不同 |

### 位运算

按位运算符是把数字看作二进制来进行计算的。
| 运算符 | 说 明 | 用法举例 | 等价形式 |
| ------ | ------------ | -------- | ------------------------------------- |
| & | 按位与赋值 | x &= y | x = x & y |
| \| | 按位或赋值 | x \|=y | x = x \| y |
| ^ | 按位异或赋值 | x ^= y | x = x ^ y |
| << | 左移赋值 | x <<= y | x = x << y，这里的 y 指的是左移的位数 |
| >> | 右移赋值 | x >>= y | x = x >> y，这里的 y 指的是右移的位数 |

### 运算符优先级

| 运算符                      | 描述                                                   |
| --------------------------- | ------------------------------------------------------ |
| \*\*                        | 指数 (最高优先级)                                      |
| ~ + -                       | 按位翻转, 一元加号和减号 (最后两个的方法名为 +@ 和 -@) |
| \* / % //                   | 乘，除，取模和取整除                                   |
| + -                         | 加法减法                                               |
| >> <<                       | 右移，左移运算符                                       |
| &                           | 位 'AND'                                               |
| ^ \|                        | 位运算符                                               |
| <= < > >=                   | 比较运算符                                             |
| <> == !=                    | 等于运算符                                             |
| = %= /= //= -= += \*= \*\*= | 赋值运算符                                             |
| is is not                   | 身份运算符                                             |
| in not in                   | 成员运算符                                             |
| not and or                  | 逻辑运算符                                             |

## 字符编码与转码

### Unicode 和 UTF-8

- Unicode

  世界上存在着多种编码方式，同一个二进制数字可以被解释成不同的符号。因此，要想打开一个文本文件，就必须知道它的编码方式，否则用错误的编码方式解读，就会出现乱码。有一种编码，将世界上所有的符号都纳入其中。每一个符号都给予一个独一无二的编码，那么乱码问题就会消失，这就是 Unicode。

  Unicode 当然是一个很大的集合，现在的规模可以容纳 100 多万个符号。每个符号的编码都不一样，比如，U+0639 表示阿拉伯字母 Ain，U+0041 表示英语的大写字母 A，U+4E25 表示汉字严。具体的符号对应表，可以查询 unicode.org，或者专门的汉字对应表。

  需要注意的是，Unicode 只是一个符号集，它只规定了符号的二进制代码，却没有规定这个二进制代码应该如何存储。

  比如，汉字严的 Unicode 是十六进制数 4E25，转换成二进制数足足有 15 位（100111000100101），也就是说，这个符号的表示至少需要 2 个字节。表示其他更大的符号，可能需要 3 个字节或者 4 个字节，甚至更多。

  这里就有两个严重的问题，第一个问题是，如何才能区别 Unicode 和 ASCII ？计算机怎么知道三个字节表示一个符号，而不是分别表示三个符号呢？第二个问题是，我们已经知道，英文字母只用一个字节表示就够了，如果 Unicode 统一规定，每个符号用三个或四个字节表示，那么每个英文字母前都必然有二到三个字节是 0，这对于存储来说是极大的浪费，文本文件的大小会因此大出二三倍，这是无法接受的。

  它们造成的结果是：

  1. 出现了 Unicode 的多种存储方式，也就是说有许多种不同的二进制格式，可以用来表示 Unicode。
  2. Unicode 在很长一段时间内无法推广，直到互联网的出现。

- UTF-8
  互联网的普及，强烈要求出现一种统一的编码方式。UTF-8 就是在互联网上使用最广的一种 Unicode 的实现方式。其他实现方式还包括 UTF-16（字符用两个字节或四个字节表示）和 UTF-32（字符用四个字节表示），不过在互联网上基本不用。重复一遍，这里的关系是，UTF-8 是 Unicode 的实现方式之一。

  UTF-8 最大的一个特点，就是它是一种变长的编码方式。它可以使用 1~4 个字节表示一个符号，根据不同的符号而变化字节长度。

  UTF-8 的编码规则很简单，只有二条：

  1. 对于单字节的符号，字节的第一位设为 0，后面 7 位为这个符号的 Unicode 码。因此对于英语字母，UTF-8 编码和 ASCII 码是相同的。

  2. 对于 n 字节的符号（n > 1），第一个字节的前 n 位都设为 1，第 n + 1 位设为 0，后面字节的前两位一律设为 10。剩下的没有提及的二进制位，全部为这个符号的 Unicode 码。

  下表总结了编码规则，字母 x 表示可用编码的位。

  | Unicode 符号范围(十六进制) | UTF-8 编码方式（二进制）            |
  | -------------------------- | ----------------------------------- |
  | 0000 0000-0000 007F        | 0xxxxxxx                            |
  | 0000 0080-0000 07FF        | 110xxxxx 10xxxxxx                   |
  | 0000 0800-0000 FFFF        | 1110xxxx 10xxxxxx 10xxxxxx          |
  | 0001 0000-0010 FFFF        | 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx |

  跟据上表，解读 UTF-8 编码非常简单。如果一个字节的第一位是 0，则这个字节单独就是一个字符；如果第一位是 1，则连续有多少个 1，就表示当前字符占用多少个字节。

  下面，还是以汉字严为例，演示如何实现 UTF-8 编码。

  严的 Unicode 是 4E25（100111000100101），根据上表，可以发现 4E25 处在第三行的范围内（0000 0800 - 0000 FFFF），因此严的 UTF-8 编码需要三个字节，即格式是 1110xxxx 10xxxxxx 10xxxxxx。然后，从严的最后一个二进制位开始，依次从后向前填入格式中的 x，多出的位补 0。这样就得到了，严的 UTF-8 编码是 11100100 10111000 10100101，转换成十六进制就是 E4B8A5。

<p align="right">https://www.cnblogs.com/tsingke/p/10853936.html</p>
<p align="right">——Tsingke[博客园]</p>

### encode 和 decode

- encode
  encode()是字符串中的方法，用于将 str 类型转换为 bytes 类型，这个过程称为编码

  ```python
  str.encode(encoding="utf-8",errors="strict")
  ```

  - encoding
    - encoding 默认为 utf-8
    - 当只有 encoding 一个参数时，'encoding='可以省略
    - ->str.encode('utf-8')
  - erros

    指定错误处理方式，可选：

    - stict[默认参数]：遇到非法字符抛出错误
    - ignore：忽略非法字符
    - replace：用'?'替换非法字符
    - xmlcharrefreplace：使用 xml 的字符引用

- decode
  decode()的功能与 encode()相反，decode()是将 bytes 类型的二进制数据装换为 str 类型，这个过程即为解码

  ```python
  bytes.encode(encoding="utf-8",errors="strict")
  ```

  - encoding
    - encoding 默认为 utf-8
    - 当只有 encoding 一个参数时，'encoding='可以省略
    - ->str.encode('utf-8')
  - erros

    指定错误处理方式，可选：

    - stict[默认参数]：遇到非法字符抛出错误
    - ignore：忽略非法字符
    - replace：用'?'替换非法字符
    - xmlcharrefreplace：使用 xml 的字符引用

## 文件处理

### open & close

open()方法用于打开一个文件，并返回文件对象，在对文件进行处理的时候都需要使用到这个函数

当我们写文件时，操作系统往往不会立刻把数据写入磁盘，而是放到内存缓存起来，空闲的时候再慢慢写入。只有调用 close()方法时，操作系统才保证把没有写入的数据全部写入磁盘。忘记调用 close()的后果是数据可能只写了一部分到磁盘，剩下的丢失了。

```python
#常用形式
file_0 =  open(file,mode = '')
file_0.close()
#完整形式
file_0 = open(file, mode = '' , buffering = -1 , encoding = None , errors = None , newline = None , closefd = True , opener = None)
file_0.close()
```

参数说明：

- file：文件路径
- mode：文件打开模式
- buffering：设置缓冲
- enconding：编码方式，一般 utf-8
- errors：报错级别
- newline：区分换行符
- closefd：传入的 file 参数设置
- opener

### with open……as……

open()方法出现异常时就会抛出错误 close()方法无法执行,也可能因为忘记 close()导致数据丢失，于是<code>wtih open……as</code>应运而生

```python
with open('文件路径',mode = '') as f:
    f.write('hello world!')
```

### mode 模式

| 模式 | 描述                                                                                                                                                           |
| ---- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| t    | 文本模式[默认]                                                                                                                                                 |
| x    | 写模式，新建一个文件，如果文件已存在则会报错                                                                                                                   |
| b    | 二进制模式                                                                                                                                                     |
| +    | 打开一个文件进行更新[可读可写]                                                                                                                                 |
| U    | 通用换行模式                                                                                                                                                   |
| r    | 以只读方式打开，文件指针将会放在文件的开头                                                                                                                     |
| rb   | 以二进制格式打开文件用于只读，文件指针将会放在文件开头，一般用于非文本文件如图片等                                                                             |
| r+   | 打开一个文件用于读写，文件指针将会放在文件的开头                                                                                                               |
| rb+  | 以二进制格式打开一个文件用于读写                                                                                                                               |
| w    | 打开一个文件只用于写入，如果该文件已存在则打开文件，并从头开始编辑，即原有内容会被删除。如果该文件不存在，创建新文件夹                                         |
| wb   | 以二进制打开一个文件只用于写入。如果该文件存在则打开文件，并从头开始编辑，即原有内容会被删除。如果该文件不存在，创建新文件。一般用于非文本文件                 |
| w+   | 打开一个文件用于读写，如果该文件已存在则打开文件，并从头开始编辑，即原有内容会被删除。如果该文件不存在，创建新文件                                             |
| wb+  | 以二进制格式打开一个文件用于读写，如果该文件已存在则打开文件，并从头开始编辑，即原有内容会被删除。如果该文件不存在，创建新文件。一般用于非文本文件             |
| a    | 打开一个文件用于追加。如果该文件已存在，文件指针将会放在文件结尾。也就是说，新的内容将会被写入到已有文件之后，。如果文件不存在创建新文件进行写入               |
| ab   | 以二进制打开一个文件用于追加。如果该文件以存在，文件指针将会放在文件的结尾。也就是说，新的内容将会被写入到已有内容之后。如果该文件不存在，创建新文件进行写入。 |
| a+   | 打开一个文件用于读写。如果该文件已存在，文件指针将会放在文件的结尾。文件打开时会是追加模式。如果该文件不存在，创建新文件用于读写。                             |
| ab+  | 以二进制格式打开一个文件用于追加。如果该文件已存在，文件指针将会放在文件的结尾。如果该文件不存在，创建新文件用于读写。                                         |

### readline/readlines/tell/seek/truncate/write/writelines 等

- readline
  ```python
  file.readline([size])
  # 读取整行，包括"\n"字符
  ```
- readlines
  ```python
  file.readlines([sizeint])
  # 读取所有行并返回列表，若给定sizeint > 0，则是设置一次读取多少字节(为减少读取压力)
  ```
- tell
  ```python
  file.tell()
  # 返回文件当前位置
  ```
- seek
  ```python
  file.seek(offset,[whence])
  # 设置文件当前位置
  ```
- truncate
  ```python
  file.truncate([size])
  # 截取文件，截取的字节通过size指定，默认为当前文件位置
  ```
- write
  ```python
  file.write([str])
  # 将字符串写入文件，返回的是写入字符串的长度
  ```
- wirtelines
  ```python
  file.writelines([sequence])
  # 向文件写入一个序列字符串列表，如果需要换行则需要自己加入每行的换行符
  ```

## 函数与装饰器

### 函数定义

python 中函数是组织好的，可重复使用的的，用来实现单一或相关联功能的代码。

函数可以提高应用的模块性和代码的重复利用率

- 函数代码块以<code>def</code>开头，后跟函数名和圆括号
- 传入的参数和变量须在圆括号中
- 函数第一行可以选择性的使用文档字符串来存放说明
- 函数内容以冒号起始，并且缩进
- <code>return [表达式]</code>结束函数，选择性的返回一个值给调用方，无<code>return</code>相当于返回 None

```python
def print_str(str):
  print(str)
  return 1

str_0 = input('请输入字符串：')
result = print_str(str_0)
print(result)
#******cmd time******
#请输入字符串：卖烧饼嘞
#卖烧饼嘞
#1

```

### 函数作用域

python 中函数作用域分为

- L(local):局部作用域，即函数中定义的变量
- E(enclosing):嵌套的父级函数的局部作用域，即包含此函数的上级函数的局部作用域，但是不是全局的
- G(global):全局变量，即模块级别定义的变量
- B(built-in):系统固定模块里的变量
  优先级次序依次为：L > E > G > B

### 函数参数

形参：在定义函数时声明的位置的变量（def func([形参])），表示该函数需要 XX
实参：调用函数时传递给参数的值（a = func([实参])）
传参：将实参传递给形参的过程叫做传参

#### 必需参数（位置参数）

必须参数调用时须以正确的顺序和数量传入函数否则因会因找不到参数而报错

```python
def func(int_1,int_2):
  "求两数的商"
  return int(int_1)/int(int_2)

a = input('被除数：')
b = input('除数：')
c = func(a,b)
print(f'商为：{c}')

#******cmd time******
#被除数：99
#除数：3
#商为：33.0

```

```python
def func(int_1,int_2):
  "求两数的商"
  return int(int_1)/int(int_2)

a = input('被除数：')
b = input('除数：')
c = func(a,b)
print(f'商为：{c}')

#******cmd time******
#被除数：99
#除数：
#发生异常: ValueError
#invalid literal for int() with base 10: ''

```

#### 关键字参数

关键字参数和函数调用关系密切，函数调用使用关键字参数来确定传入的参数值，但实际上与必需参数差在顺序上了

```python
def func(int_1,int_2):
  "求两数的商"
  return int(int_1)/int(int_2)

a = input('被除数：')
b = input('除数：')
c = func(int_2 = b,int_1 = a)
print(f'商为：{c}')

#******cmd time******
#被除数：99
#除数：3
#商为：33.0

```

#### 默认参数

调用函数时，如果没有传递参数，则会使用默认参数

```python
def func(int_0, int_1 = 7):
  return int(int_0)/int(int_1)

a = input('被除数：')
c = func(a)
print(f'商为：{c}')

#******cmd time******
#被除数：55
#商为：7.857142857142857
```

#### 不定长参数

python 的方法中参数可以传递制定个值也可以传递不定个参数，可以使用[*]or[**]加形参来接受

```python
def func(a , b , c = 33 , *args , **kargs):
  print('a',a,type(a))
  print('b',b,type(b))
  print('c',c,type(c))
  print('args:',args,type(args))
  print('kargs:',kargs,type(kargs))

func(11, 22, 33, 44, 55, 豆豆 = 66, 皮皮 = 77)

#******cmd time******
#a 11 <class 'int'>
#b 22 <class 'int'>
#c 33 <class 'int'>
#args: (44, 55) <class 'tuple'>
#kargs: {'豆豆': 66, '皮皮': 77} <class 'dict'>
```

### 高阶函数

一个函数就可以接收另一个函数作为参数，这种函数就称之为高阶函数，如<code>map()</code>

```python
def add(x, y, f):
    return f(x) + f(y)
x = -5
y = 6
f = abs
print(add(-5, 6, abs))
#******cmd time******
#11
```

### lambda 匿名函数

为了解决一些简单的需求而设计的函数
匿名函数是指通过 name 查看时没有自己的名字，都叫做 lambda

```python
def func_1(x):
  return x**x

func_2 = lambda x:x**x
"""
函数名 = lambda 参数:返回值
"""
x = 5
print(func_1(x))
print(func_2(x))
#******cmd time******
#3125
#3125
```

## 装饰器（语法糖）

### 闭包概念

闭包之修真解释法

```python
#天道v1.0.py

def 小世界1号():
    生灵 = '三魂七魄'
    内容 = '天道残缺，于是不久后小世界嗝儿屁了'
    #天道残缺，轮回有失
    #至此（函数结束）生灵死亡，三魂七魄也随之消散
    return '世界残骸'

def 一系列操作(极品材料):
    内容 = '元婴修士不能说的秘密'
    return '法宝'

神兵 = 一系列操作(小世界1号())
```

```python
#天道v1.1(地府补丁版).py
def 小世界1号():
    生灵 = '三魂七魄'
    内容 = '天道残缺，于是不久后小世界嗝儿屁了'
    #天道残缺，轮回有失
    魂魄 = 生灵
    def 地府(魂魄): #打上地府补丁，保亡魂不灭
        亡灵 = 魂魄
        print('地下城欢迎您')
    return 地府

修士1号 = '女娲的小手办'
天道的小广告 = 小世界1号()(修士1号)
```



### 装饰器原理

装饰器本质上是一个 Python 函数或类，它可以让其他函数或类在不需要做任何代码修改的前提下增加额外功能，装饰器的返回值也是一个函数/类对象。

```python
# 如果将函数看成一辆车，装饰器就是为车加上涂装，内饰，保险杠
# 等外挂装备？但车还是那辆车

def 涂装(func):
    def 玛莎拉蒂涂装():
        print('玛莎拉蒂外壳')
        return func()
    return 玛莎拉蒂涂装

@涂装 # @就是装饰器的语法糖
def 五菱宏光超跑():
    print('这是一辆超跑')
    
五菱宏光超跑()
"""
# 如果不用语法糖，装饰器就是这种姿势

五菱宏光超跑 = 涂装(五菱宏光超跑)
五菱宏光超跑()
"""

```



### 带参数的装饰器

### 装饰器应用

### 开放封闭原则

通常情况下，软件一旦上线就应该遵循开放封闭原则，即对修改封闭，对拓展开放

拓展开放需要遵循两个原则：

1.  不修改源代码
2.  不修改函数调用方式

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