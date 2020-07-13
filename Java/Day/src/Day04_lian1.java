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
			System.out.println("����:\n1.�����ֵ\n2.�����ֵ��2��\n3.�����ֵ��3��\n4.�ж��Ƿ�Ϊż��\n5.�ж��Ƿ�Ϊ����\n6.�ж��Ƿ�Ϊˮ�ɻ���\n7.�˳�");
			while(true) {
			System.out.print("��ѡ���ܣ�");
			int choose=scan.nextInt();
			canPrint();
			switch(choose) {
			case 1:
				System.out.print("�����룺");
				int num1=scan.nextInt();
				System.out.println(getAbs(num1));
				break;
			case 2:
				System.out.print("������ֵa��");
				int num_a=scan.nextInt();
				System.out.print("������ֵb��");
				int num_b=scan.nextInt();
				System.out.println("���ֵ��"+getMax_2(num_a,num_b));
				break;
			case 3:
				System.out.print("������ֵx��");
				int num_x=scan.nextInt();
				System.out.print("������ֵy��");
				int num_y=scan.nextInt();
				System.out.print("������ֵz��");
				int num_z=scan.nextInt();
				System.out.println("���ֵ��"+getMax_3(num_x,num_y,num_z));
				break;
			case 4:
				System.out.print("�����룺");
				int num_e=scan.nextInt();
				if(isEven(num_e)) {
					System.out.println("����Ϊż��");
				}else {
					System.out.println("����Ϊ����");
				}
				break;
			case 5:
				System.out.print("��������ݣ�");
				int numYear=scan.nextInt();
				if(isLeap(numYear)) {
					System.out.println("����Ϊ����");
				}else {
					System.out.println("���겻������");
				}
				break;
			case 6:
				System.out.print("������һ����λ����");
				int num_s=scan.nextInt();
				if(isNarcissistic(num_s)) {
					System.out.println("����Ϊˮ�ɻ���");
				}else {
					System.out.println("��������ˮ�ɻ���");
				}
				break;
			case 7:
				System.exit(0);
		}
	}
}}
