import java.util.Scanner;
public class Day03_lian1 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("��һ��====================");
		
		for(int i=100;i>0;i-=5) {
			System.out.println(i);
		}

		System.out.println("�ڶ���====================");
		
		int numSix=0;
		for(int i=1;i<100;i++) {
			if(i%6==0) {
				numSix+=1;
			}
		}
		System.out.println(numSix);

		System.out.println("������====================");
		
		for(int i=100;i>0;i--) {
			if(i%3==2&&i%5==3&&i%7==2) {
				System.out.println(i);
			}
		}

		System.out.println("������====================");
		
//		System.out.print("����a��");
//		int a=scan.nextInt();
//		System.out.print("����b��");
//		int b=scan.nextInt();
//		System.out.print("����c��");
//		int c=scan.nextInt();
//		int max,min;
//		max=a>b ? (a>c ? a:c):(b>c ? b:c);
//		min=a<b ? (a<c ? a:c):(b<c ? b:c);
//		System.out.println("���ֵ��"+max);
//		System.out.println("��Сֵ��"+min);

		System.out.println("������====================");

		for(int i = 97;i<123;i++) {
			System.out.println((char)i+"�Ĵ�дΪ"+(char)(i-32));
		}

		System.out.println("������====================");
		
		int sum6 = 0;
		for(int i=0;i<=100;i++) {
			if(i%10!=3) {
				sum6+=i;
			}
		}
		System.out.println(sum6);

		System.out.println("������====================");
		
		float myMoney=10000f;
		for(int i=1;i<=5;i++) {
			myMoney=(float) (myMoney+myMoney*0.003);
		}
		System.out.println("5���Ϣ�ͣ�"+myMoney);

		System.out.println("�ڰ���====================");
		
		int oldNum,newNum,caNum;
		for(int j=1000;j<10000;j++) {
			oldNum=j;
			newNum=0;
			for(int i=1;i<5;i++) {
				caNum=oldNum%10;
				newNum=newNum+caNum*caNum*caNum*caNum;
				oldNum=oldNum/10;
			}
			if(newNum==j) {
				System.out.println(newNum);
			}
		}

		System.out.println("�ھ���====================");
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				String equation=i+"*"+j+"="+i*j;
				if(equation.length()<6) {
					equation=equation+" ";
				}
				System.out.print(equation+" ");
			}
			System.out.print("\n");
		}

		System.out.println("��ʮ��====================");
		
		int numTrigon=scan.nextInt();
		for(int i=numTrigon;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
