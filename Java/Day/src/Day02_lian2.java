
public class Day02_lian2 {
	public static void main(String args[]) {
		
		System.out.println("��һ��====================");
		
		int x=10,y=10;
		System.out.println((x++)>10 ? (++y+(++x)) : (--y+--x));
		
		int a=1;
		System.out.println((a++)+(++a)+(++a)+(a++)+(a--));

		System.out.println("�ڶ���====================");
		
		int year=2020;
		if(year%4==0&&(year%100!=0)||year%400==0) {
			System.out.println("����������");
		}

		System.out.println("������====================");
		
		int b=100,c=100;
		for(int i=100;i>0;) {
			while(b>=1) {
				do {
					System.out.println(i+"  "+b+"  "+c);
					b--;
					i--;
					c--;
				}while(c>=1);
			}
		}
		
		System.out.println("������====================");
	
		int money=666;
		switch(money/100) {
		case 0:
			System.out.println("��Ԫ������Ʒ");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("100-500Ԫ֮�䣨����500Ԫ����Ʒ");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("500-1000Ԫ��Ʒ");
			break;
		default:
			System.out.println("1000Ԫ������Ʒ");
		}
		
		System.out.println("������====================");
	
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("������====================");
	
		for(int i=50;i<100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		System.out.println("������====================");
	
		int sum7=0;
		for(int i=1;i<=100;i++) {
			sum7+=i;
		}
		System.out.println(sum7);
				
		System.out.println("�ڰ���====================");
	
		int sum8=1;
		for(int i=1;i<=10;i++) {
			sum8*=i;
		}
		System.out.println(sum8);
		
		System.out.println("�ھ���====================");
	
		double sum9=1L;
		for(int i=1;i<=100;i++) {
			sum9=sum9*i;
		}
		System.out.println(sum9);
		
		System.out.println("��ʮ��====================");
	
		for(int i=0;i<=100;i++) {
			if(i%2==0&&i%3!=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("��չ��====================");
	
		long caNum=1L,numT=0L;
		for(int i=1;i<=10;i++) {
			caNum*=i;
			numT+=caNum;
		}
		System.out.println(numT);
	}
}
