```java
不能以数字开头
    只能包含美元符，字母，数字，下划线
    不能为Java关键字
    
    四类八种
    byte
    short
    int
    long
    
    float
    double
    
    boolean:true/false
        
    char
        
        String类：专门处理字符串的一个类
        常用方法：
        String str="10000";
		str.length();
		str.charAt();
		str.equals();

Scanner类
import java.util.Scanner;
Scanner scan=new Scanner(System.in);
scan.next();
scan.nextInt();
scan.nextLine();
		
```

```java
数组
    int[] list=new int[i]
    int list1[]={1,2,3}


for(int i=1;i<list1.length;i++){
    int caNum=0;
    for(int j=0;j<list1.length-1;j++){
        if(list1[j]<list1[j+1])
            caNum=list1[j];
        	list1[j]=list1[j+1];
        	list[j+i]=caNum;
    }
}
```

```java
张三t：
    1-0=1,0-1=-1,(1-1)*(1-0)=0
    T,F,T
    T,F,Z==T&&L==T =>F
李四t:
//张三李四有一个没说谎
	0-1=-1,1-0=1,(0-0)*(0-1)=0
    F,T,F
        F,T, !(Z==F&&L==F)
//张三李四都没说谎
	1-1=0,1-0=1,(0-1)*(0-1)=1
    F,T,T
王五t:
	0-0=0,0-1=-1,(1-0)*(1-0)=1
    F,F,T
        Z==F? =>T,F,Z==F&&L==F =>T
        
```





