## **1.1　标识符和关键字**

只要是语言，就会有标识符和关键字的概念。C#中的标识符和关键字，与C语言中的非常类似。

### **1.1.1　标识符**

下面通过分析C#源码，引出C#中标识符的概念，请看代码清单1-1。

**代码清单 1-1**

    using System;
    
    namespace WelcomeYou
    {
        //"欢迎你"的控制台程序
        class Program
        {
            static void Main(string[] args)
            {
                // 定义输出文本变量
                string welcomeText = "欢迎你";
    
                // 输出文本输出到控制台
                Console.WriteLine(welcomeText);
    
                // 让控制台程序可见直到用户按下任意字符为止
                Console.ReadKey();
            }
        }
    }
    
    `</pre>
    
    在代码清单1-1中，字符串`WelcomeYou`、`Program`、`Main`、`args`和`welcomeText`都是标识符，可以看出——标识符就是一种特定的字符串，你可以使用标识符来对命名空间、类、方法、参数和局部变量进行命名。但这并不意味着所有的字符串都可用作标识符，在C#中，一个字符串要成为标识符必须满足以下几个条件：

*   只包含字母（包括大小写）、数字、@符号以及下划线“_”。

*   首位可以为字母、下划线和@符号，但不能是数字。

*   不能为C#关键字。

    例如字符串`welcome`、`hello`和`@hello`都可以作为标识符，但字符串`12`和`hello#`却不行，因为字符串`12`的首位是数字，而字符串`hell0#`则包含了非法字符`#`，它们都不符合C#作为标识符的条件。

    同时，C#是一种大小写敏感的语言。即使两个字符串由相同的字母组成，但只要大小写存在差异，它们就代表两个不同的标识符，如`hello`与`Hello`。

    此外在定义标识符时，还应尽可能地保证其意义，使其具有一定的自描述性，即一看到这个标识符立刻就能明白它的用途。如代码清单1-1中的标识符`welcomeText`，就是一个很好的“见名知意”的例子。

    ### **1.1.2　关键字**

    前面曾讲到，C#中的关键字不能作为标识符存在。在代码清单1-1中， `using`、`namespace`、`class`、`static`和`string`都是关键字（也称保留字）。C#共有77个关键字，如表1-1所示。

    一般情况下，关键字不能用作标识符，但添加`@`前缀后就没有了这种限制。例如`@using`就可以作为标识符，而`using`却不可以，因为`using`是关键字。

**表 1-1　C#的77个关键字**

    <table class="table table-bordered table-striped table-condensed" width="90%" border="1">
    <tr><td>`abstract`</td><td>`as`</td><td>`base`</td><td>`bool`</td><td>`break`</td><td>`byte`</td><td>`case`</td></tr>
    <tr><td>`catch`</td><td>`char`</td><td>`checked`</td><td>`class`</td><td>`const`</td><td>`continue`</td><td>`decimal`</td></tr>
    <tr><td>`default`</td><td>`delegate`</td><td>`do`</td><td>`double`</td><td>`else`</td><td>`enum`</td><td>`event`</td></tr>
    <tr><td>`explicit`</td><td>`extern`</td><td>`false`</td><td>`finally`</td><td>`fixed`</td><td>`float`</td><td>`for`</td></tr>
    <tr><td>`foreach`</td><td>`goto`</td><td>`if`</td><td>`implicit`</td><td>`in`</td><td>`int`</td><td>`interface`</td></tr>
    <tr><td>`internal`</td><td>`is`</td><td>`lock`</td><td>`long`</td><td>`namespace`</td><td>`new`</td><td>`null`</td></tr>
    <tr><td>`object`</td><td>`operator`</td><td>`out`</td><td>`override`</td><td>`params`</td><td>`private`</td><td>`protected`</td></tr>
    <tr><td>`public`</td><td>`readonly`</td><td>`ref`</td><td>`return`</td><td>`sbyte`</td><td>`sealed`</td><td>`short`</td></tr>
    <tr><td>`sizeof`</td><td>`stackalloc`</td><td>`static`</td><td>`string`</td><td>`struct`</td><td>`switch`</td><td>`this`</td></tr>
    <tr><td>`throw`</td><td>`true`</td><td>`try`</td><td>`typeof`</td><td>`unit`</td><td>`ulong`</td><td>`unchecked`</td></tr>
    <tr><td>`unsafe`</td><td>`ushort`</td><td>`using`</td><td>`virtual`</td><td>`void`</td><td>`volatile`</td><td>`while`</td></tr>
    </table>
    
    ## **1.2　基础数据类型**
    
    公共语言运行时（CLR）包括通用类型系统（CTS）和公共语言规范（CLS）两部分。而通用类型系统又把类型分为两大类：值类型和引用类型。C#是基于.NET框架的语言，它自然定义了自己的数据类型，它们包括数值类型、布尔类型、字符串类型、枚举类型、结构体类型和数组类型。
    
    ### **1.2.1　数值类型**
    
    C#中的数值类型又分为整型、浮点型和十进制型3种，如图1-1所示。
    
    ![图像说明文字](http://epub.ituring.com.cn/api/storage/getbykey/screenshow?key=1603aa4c6646d5eb7494)

**图　1-1**

**1. 整型**

    不同的整数类型会占用大小不同的内存空间（至多64位），所能表示的数值范围也不尽相同。我们只有知道了每种类型的取值范围，才可能正确地使用它们，表1-2显示了各类整型数据的大小和取值范围。

**表 1-2　整型数值的取值范围和内存大小**

​    ​    |类型|说明|取值范围|
​    | ---- | ---- | ---- |
| byte | 无符号的8位整数 | 0到255（即2<sup>8</sup>-1） |
​    | sbyte | 有符号的8位整数 | -128到127 |
​    |char|16位Unicode字符|U+0000到U+FFFF，例如字符“x”对应的Unicode编码为“\0041”|
​    |short|有符号16位整数|-32 768到32 767（即-2<sup>15</sup>到2<sup>15</sup>-1）|
​    |ushort|无符号16位整数|0到65 535（即2<sup>16</sup>-1）|
​    |int|有符号32位整数|-2<sup>31</sup>到2<sup>31</sup>-1|
​    |uint|无符号32位整数|0到2<sup>32</sup>-1|
   |long|有符号64位整数|-2<sup>63</sup>到2<sup>63</sup>-1|
   |ulong|无符号64位整数|0到2<sup>64</sup>-1|

    在表1-2中，某些类型前面的“u”是unsigned（无符号）的缩写，表示不能在这些类型的变量中存储负数。

**2. 浮点型**
    浮点型分为单精度浮点数（float）和双精度浮点数（double），它们的取值范围如表1-3所示。
    

**表 1-3　浮点型数值范围与精度**



| 类型 |大小| 精度 | 大致范围 |
| ---- | ---- | -------- |----|
| float     |    32位   |    7位      |-1.4×10<sup>38</sup>到+1.4×10<sup>38</sup>|
|double| 64位|15到16位|±5.0×10<sup>-324</sup>到±1.7×10<sup>308</sup>|

**1. 十进制型**

十进制类型（关键字为`decimal`）表示128位的数据类型。与浮点数相比，它具有更高的精度和更小的范围，适用于财务和货币的计算。十进制类型的精度和范围如表1-4所示。
    
**表 1-4　十进制类型的精度和范围**

| 类型    | 精度           | 大致范围                                                     |
| ------- | -------------- | ------------------------------------------------------------ |
| decimal | 28到29位有效位 | (-7.9×10<sup>28</sup>到7.9×10<sup>28</sup>) / (10<sup>0 - 28</sup>) |



如果想实数被视为十进制类型，请加后缀`m`或`M`，如下所示：

```c#
decimal money = 500.3m;
```


​    
### **1.2.2　布尔类型**

布尔类型（`bool`）用于存储布尔值`true`和`false`。可以直接把布尔值赋给`bool`变量，也可以将计算结果为布尔类型的表达式赋给`bool`变量（有关表达式的内容将在1.4节介绍），下面的代码演示了布尔类型的使用方法：

```c#
static void Main(string[] args)
        {
        // 直接把布尔值赋给bool变量
            bool isoverSpeed = false;
        int speed = 80;   
	// 把计算结果为bool类型的表达式赋给bool变量
        isoverSpeed = speed &gt; 100;
    if (isoverSpeed)
        {
            Console.WriteLine("你已超速，为了你的安全请减速");
        }
    }
```

### **1.2.3　字符串类型**

    `string`（字符串）类型是System.String的别名，表示由零个或多个Unicode字符组成的不可变序列。可使用“`[]`”运算符访问`string`中的每个字符。
    
    `string`类型具有不可变性，下面通过具体例子来进行分析，相关代码如下：

<pre class="代码无行号">`static void Main(string[] args)
        {
        // 声明并初始化string类型变量
            string welcomeText = "hello";

            // 对string变量重新赋值
        welcomeText = "Hi";
        }
    
    `</pre>
    
    这里，在把`Hi`字符串赋给`string`变量`welcomeText`之前，内存首先会重新初始化一块区域，并把该区域的值初始化为`Hi`。之后，这块内存的地址将赋给变量`welcomeText`，而原来存放`hello`的内存区域则不会被修改。可以看出，`string`类型具有不可变性。

`string`类型为引用类型，`string`变量本身存储在栈中，而变量所指向的值则存储在托管堆里。
    
    为了帮助大家更好地理解`string`类型的不可变性，图1-2演示了上面代码中变量的内存分布情况。

![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.002.png)
    
**图　1-2**
    
### **1.2.4　枚举类型**

枚举类型属于值类型，它用于声明一组命名了的常数。例如若你需要定义一个变量来存储人的性别，那么该变量中将只会包含两个有意义的值，此时就可以使用枚举类型，具体的定义过程如代码清单1-2所示。
    
**代码清单 1-2**
    
<pre class="代码无行号">`// 性别枚举
    enum Gender
{
        // 女
    Female,
        // 男
    Male
    }

    `</pre>
    
    枚举类型使用`enum`关键字来完成声明。默认情况下，枚举中的每个元素都是`int`类型。用户可通过使用冒号，制定一种全新的整数值类型，方法如下面的代码所示。
    
    <pre class="代码无行号">`// 性别枚举
    enum Gender：byte
    {
        // 女
    Female,
        // 男
    Male
    }
    
    `</pre>
    
    如果未在枚举列表中指定元素的值，则默认会将所声明的第一个枚举成员设为0，之后的枚举成员依次加1。因此在代码清单1-2中，Gender.Female的值为0，Gender.Male的值为1。

### **1.2.5　结构体类型**

    C#中的结构体是一种值类型，通常适用于表示诸如`Point`、`Rectangle`和`Color`等的轻量级对象。结构体的定义如下面的代码所示。

<pre class="代码无行号">`// 定义点结构体
    public struct Point
{
        public int x;
    public int y;
        public Point(int px, int py)
    {
            x = px;
        y = py;
        }
    }
    `</pre>

### **1.2.6　数组类型**

数组是一种引用类型，它代表了相同类型元素的集合。下面的这行代码用于声明和初始化一个数组：
    
<pre class="代码无行号">`type[] array=new type[arrayCount];

`</pre>
    
这里，`type`为数组元素的类型，既可以是值类型，也可以是引用类型。声明数组时还需注意，方括号`[]`应放在类型`type`后，变量名`array`前，这和C语言有所不同。
    
可使用下面的方法访问数组的元素：
    
<pre class="代码无行号">`type elementValue =array[index];

`</pre>
    
这里的`index`是数组的小标，它是从0开始，最大不能超过数组的长度减1。如果`index`超出了这个范围，程序会在运行时出现`IndexOutOfRangeException`异常。代码清单1-3演示了数组的使用。
    
**代码清单 1-3**
    
<pre class="代码无行号">`using System;

namespace ArrayUse
    {
    class Program
        {
            static void Main(string[] args)
            {
                // 声明并初始化一个含有5个元素的int数组
                int[] array = new int[5];
    
                // 对数组进行遍历
                for (int index = 0; index &lt;= array.Length - 1; index++)
            {
                    // 输出数组中的值
                    Console.WriteLine(array[index]);
                }
        
                // 等待用于输入的字符而退出程序
                // 这行代码使程序在运行结束后不会直接退出，让读者看到运行结果
            Console.ReadLine();
            }
        }
    }
    
    `</pre>

按F5运行程序，你将看到如图1-3所示的运行结果。
    
![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.001.png)
    
**图　1-3**
    
代码清单1-3声明并初始化了一个名为`array`的数组，但并没有为其元素赋值。从程序的运行结果可以得出——当我们未对数组元素进行显式赋值时，对于`int`类型的数组，编译器会自动地将所有的元素设置为默认值0。
    
其他类型的默认值，大家可参考代码清单1-3自行试验。
    
## **1.3　变量和常量**

变量代表一块内存空间，它存储的值是可以变化的。因为有了变量，我们不需要再去记忆复杂的内存地址，而是转为通过变量名来完成内存数据的存取操作。与变量不同，常量不能在赋值之后发生变化，其对应内存中的值不能被改变。
    
### **1.1.1　变量的使用**

前面的代码中已经多次使用变量，可以看出，声明变量的语法如下：
    
<pre class="代码无行号">`数据类型 变量名;

`</pre>
    
如果要同时声明多个同类型变量，则可采用下面的语法：
    
<pre class="代码无行号">`int a, b,c;  // a、b、c都声明为int类型

`</pre>
    
如果在声明之后，未进行初始化就提前使用变量，则会在编译时出现“使用了未赋值的局部变量”的错误。
    
### **1.1.2　变量的作用域**

变量的作用域指变量的使用范围，超出作用域后不能再对变量进行读取和赋值等操作，如下代码所示：
    
<pre class="代码无行号">`public void TestMethod()
    {
// varInMethod只在方法TestMethod内部有效，以{}为界限
        string[] varInMethod = new string[5] { "H", "e", "l", "l", "o" };

        // varforeach只在foreach循环内部有效
        foreach (string varforeach in varInMethod)
    {
            Console.WriteLine(varforeach);
        }
        
        // 在循环外部不能引用varforeach变量
        //Console.WriteLine(varforeach);
    
        // 在循环外部也不能对varforeach变量重新赋值
        //varforeach = "123";
        }

    



以上代码有详细的变量作用域说明。当超出变量的作用域而试图去操作变量时，会产生“当前上下文不存在名称XXX”的类似错误。
    
### **1.1.3　常量**

如前面所述，常量一旦被初始化就不能再次改变。C#中使用`const`关键字来对常量进行定义，其语法如下：
    
<pre class="代码无行号">`const 数据类型 常量名 = 与数据类型相对应的值;
    
声明并初始化常量时，应注意以下几点。
    
*   因为后续无法更改，常量必须在声明时就进行初始化。
*   常量无法接受变量的赋值，即使变量是`readonly`（只读）也不可以。
*   常量默认为是静态的，不允许显式使用`static`关键字来声明。

## **1.4　运算符和表达式**

    代码清单1-3中曾使用了这样的代码——`index++`，这其实就是一个表达式，其作用为使变量`index`自增1，里面的++是运算符。

### **1.4.1　运算符**

    在C#中，运算符是用于操作一个或多个操作数的程序元素。接受一个操作数的运算符称为一元运算符，如增量运算符（`++`）和减量运算符（`--`）；接受两个操作数的运算符称为二元运算符，如算术运算符`+`、`-`、`*`和`/`；条件运算符（`? :`）接受3个操作数，它是C#中唯一的三元运算符。

### **1.4.2　运算符优先级**

    运算符接受的操作数可以是一个表达式，也可以是多个表达式的组合。在包含多个运算符的表达式中，运算符的优先级决定着表达式的意义和最终取值。例如，在下面的语句中，`num`的值是7。
    
    <pre class="代码无行号">`int num = 13 - 2 * 3;
    
    `</pre>
    
    由于乘法的优先级更高，程序因此会先执行乘法再执行减法，于是上面语句的结果就是7。表1-5列出了运算符的优先级顺序：优先级从上到下依次递减，最上面具有最高的优先级。同级运算符的运算顺序取决与运算符的结合顺序，只有三个优先级是从右至左结合的，它们是一元运算符、条件运算符、赋值运算符。其他的都是从左至右结合。如`"x+y+z"`表达式按照`"(x+y)+z"`表达式进行计算。



### **1.4.3　运算符重载**

表1-5中列出的所有运算符都只能使用.NET框架中已定义的类型作为操作数，但如果你想要对自定义的类型试验某一运算符又该怎么办呢？比如，如何对一个自定义的类进行加法操作呢？

C#和C++一样，也是用运算符重载来解决此类问题的。运算符重载只能用于类或结构中，通过在类（或结构）中声明并实现一个名为`operator x`的方法，即可完成一个运算符的重载。对于一元运算符，其重载方法需要带一个类或结构类型作为参数；而二元运算符重载则相应地需要带两个类或结构类型作为参数，二元运算符重载的语法如下：

从重载运算符的语法定义可以看出，所有运算符重载的方法都应为静态方法，且需要使用`public`运算符进行修饰。以下代码给出了一个运算符重载的例子。


​    
​    using System;
​    
    namespace OperatorOverloading
    {
        // Complex结构体属于一个自定义结构体
        public struct Complex
        {
            // 复数的实数部分
            public int real;
    
            // 复数的虚数部分
            public int imaginary;
        
            // 带参数的构造函数，real表示实数，imaginary表示虚数
            public Complex(int real, int imaginary)
            {
                // 初始化复数的实数和虚数
                this.real = real;
                this.imaginary = imaginary;
            }
        
            // +运算符重载方法
            // complex1表示第一个操作数，类型必须为Complex类型
            // 第二个操作数的类型也必须为Complex类型
            // 返回为Complex类型
            public static Complex operator +(Complex complex1, Complex complex2)
            {
                // 值类型都有默认无参构造函数
                // 通过无参构造函数进行初始化
                Complex result = new Complex();
        
                // 对复数的实数和虚数赋值
                result.real = complex1.real + complex2.real;
                result.imaginary = complex1.imaginary + complex2.imaginary;
        
                // 返回复数相加结果
                return result;
            }
        
            // 重写ToString()方法
            public override string ToString()
            {
                return string.Format("{0}+{1}i", real, imaginary);
            }
        }
        
        class Program
        {
            static void Main(string[] args)
            {
                // 初始化两个复数
                Complex number1 = new Complex(1,2);
                Complex number2 = new Complex(3,4);
        
                // 用+运算符对两个复数进行相加
                // 如果复数类型中没有对+运算符进行重载，
                // 则此处将不能使用+运算符来对复数类型进行相加操作
                Complex sum = number1 + number2;
        
                // 输出输入的复数和相加之后的结果
                Console.WriteLine("第一个复数为：{0}",number1);
                Console.WriteLine("第二个复数为：{0}",number2);
                Console.WriteLine("两个复数的和为：{0}", sum);
        
                Console.Read();
            }
        }
    }
    
    `</pre>
    
    以上代码的运行结果如图1-4所示。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.004.png)

**图　1-4**

C#中允许使用`operator`关键字来实现运算符的重载，但这并不意味着所有的运算符都可以被重载，表1-6中列出了C#中可重载和不可重载的运算符。

**1.4.4　表达式**

    表达式是由一个或多个操作数以及零个或零个以上的运算符组成的序列，通过计算表达式，就可得到一个值、对象或方法的结果。表达式中可以包含文本值、方法调用、运算符及其操作数，以及简单名称。简单名称可以是变量、类型成员、方法参数、命名空间或类型的名称等。
    
    从表达式的定义可以看出，简单的文本也可以成为表达式，例如：
    
    <pre class="代码无行号">`string learning = "learningHard";
    
    `</pre>
    
    其中，`"learningHard"`就是简单的文本值，同样它也是一个表达式。这个例子还可说明，表达式都是与语句同时出现的，下面将对C#中的语句进行详细介绍。

## **1.5　C#中的语句**

    在前面的示例代码中，我们已经看到了很多C#语句。语句可以是以分号为结尾的单行语句，也可以是被括入语句块中的多行语句。这里所说的语句块，即包含在括号`{}`中的语句结构，一个语句块中可以嵌入其他语句块。
    
    C#语句包含很多类型，如声明语句、表达式语句、条件语句、跳转语句、循环语句和异常处理语句等，本节将重点介绍其中的3类——选择语句、跳转语句和循环语句，有关其他语句的内容，请读者参考MSDN：[http://msdn.microsoft.com/zh-cn/library/ms173141.aspx](http://msdn.microsoft.com/zh-cn/library/ms173141.aspx)。

### **1.5.1　条件语句**

    条件语句的功能是根据一个或多个指定条件来执行不同的代码块，C#中的条件语句包括`if`语句和`switch`语句。

**1. `if`语句**

    `if`语句会对条件进行判断，当指定条件为布尔值`true`时将执行某一个代码块，为`false`时则执行另外一个代码块。`if`语句经常会与`else`语句、`else if`语句配合使用。以下代码演示了`if`语句的用法。
    
    <pre class="代码无行号">`using System;
    
    namespace Statements
    {
        class Program
        {
            static void Main(string[] args)
            {
                bool condition = true; // 声明语句
                int x = 13;
    
                // if语句与else语句一起使用
                if (condition)
                {
                    Console.WriteLine("变量设置为真");
                }
                else
                {
                    Console.WriteLine("变量设置为假");
                }
        
                // if与else if语句一起使用
                if (x &lt;5)
                {
                    Console.WriteLine("x的值小于5！");
                }
                else if (x &lt; 10) // 5&lt;x&lt;10时执行的语句
                {
                    Console.WriteLine("x的值大于5小于10！");
                }
                else if (x &lt; 20) // 10&lt;x&lt;20时执行的语句
                {
                    Console.WriteLine("x的值大于10小于20！");
                }
        
                Console.Read();
            }
        }
    }
    
    `</pre>
    
    以上代码的执行结果如图1-5所示。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.005.png)

**图　1-5**

**2. `switch`语句**

    `switch`语句与`if`语句类似，它同样是根据测试值来有条件地执行代码的。`switch`的语法如下：
    
    <pre class="代码无行号">`switch(表达式)
    {
        case 常量表达式1:
            语句
            break;
        case 常量表达式2:
            语句
            break;
        case 常量表达式3:
            语句
            break;
        … (更多的case语句)
        default:
            语句
            break;
    }
    
    `</pre>
    
    从上面的语法结构可以看出，`switch`语句可以包含任意数量的`case`语句，但任何两个`case`语句不能有相同的值，每个`case`语句之后又必须以`break`语句作为结束（`case`语句中没有代码的情况除外）。以下代码演示了`swich`语句的用法。
    
    <pre class="代码无行号">`using System;
    
    namespace Statements
    {
        class Program
        {
            static void Main(string[] args)
            {
                // 声明开关变量
                int switchVar = 2;
                switch (switchVar)
                {
                    // 变量为0或1的情况
                    // 当case语句中没有语句时，不需要break语句
                    case 0:
                    case 1:
                        Console.WriteLine("变量的值是0或者1");
                        break;
                    // 变量的值为2的情况
                    case 2:
                        Console.WriteLine("变量的值是2");
                        break;
                        // 下面的语句将引起一个警告
                        Console.WriteLine("不可能执行的语句");
                    // 默认情况(default 语句是可选的)
                    default:
                        Console.WriteLine("默认情况");
                        break;
                }
    
                Console.Read();
            }
        }
    }
    
    `</pre>
    
    以上代码的输出结果如图1-6所示。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.006.png)

**图　1-6**

    ### **1.5.2　循环语句**
    
    循环语句可令语句块中的代码持续执行，直至遇到跳转语句或表达式条件为`false`的情况才停止（退出循环），使用循环语句可避免重复编写相同的代码。C#中有4种循环语句：

*   `while`语句
*   `do-while`语句
*   `for`语句
*   `foreach`语句

    下面分别对这4种循环语句进行介绍。

**1. `while`语句**

    `while`语句将首先检查表达式的值，如果表达式的值为`true`则执行`while`语句块中的语句，直到表达式的值变为`false`或者执行中遇到显式指定的跳转语句时，停止循环。下面的代码演示了`while`语句的使用方法。
    
    <pre class="代码无行号">`using System;
    
    namespace WhileStatement
    {
        class Program
        {
            static void Main(string[] args)
            {
                int i = 0; // 声明变量并初始化为0
                while (i &lt; 5)
                {
                    // i的值小于5时一直执行的代码
                    Console.WriteLine("当前i的值为：{0}", i);
                    i++;
                }
    
                Console.Read();
            }
        }
    }
    
    `</pre>
    
    以上代码中，`while`语句在执行后续语句前，会首先判断“`i&lt;5`”这一表达式，若`i`确实小于5，循环才继续执行，否则将退出循环。运行这个程序，你将看到如图1-7所示的结果。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.007.png)

**图　1-7**

**2. `do-while`语句**

    当条件表达式的值为`true`时，`while`语句会重复执行`do`语句块，直到表达式的值变为`false`，程序退出循环。与`while`语句不同，`do-while`语句会首先执行循环体中的语句，然后再检查布尔表达式是否为`true`（以决定循环能否继续）。`do-while`语句因此比`while`语句多做了一次循环。下面的代码演示了两者的区别：
    
    <pre class="代码无行号">`using System;
    
    namespace WhileStatement
    {
        class Program
        {
            static void Main(string[] args)
            {
                int i = 5;
                Console.WriteLine("while语句的执行结果为：");
                while (i &lt; 5)
                {
                    Console.WriteLine("当前i的值为：{0}", i); // 该语句不会执行
                    i++;
                }
    
                Console.WriteLine();
                Console.WriteLine("do-while语句的执行结果为：");
                do
                {
                    Console.WriteLine("当前i的值为：{0}", i); // 该语句会执行一次
                    i++;
                } while (i &lt; 5);
        
                Console.Read();
            }
        }
    }
    
    `</pre>
    
    由于在以上代码中，变量`i`被初始化为5，表达式`i&lt;5`的值为`false`，所以`while`循环体不会被执行。`do-while`语句先将`do`语句块中的代码运行了一次，然后才去计算表达式`i&lt;5`的值，此时值为`false`，因此也退出了循环。
    
    按F5运行代码，你将看到如图1-8所示的结果，这与我们的分析一致，只有`do-while`执行了一次循环。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.008.png)

**图　1-8**

**1. `for`语句**

    `for`语句需要在循环开始前对变量的值进行初始化，然后执行循环体中的语句，再对布尔表达式求值，当值为`false`时退出循环，否则继续执行循环体。
    
    在所有的循环语句中，都需要指定一个用来退出循环的条件表达式，否则将出现死循序。死循环指的是布尔表达式一直为`true`，循环体的代码一直执行的情况。以下代码演示了`for`语句的使用方法。
    
    <pre class="代码无行号">`class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[5];
    
            // 对数组中元素进行赋值
            for (int i = 0; i &lt; array.Length; i++)
            {
                array[i] = i;
                Console.WriteLine("array[{0}]的值为：{1}", i, i);
            }
        
            Console.Read();
        }
    }
    
    `</pre>
    
    运行这段代码，你将看到如图1-9所示的结果。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.009.png)

**图　1-9**

**4. `foreach`语句**

    `foreach`语句用于遍历数组或对象集合中的元素。但请注意，并非所有的数组或对象集合都能用`foreach`语句进行遍历，只有那些实现了`System.Collections.IEnumerable`和`System.Collections.Generic.IEnumerable&lt;T&gt;`接口的数组或对象集合才可以使用`foreach`语句。下面的代码演示了`foreach`语句的使用方法。
    
    <pre class="代码无行号">`class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[] { 0, 1, 1, 2, 3, 4, }; // 声明并初始化数组元素
            Console.WriteLine("数组中每个元素如下：");
            foreach (int element in array) // 对数组中的元素进行遍历
            {
                // 输出数组中的每个元素
                System.Console.WriteLine(element);
            }
    
            Console.Read();
        }
    }
    
    `</pre>
    
    运行这段代码，你将看到如图1-10所示的结果。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.010.png)

**图　1-10**

    ### **1.5.3　跳转语句**
    
    在循环语句中，如果需要在循环结束之前退出整个循环，你可以使用跳转语句。C#中包含4种跳转语句。

*   `break`语句：直接退出整个循环。
*   `continue`语句：立即终止本次循环，但会继续执行下一次循环。
*   `goto`语句：跳出循环到已标记好的位置上（为了使代码易于阅读和理解，不建议大家使用`goto`语句退出循环）。
*   `return`语句：退出循环和循环所在的函数。

    下面的代码演示了`break`与`continue`的区别。你可以通过二者的运行结果理解“终止当前循环”的含义。

    
    
    
    ```c#
    // 演示break与continue的区别
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("使用continue退出循环的情况：");
            for (int i = 0; i &lt; 5; i++)
            {
            if (i == 2)
                {
                    continue;
                }
    			Console.WriteLine("当前i的值为：{0}",i);
        	}
    
        Console.WriteLine("使用break退出循环的情况：");
        for (int i = 0; i &lt; 5; i++)
        {
            if (i == 2)
            {
                break;
            }
    
            Console.WriteLine("当前i的值为：{0}", i);
        }
    
    Console.Read();
    }
    ```
```
    

    在以上代码中，由于`continue`语句只退出本次循环，下一次循环仍会执行，所以当`i`等于2时，`if`的条件表达式为`true`，`continue`语句生效退出该次循环，`i=2`的值没有输出到控制台中。而`break`语句是用于退出整个循环的，当`i`等于2时，`if`的条件得到满足，`break`语句生效使循环体不再执行，`i=2`、`i=3`和`i=4`的值都不会被输出到控制台中。运行这段代码，你将看到如图1-11所示的结果。
    
    ![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.011.png)

**图　1-11**

    `return`语句会直接退出整个循环和循环所在的函数。它与`break`的区别在于：`break`只是退出整个循环，但循环体之后的代码依然会被执行；而`return`语句则不但退出了整个循环，还退出了循环所在的函数。下面我们通过实例代码进行演示。
    
    <pre class="代码无行号">`// return与break区别的演示
    class Program
    {
    static void Main(string[] args)
        {
            Console.WriteLine("使用break退出循序的情况：");
            for (int i = 0; i &lt; 5; i++)
            {
                if (i == 2)
                {
                    break;
                }
                Console.WriteLine("当前i的值为：{0}", i);
            }
    
            Console.WriteLine("循环已退出！");
        
            Console.WriteLine("使用return退出循序的情况：");
            for (int i = 0; i &lt; 5; i++)
            {
                if (i == 2)
                {
                    　return;
                }
                Console.WriteLine("当前i的值为：{0}", i);
            }
        
            Console.WriteLine("循环已退出！");
        }
    }

在以上代码中，由于`break`只退出了`for`循环，所以循环之后的语句会继续执行；而`return`则退出了整个`Main`函数，`for`循环后面的“循环已退出”语句不会输出到控制台窗体中。这段代码的运行结果如图1-12所示。

![{%}](http://www.ituring.com.cn/figures/2016/LearningHardC/04.d03z.012.png)

**图　1-12**

## **1.1　标识符和关键字**

只要是语言，就会有标识符和关键字的概念。C#中的标识符和关键字，与C语言中的非常类似。


```