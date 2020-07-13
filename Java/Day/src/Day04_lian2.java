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
			System.out.print("������γ̴��룺");
			String classCode=scan.next();
			switch(classCode) {
			case "1":
				System.out.println("ʹ��Java�����������߼�");
				break;
			case "2":
				System.out.println("ʹ��HTML���Կ�����ҵվ��");
				break;
			case "3":
				System.out.println("ʹ��SQL Server����Ͳ�ѯ����");
				break;
			case "4":
				System.out.println("ʹ��C#�������ݿ�Ӧ�ó���");
				break;
			case "n":
				System.exit(0);
			}
		}
	}
	public static void getRenum() {
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ������");
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
			System.out.print("��Ĵ𰸣�");
			youNum=scan.nextInt();
			if(youNum==num) {
				if(i==1) {
					System.out.println("��̫���ˣ�");
				}else if(i>1&&i<7) {
					System.out.println("��ô��Ͳ³����ˣ��ܴ���ô��");
				}else {
					System.out.println("���˰���Ų³�����Сͬ־������Ŭ������");
				}
				System.out.println("������Ϸ����"+i+"�ξ͵õ���ȷ���ˣ�");
				break;
			}else if(youNum<num) {
				System.out.println("С��");
			}else if(youNum>num) {
				System.out.println("����");
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
