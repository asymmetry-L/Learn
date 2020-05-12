# JavaScript

## JavaScript 介绍、实现、输出

### JavaScript 介绍

JavaScript 是互联网上最流行的脚本语言，这门语言可用于 WEB 和 HTML，更广泛用于服务器、PC 端，移动端。

JavaScript 脚本语言：

- JavaScript 是一种轻量级的编程语言

- JavaScript 是可插入 HTML 页面的编程代码

- JavaScript 插入 HTML 页面后，可由所有浏览器执行

### JavaScript 实现

1. 用法

   HTML 中的脚本必须位于<code>< script >< /script ></code>标签之间或<code>< script src='js文件' >< /script ></code>
   
   脚本可被放置在HTML的页面的<code>< body ></code >**主要**和<code>< head ></code>部分中
   
2. JavaScript标签

    在HTML中插入JavaScript，使用<code>< script ></code>标签

    在<code>< script ></></code>之间书写代码

3. JavaScript使用限制

    在HTML中1，不限制脚本数量

    通常会把脚本放置于<code>< head ></code>标签中，以不干扰页面内容

### JavaScript 输出

1.  document.write()

    将内容写入到HTML文档中

    当文档加载完后执行<code>document.write()</code>，html页面将被覆盖

    ```html
    <!DOCTYPE html>
    <html>
    <head lang="en">
    	<meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <script>
        	document.write("<h1>标签h1</h1>");
        </script>
    </body>
    ```

2.  document.getElementById(id)

    通过<code>id</code>来标识元素，并通过<code>innerHTML</code>来获取或插入元素内容

    ```html
    <!DOCTYPE html>
    <html>
    <head lang="en">
    	<meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <h1 id="ht">这里是一个标题</h1>
        <script>
        	document.getElementById("ht").innerHTML = "这是一个假的标题"
        </script>
    </body>
    ```

3.  window.alert()

    使用警告框来显示数据

    ```html
    <!DOCTYPE html>
    <html>
    <head lang="en">
    	<meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <h1 id="ht">这里是一个标题</h1>
        <script>
        	window.alert("此地无银三百两")
        </script>
    </body>
    ```

4.  console.log()

    在控制台中显示JavaScript 值

    ```html
    <!DOCTYPE html>
    <html>
    <head lang="en">
    	<meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <h1 id="ht">这里是一个标题</h1>
        <script>
        	console.log("此地无银三百两")
        </script>
    </body>
    ```

    

    

## JavaScript 语法和注释

1.  JavaScript 语句：

    JavaScript 语句向浏览器发出的命令。语句的作用是告诉浏览器该做什么。

2.  分号：

    语句之间的分割是分号<code>;</code>

    注意：分号是可选项

3.  JavaScript 代码：

    按照编写顺序依次执行

4.  标识符：

    JavaScript 标识符必须以字母、下划线或美元符号开始

5.  JavaScript 对大小写很敏感

6.  JavaScript对空格不敏感

7.  JavaScript 关键字

    | abstract | else       | instanceof | super        |
    | -------- | ---------- | ---------- | ------------ |
    | boolean  | enum       | int        | switch       |
    | break    | export     | interface  | synchronized |
    | byte     | extends    | let        | this         |
    | case     | false      | long       | throw        |
    | catch    | final      | native     | throws       |
    | char     | finally    | new        | transient    |
    | class    | float      | null       | true         |
    | const    | for        | package    | try          |
    | continue | function   | private    | typeof       |
    | debugger | goto       | protected  | var          |
    | default  | if         | public     | void         |
    | delete   | implements | return     | volatile     |
    | do       | import     | short      | while        |
    | double   | in         | static     | with         |

8.  注释

    ```javascript
    //注释
    /*注
      释*/
    ```

    

## JavaScript 变量和数据类型

### 定义变量

```javascript
var x; //声明变量x
x = 5; //赋值
```

-   全局变量

    1.  ```javascript
        var test = 10; //在函数外部声明则为全局变量
        ```

    2.  ```javascript
        test = 10; //不加关键字【var】时一律为全局变量
        function a(){
            t = 10 //但函数执行至此时，全局变量【t】被声明
        };
        ```

    3.  ```javascript
        window.test = 10;
        ```

    4.  

-   局部变量



### 数据类型



1.  字符串【string】

    ```javascript
    var name1 = '达拉崩巴班德贝迪布都比鲁翁'
    var value = name1[0] //索引
    var value = name1.length //获取字符串长度
    var value = name1.trim() //去除空白
    var value = name1.charAt(index) //根据索引获取字符，与索引功能类似
    var value = name1.substring(start,end) //根据索引获取子序列
    ```

    

2.  数字【number】

    JavaScript中部分整数和浮点数

3.  布尔【boolean】

4.  数组【array】

    ```javascript
    //声明
    var num = [1,1,4,23,34]
    var num = Array(1,1,4,12,2,3,2)
    //常见方法
    var names = ['黄瓜道人','荔枝仙子','鲸吃瓜']
    names[0] //索引
    names.push(ele) //尾部追加
    var value = names.pop()  //尾部删除
    names.unshift(ele)  //头部添加
    var value = names.shift() //头部移除
    names.splice(index,howmany,item)
    /*index:[必须]索引值
      howmany:[可选]删除多少元素，可为“0”，无该参数时从index删除到结束
      item:[可选]要添加的元素，可有多个*/
    names.splice(index,o,ele) //指定位置插入
    names.splice(index,1,ele) //指定位置替换
    names.splice(index,1) //指定位置删除
    names.splice(start,end) //切片
    names.reverse() //数组反转
    names.join(sep) 
    //将数组元素连成一个字符串，sep为分隔符，可不填
    names.concat(val,……) //连接数组
    names.sort() //对原数组进行排序
    ```

    

5.  对象->python中的字典【object】

    

6.  空【null】

## JavaScript 控制语句

### 条件语句

1.  if……else……

    ```javascript
    var age = 18;
    if (age < 18){
        window.alert('禁止未成年进入');
    }else if(age <= 50){
        window.alert('成年了也不让你进');
    }else{
        window.alert('老先生请回吧，这里不适合你');
    }
    ```

    1.  强类型定义语言：
        　　强制数据类型定义的语言。也就是说，一旦一个变量被指定了某个数据类型，如果不经过强制转换，那么它就永远是这个数据类型了。举个例子：如果你定义了一个整型变量a,那么程序根本不可能将a当作字符串类型处理。强类型定义语言是类型安全的语言
    2.  弱类型定义语言：
        　　数据类型可以被忽略的语言。它与强类型定义语言相反, 一个变量可以赋不同数据类型的值。
        　　强类型定义语言在速度上可能略逊色于弱类型定义语言，但是强类型定义语言带来的严谨性能够有效的避免许多错误。另外，“这门语言是不是动态语言”与“这门语言是否类型安全”之间是完全没有联系的！
    3.  　　例如：Python是动态语言，是强类型定义语言（类型安全的语言）; VBScript是动态语言，是弱类型定义语言（类型不安全的语言）; JAVA是静态语言，是强类型定义语言（类型安全的语言）。
        ————————————————
        版权声明：本文为CSDN博主「aiming66」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/aiming66/java/article/details/78570784

2.  switch……case……

    ```javascript
    switch(func){
        case 1:
            window.alert('一键清空');
            document.write('');
        case 2:
            window.alert('该功能建设中');
        default:
            window.alert('警告：输入错误');
    }
    ```

### 循环语句

1.  while

    ```javascript
    while (条件){
        循环体
    };
    ```

2.  do……while

    ```javascript
    do{
        循环体
    }while (条件);
    ```

    do……while是先做再判断

    while是先判读再做

3.  for

    ```javascript
    //1
    for(a in b){
        循环体
    }
    //2
    for(var i = 0,i < 10,i++){
        循环体
    }
    ```

4.  break & continue

    [python笔记](D:\Code\Markdown\Python Notebook.md)

## 函数

### 声明函数

1.  声明函数

    ```javascript
    function 函数名(参数){
        函数体
    }
    ```

2.  注：

    JavaScript对大小写敏感，所以function必须小写，调用时函数名也要相同

3.  函数命名规则

    -   命名方法：小驼峰式命名法

    -   命名规范：前缀应为动词

        | 动词 | 含义                         | 返回值                                     |
        | ---- | ---------------------------- | ------------------------------------------ |
        | can  | 判断是否可执行某个动作或权限 | true或false                                |
        | has  | 判断是否含有某个值           | true或false                                |
        | is   | 判断是否为某个值             | true或false                                |
        | get  | 获取某个值                   |                                            |
        | set  | 设置某个值                   | 无返回值、返回是否设置成功或者返回链式对象 |
        | load | 加载某些数据                 | 无返回值或者返回是否加载完成的结果         |
        

4.  箭头函数

    ```javascript
    //普通函数声明方式
    function getAdd (a,b){
        ruturn a + b;
    }
    
    getAdd(1,1)
    //箭头函数，有点类似于python中的【lambda表达式】
    var getAdd = (a,b) => a + b;
    getAdd(1,1)
    ```

    

### 调用函数

JavaScript中调用函数可以在<code>< script >< /script ></code>标签中调用，也可以在直接在标签中调用

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title></title>
  </head>

  <body>
    <h1>HTML标签和样式</h1>
    <script>
      function demo() {
        var a = 10;
        var b = 10;
        var sum = a * b;
        window.alert(sum);
      }
      demo();
    </script>
  </body>
</html>
```

标签中调用

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title></title>
  </head>

  <body>
    <h1>HTML标签和样式</h1>
    <script>
      function demo() {
        var a = 10;
        var b = 10;
        var sum = a * b;
        window.alert(sum);
      }
      // demo();
    </script>
    <button onclick="demo()">button</button>
  </body>
</html>
```

### 函数参数

**在JavaScript中函数不会对参数进行任何检查**

1.  参数规则

    -   JavaScript函数定义不会为参数（parameter）规定数据类型
    -   JavaScript 函数不会对所传递的参数（argument）实行类型检查
    -   JavaScript 函数不会对所传递的参数（argument）实行数量检查

2.  参数省略

    JavaScript允许省略参数

    ```javascript
    function a(i,j,k){
        return a
    }
    f(1,2,3,4) // 1
    f(1) //1
    f() //undefined
    ```

    当调用时**省略**了函数，丢失的值被设置为<code>undefined</code>

3.  arguments对象

    ```javascript
    var f = function (one) {
      console.log(arguments[0]);
      console.log(arguments[1]);
      console.log(arguments[2]);
    }
    //略像python传参时的【*args】
    f(1, 2, 3)
    // 1
    // 2
    // 3
    ```



 

ceshi
