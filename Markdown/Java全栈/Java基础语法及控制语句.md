# Java基础及控制语句

## 运算符

### 算数运算符

Java中的算数运算符与数学中运算符效果类似

| 运算符 | 描述                                     |
| ------ | ---------------------------------------- |
| +      | 加法运算                                 |
| -      | 减法运算                                 |
| *      | 乘法运算                                 |
| /      | 除法运算                                 |
| %      | 取模(余)运算：左操作数除以右操作数的余数 |
| ++     | 自增：操作数的值自增1                    |
| --     | 自减：操作数的值自减1                    |

想必各位能从小学毕业的高材生应该可以get到其余四个（+、-、*、/）是怎么用的吧【滑稽】。

### 关系运算符

关系运算符用来对两个操作数进行比较，结果为真则返回<code>true</code>,结果未假则反回<code>false</code>。

| 运算符 | 描述     | 返回值（a=10，b=20）       |
| ------ | -------- | -------------------------- |
| <      | 小于     | a<b  => true;b<a =>false   |
| >      | 大于     | a>b  => false;b>a =>true   |
| ==     | 等于     | a==b  => false             |
| <=     | 小于等于 | a<=b  => true;b<=a =>false |
| >=     | 大于等于 | a>=b  => false;b>=a =>true |
| !=     | 不等于   | a!=b  => true              |

### 逻辑运算符

| 运算符 | 描述         | 返回值                                          |
| ------ | ------------ | ----------------------------------------------- |
| &&     | 逻辑与运算符 | 两边都为真则返回**true**，否则返回**false**     |
| \|\|   | 逻辑或运算符 | 只要有一边为真就返回**true**，否则返回**false** |
| !      | 逻辑非运算符 | 反转操作数结果，即当<code>!(2>1)</code> =>false |

注：

<code>&&</code>、<code>||</code>的短路特性：

+   在<code>表达式1 && 表达式2</code>中，当**表达式1**的结果为<code>false</code>时，则不去执行**表达式2**，因为当**表达式1**的结果为**假**时<code>表达式1 && 表达式2</code>一定为**真**；
+   同样的在<code>表达式1 && 表达式2</code>中，当**表达式1**的结果为<code>true</code>时，则不去执行**表达式2**，因为当**表达式1**的结果为**真**时<code>表达式1 && 表达式2</code>一定为**真**。

### 赋值运算符



| 运算符 | 描述                                                         |
| ------ | ------------------------------------------------------------ |
| =      | 把右边的值赋给左边                                           |
| +=     | 加右边的值并赋给左边，<code>a += b</code>相当于<code>a = a+b</code> |
| -=     | 减右边的值并赋给左边，<code>a -= b</code>相当于<code>a = a - b</code> |
| *=     | 乘右边的值并赋给左边，<code>a *= b</code>相当于<code>a = a * b</code> |
| /=     | 除以右边的值并赋给左边，<code>a /= b</code>相当于<code>a = a / b</code> |
| %=     | 对右边的值取模并赋给左边，<code>a %= b</code>相当于<code>a = a % b</code> |



### 位运算符

位运算符是对二进制数据进行操作

| 运算符 | 描述                                                         |
| :----- | :----------------------------------------------------------- |
| ＆     | 按位与操作符，当且仅当两个操作数的某一位都非0时候结果的该位才为1。 |
| \|     | 按位或操作符，只要两个操作数的某一位有一个非0时候结果的该位就为1。 |
| ^      | 按位异或操作符，两个操作数的某一位不相同时候结果的该位就为1。 |
| 〜     | 按位补运算符翻转操作数的每一位。                             |
| <<     | 按位左移运算符。左操作数按位左移右操作数指定的位数。         |
| >>     | 按位右移运算符。左操作数按位右移右操作数指定的位数。         |

例：

```java
/**
* 15 => 0000 1111
* 60 => 0011 1100
*/
A = 0000 1111;
B = 0011 1100;
-------------------
A & B = 0000 1100  //12
A | B = 0011 1111  //63
A ^ B = 0011 0011  //51
~ A = 1111 0000  //240
A << 2 = 0011 1100  //60
B >> 2 = 0000 0011  //3
```

## 输入&输出

### 输出

Java输出语句除了看起来有点长其实并没有什么难理解的，它常用的也就三种：

+   不换行输出：<code>System.out.print()</code>

+   换行输出：<code>System.our.println()</code>

+   格式化输出：<code>System.out.printf()</code>

    | 格式字符 | 描述           |
    | -------- | -------------- |
    | %c       | 单字符         |
    | %s       | 字符串         |
    | %d       | 十进制整数     |
    | %f       | 十进制浮点数   |
    | %o       | 八进制数       |
    | %u       | 无符号十进制数 |
    | %x       | 十六进制数     |
    | %%       | 百分号         |

注：

+   在输出语句中<code>''</code>中只能是单字符，<code>""</code>里可以装字符串

+   在输出语句中，**两个数字类型**中间的<code>+</code>是算数运算，**字符型和数字型中间**的<code>+</code>表示字符串的拼接，**字符串之后所有**<code>+</code>都标识字符串拼接

    ```java
    System.out.println(5 + 7);  //输出 =>  12
    System.out.println(5 + 7 + '元');  //输出 =>  12元
    System.out.println("￥" + 5 + 7);  //输出 =>  ￥57
    System.out.println("我爱" + "粉色的" + "毛爷爷")  //输出 =>  我爱粉色的毛爷爷
    ```

    

### 输入

Java的并不像C语言、Python语言那样 那样提供现成的键盘输入方法，但我们仍有三种方法可以实现键盘输入。在这里我们来聊聊相对最简单，最强大的一种方法——通过**Scanner**类实现键盘输入。

因为是通过**Scanner**类来实现的，所以我们要先导入它。就像要用别人家的锅做饭，你得先把锅借回来吧，别杠哈，我不会让你用我的锅子在我家给你自己做饭的，电费不要钱吗？蹭饭更别想，敢提就找专业团队给你抬走。

导入**Scanner**以后还是不能马上用，因为类有了，还得实例化成对象才可以用。毕竟锅有了你得通电、加柴，同燃气啊。

所以代码是这样的：

```java
import java.util.Scanner;  //导入Scanner类

public class Study{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);  //对象实例化，注意System首字母大写
        //接下来就可以使用了
        System.out.println("请输入文本：");
        num = scan.next();
        Sysrtem.out.println("您输入的内容：")
    }
}
```

这段代码执行的结果：

```
javac Study.java
java Study
请输入文本：
鹤径 青蚨
您输入的内容：
鹤径
```

显然这里并没用将键盘输入的结果全部打印出来，这时，有请背锅侠：<code>next()</code>方法。

+   <code>next()</code>方法

    +   对于<code>next()</code>来说，一定要得到有效字符输入后才可以结束。（出鞘必见血，歘歘歘 ( ‵▽′)ψ ）
    +   <code>next()</code>会自动去掉有效字符前的空白。（魔剑表示只喝血，喂它水是什么鬼 (艹皿艹 ) ）
    +   <code>next()</code>将有效字符后的空白当作分隔符或结束符。（我都喝到血了，还想我喝水，拜拜嘞您，不伺候了，后面有啥我也不要了）

+   <code>nextLine()</code>方法

    <code>nextLine()</code>就乖多了。

    +   <code>nextLine()</code>方法以**回车**作为结束符，也就是说<code>nextLine()</code>会接收**回车**前的所有东西包括空格。

<code>next()</code>、<code>nextLint()</code>接收到的都是**字符串**，如果这时需要使用他们接受到**字符数**进行运算就需要通过**类型转换**将其转换成所需要的数据类型。或者使用别的方法直接接收所需要的数据类型。

+   <code>nextByte()</code>  、<code>nextShort 、()</code> 、<code>nextInt()</code> 、<code>nextLong()</code> 、<code>nextFloat()</code> 、<code>nextDouble()</code>

+   **next**后跟相应的数据类型

+   注：

    +   以上六个方法如果接收到类型不匹配的数据会报错，所以变量接收前最好判断一下

        ```java
        int num;
        if(scan.hasNextInt()){   //键盘输入类型是否为int型
            num = scan.nextInt();
        }else{
            System.out.println("请输入数字！");
        }
        ```

        

## 循环结构

### while循环

#### while

```java
while(/*条件*/){
    //循环体;
}
```

#### do……while

```java
do{
    //循环体;
}while(/*条件*/);
```

#### 区别

<code>while(){}</code> 、 <code>do{}while()</code>作用都类似，都执行循环，区别在于<code>while(){}</code>是先判断再执行，<code>do{}while()</code>则是先执行后判断。

有些人可能是还是不太理解什么执行，什么判断。那其实可以将它类比称街边的餐馆，**判断**就是**结账**，**执行**就是**吃饭**，那么<code>while(){}</code>就是先**结帐**再**吃饭**，而<code>do{}while()</code>就是先**吃饭**再**结账**。

### for循环

```java
for(/*语句A*/;/*语句B*/;/*语句C*/){
    //循环体;
}
//例：
for(int i = 0 ; i < 10 ; i++){
    System.out.println("我好牛X"); //每天夸自己十遍
}
```

>   执行顺序：语句A => {语句B => 循环体 => 语句C => 语句B => 循环体 => 语句C ……}

**for循环**要求：

+   语句A，语句C为普通语句，语句B为布尔表达式，然而对三条语句的内容不作要求；

+   语句省略；

    ```java
    int i = 0;
    for(; i < 10 ; i++){
        //循环体;
    }
    //或
    for(;;i++){
        //循环体;
        /*当语句B省略后for循环就失去了循环结束条件，若不使用break关键字，循环会一直进行下去*/
    }
    //或
    for(int j = 10;j < 0 ;){
        //循环体;
        j--;
    }
    ```

### <code>break</code>&<code>continue</code>

<code>break</code>和<code>continue</code>都是结束循环，但<code>break</code>是忽略条件语句，直接结束**整个循环**，而<code>continue</code>是结束**当前循环**。

举个栗子：

>   A~Q，12张扑克，甲、乙、丙、丁各三张后出的只能比前一张牌大；
>
>   甲出7，乙有4，5，J，Q他选择过（<code>continue</code>）,而丙只有1，2，3，6丙表示很淦，于是他掀了桌（<code>break</code>）,不打了，牌局结束。

## 分支结构

### if语句

#### if(){}else{}

```java
if(/*条件*/){
    //如果条件为true执行
	//代码块;
}else{
    //否则执行
    //代码块;
}
```

#### if(){}else if(){}

```java
if(/*条件1*/){
    //如果条件1为true执行
    //代码块;
}else if(/*条件2*/){
    //如果条件1为false，条件2为true执行
    //代码块;
}else{
    //否则执行
    //代码块;
}
```

### switch语句

```java

switch(/*表达式*/){
    case /*值1*/:
        //代码块;
        //(break;)
    case /*值2*/:
        //代码块;
        //(break;)
//break;非必须，需要时添加
    default/*否则执行*/:  //非必须
        //代码块;
}
```

注：

+   表达式的值必须为<code>byte</code>、<code>short</code>、<code>int</code>、<code>char</code>、<code>enum（枚举）</code>、<code>String</code>类型；

+   <code>break</code>是用来退出<code>switch</code>结构的，若无<code>break</code>执行当前<code>case</code>子句后会执行接下来的<code>case</code>子句直到遇到<code>break</code>关键字；

    ```java
    //周四去蹭饭，周五看电影，周六去相亲（也到了想要个女朋友的年龄了啊）
    import java.uilt.Scanner;
    public class RiCheng{
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.printl("今天星期几：");
            int today = scan.nextInt();
            switch(today){
                case 4:
                    System.out.println("去蹭饭");
                    break;
                case 5:
                    System.out.println("去看电影");
                case 6:
                    System.out.println("去相亲");
                default:
                    System.out.println("学习使我快乐");
    	    }
    	}
    }
    ```

    输出结果

    >今天星期几：1
    >
    >学习使我快乐

    >   今天星期几：4
    >
    >   去蹭饭

    >   今天星期几：5
    >
    >   去看电影
    >
    >   去相亲

所以在程序中使用<code>switch</code>语句一定要注意<code>break</code>的使用。

