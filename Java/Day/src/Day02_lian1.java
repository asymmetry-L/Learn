
public class Day02_lian1 {
	public static void main(String args[]) {
		
		System.out.println("��һ��=======================");
		
		for(int j=0;j<4;j++) {
			for(int i=0;i<11;i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("�ڶ���=======================");

		for(int i=0;i<4;i++) {
			for(int k=0;k<i*2;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<11;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("������=======================");
		
		for(int i=1;i<=5;i++) {
			for(int k=0;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("������=======================");
		
		int num=123,opNum=num;
		int result=0;
		for(int i=1;i<=3;i++) {
			result=result+opNum%10;
			opNum/=10;
		}
		System.out.println("����"+ num + "�ĸ���λ��֮��Ϊ��" +result);

		System.out.println("������=======================");
		
		int num1=1;
		if(num1<0) {
			num1*=-1;
		}
		System.out.println("����ֵΪ��" + num1);
		
		System.out.println("������=======================");
		
		int a=2,b=3,c=0;
		if(a<b) {
			c=b;
		}else {
			c=a;
		}
		System.out.println("���ֵΪ��" + c);

		System.out.println("�ڰ���=======================");
		
		int i=15,j=9,k=10,m=0;
		if(i>j) {
			m=i;
			i=j;
			j=m;
		}
		if(j>k) {
			m=j;
			j=k;
			k=m;
		}
		System.out.println("��Сֵ��"+i+"\n���ֵ��"+k);

		System.out.println("�ھ���=======================");
		
		int isNum=123;
		if(isNum%2==0) {
			System.out.println("����һ��ż��");
		}else {
			System.out.println("����һ������");
		}

		System.out.println("��ʮ��=======================");
		
		int oldNum=153,newNum=0,caNum=0;
		for(int o=0;o<3;o++) {
			caNum=oldNum%10;
			newNum=newNum+caNum*caNum*caNum;
			oldNum/=10;
		}
		System.out.println(newNum);

		System.out.println("˼����=======================");
		
		/*
		 * 100:Ҫ����Ǯ������Ǯ����
		 * w.ë��  10
		 * x.����  4
		 * y.��ˢ   2
		 * z.ϴ��ˮ 1
		 * �ʣ��ж������򷨣�
		 */
		int idea=0;
		//ya
		for(int w=1;w<11;w++) {
			for(int x=1;x<26;x++) {
				for(int y=1;y<51;y++) {
					for(int z=1;z<101;z++) {
						if(w*10+x*4+y*2+z*1==100) {
							idea+=1;
						}
					}
				}
			}
		}
		System.out.println(idea);

	}

}
