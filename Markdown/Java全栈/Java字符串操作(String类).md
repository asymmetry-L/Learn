字符串是Java编程中最常用的数据类型之一，而Java基本数据类型中只有只能存储单个字符的<code>char</code>型，所以当需要存储例如姓名，词语，单词，句子等不止一个字符的数据数据是就需要使用<code>String</code>类来存储数据。

>Java中字符串一旦被创建就不能再进行修改
>
>若想要更改字符串的值，只能通过对字符串重新复制来实现

# 定义字符串

<code>String</code>类提供了11种构造方法，这些方法提供不同的参数来初始化字符串，比如提供了一个字符数组参数：

```java
public class StringDemo{
    public static void main(String args[]){
        char[] helloArrry = {'H','e','l','l','o',' ','W','o','r','l','d'};
        String helloStr = new String(helloArray);
        System.out.println(hello);
    }
}
```

编译结果：

>Hello World

以下是比较常用的两种。

## 直接定义

直接定义变量就是使用字符串常量来初始化<code>String</code>对象。

```java
String str_1 = "圣光啊，那个邪恶值得一战！";
String str_2 = "123456";  //这里的"123456"的类型是字符串
String Str_3 = "How are you?";
```

## String类定义字符串

```java
String Str_4 = new String("区区赘婿怎敢造次");
String Str_5 = new String("1234567890");
```

# 字符串操作

字符串本质是<code>char</code>对象的有序集合，可以看作是字符数组。这样可以使字符串索引等内容更易理解

## 字符串长度

```java
String str = "参见龙王！";
int len = str.length();  //len的长度为5
```

这个就很简单的用法。

## 字符串拼接

<code>String</code>类提供两种链接字符串的方法一种是通过<code>concat()</code>方法，另一种就是通过<code>+</code>来连接。

```java
str_1.concat(str_2);
"林".concat("冲");
"hello".concat(str_1);
```

```java
String str_1 = "林冲";
String str_2 = "参见龙王";
System.out.println(str_1.concat(str_2));  //林冲参见龙王
str_1.concat(str_2);
System.out.println(str_1);  //林冲
```

从代码可以看出原字符串<code>str_1</code>并没用发生改变，这里是将<code>str_1</code>、<code>str_2</code>连接起来形成了一个新的字符串。

也可以这样：

```java
str_1 + str_2;
"三枪" + "拍案惊奇";
"达拉崩巴" + str_2;
```

## 字符串索引

前面说过，字符串是<code>char</code>对象的有序集合，可以看作是字符数组。所以可以使用索引来获取<code>String</code>对象中的某个<code>char</code>。返回值为<code>char</code>型。

```java
String.charAt(int index);
//int  ->参数类型
//index  ->索引值（从0开始）
```

```java
String poem = "一日不见兮，思之如狂。";
System.out.println(poem.charAt(5));
```

打印结果

>，

事实上打印的是第六个字符，原因就是因为数组的索引都是从**0**开始。

| 字符串 | 一   | 日   | 不   | 见   | 兮   | ，   | 思   | 之   | 如   | 狂   | 。   |
| ------ | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 索引   | 0    | 1    | 2    | 3    | 4    | 5    | 6    | 7    | 8    | 9    | 10   |

所以长度为十一的字符串最后一个字符的索引为**10**（划重点），这个在迭代字符串或数组时要注意，超出索引程序会报错。

## 字符串切割

### 通过指定字符或正则表达式分割

在Java中可以通过<code>split()</code>方法在字符串中截取片段，返回类型为一个**数组**。

```java
String[] split(String str,int limit);  //str为任意字符，limit参数可以省略，用来限制产生的数组长度
String[] split(String regex,int limit);  //regex为正则表达式，limit参数可以省略，用来限制产生的数组长度
```

```java
String poem = "一日不见兮，思之如狂。";
String[] poemList = poem.split("，");
System.out.println(poemList[0] + "+" +poemList[1]);
//编译结果 >> 一日不见兮+思之如狂。

String verse = "今夜思君不见君，但见君心似我心。";
String[] verseList_1 = verse.split("君");
for(int i = 0;i < verseList_1.length; i++){
    System.out.println(verseList_1[i]);
}
/**编译结果:
*>> 今夜思
*>>不见
*>>，但见
*>>心似我心。
*/
String[] verseList_2 = verse.split("君",2);  //将verse通过"君"分割成两个字符串
for(int i = 0;i < verseList_2.length; i++){
    System.out.println(verseList_2[i]);
}
/**编译结果：
*>>今夜思
*>>不见君，但见君心似我心。
*/
```

正则表达式使用方法类型，不了解正则表达式的童鞋建议关注期待正则表达式篇。

### 通过索引分割

```java
String substring(int beginIndex,int endIndex);
//beginIndex为初始索引，endIndex为结束索引，在使用endIndex中可以省略
//substring中索引范围为左闭右开区间
//当省略endIndex时，索引从beginIndex到结束
```

```java
String poem = "那年桃夭，红豆暗抛。";
String poem_1 = poem.substring(2);
String poem_2 = poem.substring(2,7);
System.out.println(poem_1);
System.out.println(poem_2);
/**编译结果：
*>>桃夭，红豆暗抛。
*>>桃夭，红豆
*/
```

### 大小写转换

```java
String toUpperCase(Locale locale);  //将英文字符串全部转换为大写
String toLowerCase(Locale locale);  //将英文字符串全部转化为小写
//其中参数一般省略，目前我也不太懂有啥用，有大佬看到请稍微指点一下啊
```

```java
String tip = "Syntax error on token";
String tipUp = tip.toUpperCase();
String tipLow = tipUp.toLowerCase();
System.out.println(tipUp);
System.out.println(tipLow);
/**编译结果：
*>>SYNTAX ERROR ON TOKEN
*>>syntax error on token
*/
```

## String 方法

| SN(序号) | 方法                                                         | 描述                                                         |
| :------- | :----------------------------------------------------------- | ------------------------------------------------------------ |
| 1        | char charAt(int index)                                       | 返回指定索引处的 char 值                                     |
| 2        | int compareTo(Object o)                                      | 把这个字符串和另一个对象比较                                 |
| 3        | int compareTo(String anotherString)                          | 按字典顺序比较两个字符串。                                   |
| 4        | int compareToIgnoreCase(String str)                          | 按字典顺序比较两个字符串，不考虑大小写。                     |
| 5        | String concat(String str)                                    | 将指定字符串连接到此字符串的结尾。                           |
| 6        | boolean contentEquals(StringBuffer sb)                       | 当且仅当字符串与指定的StringButter有相同顺序的字符时候返回真。 |
| 7        | static String copyValueOf(char[] data)                       | 返回指定数组中表示该字符序列的 String。                      |
| 8        | static String copyValueOf(char[] data, int offset, int count) | 返回指定数组中表示该字符序列的 String。                      |
| 9        | boolean endsWith(String suffix)                              | 测试此字符串是否以指定的后缀结束。                           |
| 10       | boolean equals(Object anObject)                              | 将此字符串与指定的对象比较。                                 |
| 11       | boolean equalsIgnoreCase(String anotherString)               | 将此 String 与另一个 String 比较，不考虑大小写。             |
| 12       | byte[] getBytes()                                            | 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 |
| 13       | byte[] getBytes(String charsetName)                          | 使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 |
| 14       | void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) | 将字符从此字符串复制到目标字符数组。                         |
| 15       | int hashCode()                                               | 返回此字符串的哈希码。                                       |
| 16       | int indexOf(int ch)                                          | 返回指定字符在此字符串中第一次出现处的索引。                 |
| 17       | int indexOf(int ch, int fromIndex)                           | 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 |
| 18       | int indexOf(String str)                                      | 返回指定子字符串在此字符串中第一次出现处的索引。             |
| 19       | int indexOf(String str, int fromIndex)                       | 返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。 |
| 20       | String intern()                                              | 返回字符串对象的规范化表示形式。                             |
| 21       | int lastIndexOf(int ch)                                      | 返回指定字符在此字符串中最后一次出现处的索引。               |
| 22       | int lastIndexOf(int ch, int fromIndex)                       | 返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 |
| 23       | int lastIndexOf(String str)                                  | 返回指定子字符串在此字符串中最右边出现处的索引。             |
| 24       | int lastIndexOf(String str, int fromIndex)                   | 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。 |
| 25       | int length()                                                 | 返回此字符串的长度。                                         |
| 26       | boolean matches(String regex)                                | 告知此字符串是否匹配给定的正则表达式。                       |
| 27       | boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) | 测试两个字符串区域是否相等。                                 |
| 28       | boolean regionMatches(int toffset, String other, int ooffset, int len) | 测试两个字符串区域是否相等。                                 |
| 29       | String replace(char oldChar, char newChar)                   | 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 |
| 30       | String replaceAll(String regex, String replacement)          | 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 |
| 31       | String replaceFirst(String regex, String replacement)        | 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 |
| 32       | String[] split(String regex)                                 | 根据给定正则表达式的匹配拆分此字符串。                       |
| 33       | String[] split(String regex, int limit)                      | 根据匹配给定的正则表达式来拆分此字符串。                     |
| 34       | boolean startsWith(String prefix)                            | 测试此字符串是否以指定的前缀开始。                           |
| 35       | boolean startsWith(String prefix, int toffset)               | 测试此字符串从指定索引开始的子字符串是否以指定前缀开始。     |
| 36       | CharSequence subSequence(int beginIndex, int endIndex)       | 返回一个新的字符序列，它是此序列的一个子序列。               |
| 37       | String substring(int beginIndex)                             | 返回一个新的字符串，它是此字符串的一个子字符串               |
| 38       | String substring(int beginIndex, int endIndex)               | 返回一个新字符串，它是此字符串的一个子字符串。               |
| 39       | char[] toCharArray()                                         | 将此字符串转换为一个新的字符数组。                           |
| 40       | String toLowerCase()                                         | 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 |
| 41       | String toLowerCase(Locale locale)                            | 使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。 |
| 42       | String toString()                                            | 返回此对象本身（它已经是一个字符串！）。                     |
| 43       | String toUpperCase()                                         | 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 |
| 44       | String toUpperCase(Locale locale)                            | 使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。 |
| 45       | String trim()                                                | 返回字符串的副本，忽略前导空白和尾部空白。                   |
| 46       | static String valueOf(primitive data type x)                 | 返回给定data type类型x参数的字符串表示形式。                 |



