import java.util.Scanner;

public class Day06_lian2 {
	public static void isPrime() {
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ������");
		int num=scan.nextInt();
		int factor=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				factor+=1;
			}
		}
		if(factor>2) {
			System.out.println("��������һ������");
//			break;
		}else {
			System.out.println("���Ǹ�����");
		}
	}
	public static void nPrint() {
		char love[]= {'��','��','��'};
		for(int i=love.length-1;i>=0;i--) {
			System.out.print(love[i]);
		}
	}
	public static void score() {
		Scanner scan=new Scanner(System.in);
		int score[]=new int [8];
		int sum=0;
		for(int i=0;i<8;i++) {
			System.out.println("������ɼ���");
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
		System.out.println("ƽ���ɼ���"+avg+"\n��߷֣�"+score[0]+"\n��ͷ�"+score[score.length-1]);
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
		System.out.println("=============ע��===========");
		System.out.println("=============================");
		while(true){
			System.out.print("�û�����");
			String userName=scan.next();
			System.out.print("��  �룺");
			String password=scan.next();
			System.out.print("ȷ�����룺");
			String rePassword=scan.next();
			if(!rePassword.equals(password)) {
				System.out.println("�������벻һ��");
			}else {
				msg[0]=userName;
				msg[1]=password;
				System.out.println("ע��ɹ�");
				break;
			}
		}
		return msg;
	}
	public static boolean logIn(String msg[]) {
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("=============================");
		System.out.println("=============��½===========");
		System.out.println("=============================");
		for(int i=0;i<3;i++) {
			System.out.print("�û�����");
			String userName=scan.next();
			if(userName.equals(msg[0])) {
				System.out.print("��  �룺");
				String password=scan.next();
				if(password.equals(msg[1])) {
					flag=true;
					System.out.println("��½�ɹ���");
					break;
				}else {
					System.out.println("�������");
					continue;
				}
			}else {
				System.out.println("δ�ҵ��û���Ϣ");
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
