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
     list_0.insert(0,'圣母玛利亚')
     print(list_0)

     #******cmd time******
     #['小泽玛利亚', 12, 97, True, 'Asymmetry', False, 'red']
     ```

  3. 扩展[extend()]，在原列表的尾部追加另一列表的元素

     ```python
     list_0 = [12,97,True,'Asymmetry',False,'red']
     list_1 = ['圣女贞德','圣母玛利亚','南丁格尔']
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