import java.util.Scanner;

public class Day06_lian2 {
	public static void isPrime() {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num=scan.nextInt();
		int factor=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				factor+=1;
			}
		}
		if(factor>2) {
			System.out.println("该数不是一个质数");
//			break;
		}else {
			System.out.println("这是个质数");
		}
	}
	public static void nPrint() {
		char love[]= {'我','爱','你'};
		for(int i=love.length-1;i>=0;i--) {
			System.out.print(love[i]);
		}
	}
	public static void score() {
		Scanner scan=new Scanner(System.in);
		int score[]=new int [8];
		int sum=0;
		for(int i=0;i<8;i++) {
			System.out.println("请输入成绩：");
			score[i]=scan.nextInt();
			sum+=score[i];
		}
		float avg=(float)(sum/8);
		for(int i=1;i<score.length;i++) {
			int caNum=0;
			for(int j=0;j<score.length-1;j++) {
				if(score[j]<score[j+1]) {
					caNum=score[j];
					score[j]=score[j+1];
					score[j+1]=caNum;
				}
			}
		}
		System.out.println("平均成绩："+avg+"\n最高分："+score[0]+"\n最低分"+score[score.length-1]);
	}
	public static void printStar() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<9;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static String[] register() {
		Scanner scan=new Scanner(System.in);
		String msg[]=new String[2];
		System.out.println("=============================");
		System.out.println("=============注册===========");
		System.out.println("=============================");
		while(true){
			System.out.print("用户名：");
			String userName=scan.next();
			System.out.print("密  码：");
			String password=scan.next();
			System.out.print("确认密码：");
			String rePassword=scan.next();
			if(!rePassword.equals(password)) {
				System.out.println("输入密码不一致");
			}else {
				msg[0]=userName;
				msg[1]=password;
				System.out.println("注册成功");
				break;
			}
		}
		return msg;
	}
	public static boolean logIn(String msg[]) {
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("=============================");
		System.out.println("=============登陆===========");
		System.out.println("=============================");
		for(int i=0;i<3;i++) {
			System.out.print("用户名：");
			String userName=scan.next();
			if(userName.equals(msg[0])) {
				System.out.print("密  码：");
				String password=scan.next();
				if(password.equals(msg[1])) {
					flag=true;
					System.out.println("登陆成功！");
					break;
				}else {
					System.out.println("密码错误");
					continue;
				}
			}else {
				System.out.println("未找到用户信息");
				continue;
			}
		}
		return flag;
	}
	public static void main(String args[]) {
//		isPrime();
//		nPrint();
//		score();
//		printStar();
		String massage[]=register();
		logIn(massage);

	}
}
