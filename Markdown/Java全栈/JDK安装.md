# JDK下载

下载地址 (官网)：[Java SE 8注册就送](https://www.oracle.com/cn/java/technologies/javase/javase-jdk8-downloads.html))(需要注册账号并登录)

下载地址 (华为云镜像)：[Java SE 8点击就送](https://repo.huaweicloud.com/java/jdk/)(无需注册，但版本上传有一定时间延迟)

![华为云下载页面](D:\Code\Markdown\Java全栈\img\下载页面.png)

>   注：注意下载与系统版本**对应**的JDK

# JDK安装

下载后双击![JDK安装包](D:\Code\Markdown\Java全栈\img\安装包.png)此安装包（例如我下载的是8U202，windows64位版本，点击自己的就行了），傻瓜式下一步就可以了。But要注意在下面的页面中建议更改安装路径，相信我，你不会想体验C盘满了的感觉。![更改路径](D:\Code\Markdown\Java全栈\img\路径.png)

注：一定要记住这个路径，后面设置环境变量时要用！！！非常重要。

之后jre的安装也是类似操作。

# 设置环境变量

## 进入环境变量

右击**此电脑** >> 右侧**高级系统设置** >> **环境变量** 进入如下界面

![环境变量](D:\Code\Markdown\Java全栈\img\环境变量.png)

+   在这里**用户变量**，和**系统变量**类似，区别在于**系统变量**对此电脑上的所有用户起作用，而**用户变量**只对当前用户，即**设置了用户变量的的用户**起作用。

## 设置环境变量

### JAVA HOME

![JAVA HOME](D:\Code\Markdown\Java全栈\img\JAVA HOME.png)

+   变量名注意大写和中间的下划线
+   变量值就填安装JDK是修改的安装路径

### PATH

![PATH](D:\Code\Markdown\Java全栈\img\Path.png)

+   win 10
    +   点击新建填入<code>%JAVA_HOME%\bin</code>
    +   再次点击新建填入<code>%JAVA_HOME%\jre\bin</code>
+   win 7
    +   点击编辑
        +   注意：点击后Path中的值属于选中状态，不要直接更改，点击方向右键取消文本选中
    +   粘贴<code>;%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin</code>
        +   注意：不要漏掉前面的分号

### CLASSPATH

+   在JDK1.8版本中**CLASSPATH**可有可无
+   如果强迫症非要设置**CLASSPATH**可复制<code>.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar</code>
+   注意：依然要注意前面的小数点和分号

# 检测JDK安装

win + R打开运行窗口输入**cmd**

![cmd](D:\Code\Markdown\Java全栈\img\cmd.png)

分别键入以下命令

```
java -version
javac
```

出现这样的界面即说明JDK安装成功

![cmdtips](D:\Code\Markdown\Java全栈\img\cmdtips.png)



# Hello World

1.  新建文本文档
2.  输入代码

```java
public class HelloWorld{
    //HelloWorld 即是类名
    public static void main(String args[]){
        Syetem.out.println("Hello World!");
    }
}
```

3.  点击**文件** >> **保存** ，或直接**Ctrl + S**保存
4.  右键文件**重命名**，并将文件名改为<code>类名.java</code>
    +   重命名文件夹前需要显示出文件拓展名
5.  按照之前方法打开**cmd**窗口，并进入存放代码的文件
    +   盘符加冒号,如C盘就是<code>C:</code>
    +   <code>dir</code>可以遍历当前文件夹，即显示当文件夹所含的文件夹和文件
    +   <code>cd 文件夹名</code>可以进入文件夹
6.  输入<code>javac HelloWord.java</code>编译Java代码
7.  输入<code>java HelloWord</code>运行代码

注：

1.  显示文件拓展名
	+   win 10![win10拓展名](D:\Code\Markdown\Java全栈\img\win10拓展名.png)勾选文件拓展名
	+   win 7
	    +   打开任意文件夹
	    +   右上角**工具** >>**文件夹选项** >> **查看**
	    +   在高级设置中取消勾选**隐藏已知文件类型的拓展名**
	    +   点击右下角**应用** >> **确定**
2.  如果不进行第**6**步**cmd**会提示找不到主类



