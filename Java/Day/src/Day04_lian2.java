import java.util.Scanner;

public class Day04_lian2 {
	public static void printNum() {
		for(int i=1;i<=1000;i++) {
			if(i!=5&&i!=50&&i!=500) {
				System.out.println(i);
			}
		}
	}
	public static void getNum_sheep() {
		for(int i=1;i<=200;i++){
			if(i%4==2&&i%7==3&&i%9==5) {
				System.out.println(i);
			}
		}
	}
	public static void print3() {
		int j=0;
		for(int i=1;i<=100;i++) {
			if(j%3==0) {
				System.out.print("\n");
			}
			if(i%3!=0) {
				System.out.print(i+" ");
				j+=1;
			}
			
//			if(j%3==0) {
//			}
		}
	}
	public static int getWater() {
		int j=0;
		for(int i=15;i<50;i+=5) {
			j+=1;
		}
		return j;
	}
	public static int getNum1() {
		int sum=0;
		for(int i=1;i<100;i+=2) {
			sum=+i;
		}
		return sum;
	}
	public static int getNum2() {
		int sum=0;
		for(int i=0;i<9;i++) {
			sum+=Math.pow(2, i);
		}
		return sum;
	}
	public static int getDay(int year,int month) {
		int day = 0;
		switch(month) {
		case 2:
			if(year%4==0&&year%100!=0||year%400==0) {
				day=29;
			}else {
				day=28;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		}
		return day;
	}
	public static void getClass1() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("请输入课程代码：");
			String classCode=scan.next();
			switch(classCode) {
			case "1":
				System.out.println("使用Java语言理解程序逻辑");
				break;
			case "2":
				System.out.println("使用HTML语言开发商业站点");
				break;
			case "3":
				System.out.println("使用SQL Server管理和查询数据");
				break;
			case "4":
				System.out.println("使用C#开发数据库应用程序");
				break;
			case "n":
				System.exit(0);
			}
		}
	}
	public static void getRenum() {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int newNum=0,caNum=0;
		int num=scan.nextInt();
		for(;num>0;num/=10) {
			caNum=num%10;
			newNum=newNum*10+caNum;
		}
		System.out.println(newNum);
	}
	public static void numGame() {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*100);
		int youNum=0;
		for(int i=0;i<20;i++) {
			System.out.print("你的答案：");
			youNum=scan.nextInt();
			if(youNum==num) {
				if(i==1) {
					System.out.println("你太棒了！");
				}else if(i>1&&i<7) {
					System.out.println("这么快就猜出来了，很聪明么！");
				}else {
					System.out.println("猜了半天才猜出来，小同志，尚需努力啊！");
				}
				System.out.println("本次游戏用了"+i+"次就得到正确答案了！");
				break;
			}else if(youNum<num) {
				System.out.println("小了");
			}else if(youNum>num) {
				System.out.println("大了");
			}
		}
	}
	public static void main(String args[]) {
//				getNum_sheep();
//		print3();
//		System.out.print(getNum2());
//		getClass1();
//		getRenum();
		numGame();
		
	}
}
