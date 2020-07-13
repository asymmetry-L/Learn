import java.util.Scanner;
public class Day04_lian1 {
	public static void canPrint() {
		System.out.println("---------------------------------");
	}
	public static int getAbs(int a) {
		if(a<0) {
			a=-(a);
		}
		return a;
	}
	public static int getMax_2(int a,int b) {
		int max;
		max=a<b ? b:a;
		return max;
	}
	public static int getMax_3(int a,int b,int c) {
		int max;
		max = a>b ? (a>c ? a:c):(b>c ? b:c);
		return max;
	}
	public static boolean isEven(int a) {
		boolean t=true;
		boolean f=false;
		if(a%2==0) {
			return t;
		}else {
			return f;
		}
	}
	public static boolean isLeap(int year) {
		boolean t=true;
		boolean f=false;
		if(year%4==0&&year%100!=0||year%400==0) {
			return t;
		}else {
			return f;
		}
	}
	public static boolean isNarcissistic(int num) {
		boolean t=true;
		boolean f=false;
		int oldNum=num,newNum=0,caNum=0;
		for(int i=0;i<3;i++) {
			caNum=oldNum%10;
			newNum=newNum+caNum*caNum*caNum;
			oldNum=oldNum/10;
		}
		if(newNum==num) {
			return t;
		}else {
			return f;
		}
	}
	public static void printIs(boolean is) {
		if(is) {
			System.out.println("Yes!");
		}else {
			System.out.println("No!");
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
			System.out.println("功能:\n1.求绝对值\n2.求最大值（2）\n3.求最大值（3）\n4.判断是否为偶数\n5.判断是否为闰年\n6.判断是否为水仙花数\n7.退出");
			while(true) {
			System.out.print("请选择功能：");
			int choose=scan.nextInt();
			canPrint();
			switch(choose) {
			case 1:
				System.out.print("请输入：");
				int num1=scan.nextInt();
				System.out.println(getAbs(num1));
				break;
			case 2:
				System.out.print("请输入值a：");
				int num_a=scan.nextInt();
				System.out.print("请输入值b：");
				int num_b=scan.nextInt();
				System.out.println("最大值："+getMax_2(num_a,num_b));
				break;
			case 3:
				System.out.print("请输入值x：");
				int num_x=scan.nextInt();
				System.out.print("请输入值y：");
				int num_y=scan.nextInt();
				System.out.print("请输入值z：");
				int num_z=scan.nextInt();
				System.out.println("最大值："+getMax_3(num_x,num_y,num_z));
				break;
			case 4:
				System.out.print("请输入：");
				int num_e=scan.nextInt();
				if(isEven(num_e)) {
					System.out.println("该数为偶数");
				}else {
					System.out.println("该数为奇数");
				}
				break;
			case 5:
				System.out.print("请输入年份：");
				int numYear=scan.nextInt();
				if(isLeap(numYear)) {
					System.out.println("该年为闰年");
				}else {
					System.out.println("该年不是闰年");
				}
				break;
			case 6:
				System.out.print("请输入一个三位数：");
				int num_s=scan.nextInt();
				if(isNarcissistic(num_s)) {
					System.out.println("该数为水仙花数");
				}else {
					System.out.println("该数不是水仙花数");
				}
				break;
			case 7:
				System.exit(0);
		}
	}
}}
