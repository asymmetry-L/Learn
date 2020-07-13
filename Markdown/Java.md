## Java概述

### 注

1.  &&：当&&前为*false*时，&&后语句不执行

### 基本语法



```java
public class Day01 {//创建一个类
    public static void mian (String args[]) {
        //入口：main函数既是Java既是程序的起始点，也是结束点 
        System.out.println("hello world!");//输出
    }
}
```



### Java标识符

1.  必须以字母，下划线， $$开头，其他部分可以是数字字母的组合，但不能以数字开头

2.  标识符之间不能含有空格

3.  不能是Java的关键字【48个】

4.  标识符只能包含两个特殊字符，即美元符和下划线

5.  Java严格区分大小写

### 类的命名规范

1.  遵循Java本身的命名规范
2.  见名知意，常用取简，专用取繁
3.  如果是一个单词，单词首字母大写；如果是多个单词首字母大写

### 数据类型

+   基本类型
     - byte：字节类型
        	- 八位，有符号的，以二进制补码表示的整数；
            	- 最小值为*-128(-2^7)*;
                	- 最大值为*127(2^7 - 1)*；
    	- 默认值是*0*；
            	- byte类型用在大型数组中节约空间，主要代替整数，byte变量占用的空间只用int类型的*1/4*；
     - int：整型
        	- 三十二位，有符号的，以二进制补码表示的整数；
            	- 最小值是*-2,147,483,648(-2^31)*；
                	- 最大值是*2,147,483,648(2^31 - 1)*；
                    	- 默认值是*0*；
                        	- 一般的整型变量默认为int类型；
     - short：短整型
        	- 十六位，有符号的，以二进制补码表示的整数；
            	- 最小值为*-32,768(-2^15)*；
                	- 最大值为*32,767(2^15 - 1)*；
                    	- 默认值是*0*；
                        	- short类型也可以像byte类型那样节省空间，short类型占用的空间为int类型的*1/2*；
     - long：长整型
        	- 三十二位，有符号的，以二进制补码表示的整数；
            	- 最小值是*-9,223,372,036,854,775,808(-2^63)*；
                	- 最大值是*9,223,372,036,854,775,807(-2^63 - 1)*；
                    	- 默认值是*0*L；
                        	- 主要用在需要比较大的整数系统上；
    
+   浮点类型
    +   float:单精度浮点类型
        +   单精度，32位符合<a href='https://baike.baidu.com/item/IEEE%20754/3869922'>IEEE754标准</a>的浮点数；
        +   可在存储大型浮点数组是节省内存空间；
        +   默认值是*0.0f*；
        +   不能用来表示精确的数，如货币；
    +   double：双精度浮点类型
        +   双精度，位符合<a href='https://baike.baidu.com/item/IEEE%20754/3869922'>IEEE754标准</a>的浮点数；
        +   浮点数的默认类型为double类型；
        +   默认值是*0.0d*；
        +   不能用来表示精确的数，如货币；
    
+   布尔类型（默认为*false*）
    +   true
    +   false
    
+   字符类型
    
    +   char
        +   是单一的16位Unicode字符
        +   最小值是*\u0000*(即为0)；
        +   最大值是*\uffff*(即为65,535)；
        +   char类型可以存储任何字符；
    
    ```java
    //四类八种
    byte
    short
    int
    long
    
    boolean:true/false
        
    float
    double
        
    char
    
    
    
    
    //创建学生类
    public class Sudent{
        
    }
    
    //类型转换
    大转小
    数据兼容
        
        逻辑运算符：||、&&、!
        算术运算符：+、-、*、/、%
        比较运算符：>、<、>=、<=、==、!=
    //选择语句    
        if(){
            
        }
    
    	if(){
            
        }else if(){
            
        }else{
            
        }
    
    	if(){
            
        }else
            
        switch(){
            case 1:
            case 2:
                break;
            default:
        }
    //循环语句
    	for(;;){
            
        }
    
    	while(){
            
        }
    	do{
            
        }while();
    
    public class Student{
        public static void main(String args[]){
            int sum=0;
            for(int i=0;i<=100;i++){
                System.out.println(i);
                sum+=i
            }
            System.out.println("1-100之和为"+sum)；
        }
    }
    
    ```
    
    

### String类

专门处理字符串的一个类

*字符串的拼接*：+

常用方法：

+   length()；获取字符串长度
+   charAt()；索引字符串字符
+   equals()；比较字符串内容

### 输入Scanner

```java
import java.util.Scanner
//导包
public class Student{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        //创建类
    }
}
```





