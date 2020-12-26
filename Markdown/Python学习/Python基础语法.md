## Python 基础语法

### Python 编码规范

python 编写代码时建议遵循[PEP8](https://legacy.python.org/dev/peps/pep-0008/)规范，许多项目有自己的编码规范，当出现冲突时，项目自身的规范优先

### 变量和赋值

#### 变量

##### 变量命名规则

1.  不能使用 python 关键字，即标记不能提前被占用，python 关键字包括：


| 'and'   | 'as'     | 'assert' | 'break' | 'class'   | 'continue' | 'def'   | 'del'    |
| ------- | -------- | -------- | ------- | --------- | ---------- | ------- | -------- |
| 'elif'  | 'else'   | 'except' | 'exec'  | 'finally' | 'for'      | 'from'  | 'global' |
| 'if'    | 'import' | 'in'     | 'is'    | 'lambda'  | 'not'      | 'or'    | 'pass'   |
| 'print' | 'raise'  | 'return' | 'try'   | 'while'   | 'with'     | 'yield' |          |

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