
public class Day02_lian1 {
	public static void main(String args[]) {
		
		System.out.println("第一题=======================");
		
		for(int j=0;j<4;j++) {
			for(int i=0;i<11;i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("第二题=======================");

		for(int i=0;i<4;i++) {
			for(int k=0;k<i*2;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<11;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("第三题=======================");
		
		for(int i=1;i<=5;i++) {
			for(int k=0;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("第四题=======================");
		
		int num=123,opNum=num;
		int result=0;
		for(int i=1;i<=3;i++) {
			result=result+opNum%10;
			opNum/=10;
		}
		System.out.println("整数"+ num + "的各个位数之和为：" +result);

		System.out.println("第六题=======================");
		
		int num1=1;
		if(num1<0) {
			num1*=-1;
		}
		System.out.println("绝对值为：" + num1);
		
		System.out.println("第七题=======================");
		
		int a=2,b=3,c=0;
		if(a<b) {
			c=b;
		}else {
			c=a;
		}
		System.out.println("最大值为：" + c);

		System.out.println("第八题=======================");
		
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
		System.out.println("最小值："+i+"\n最大值："+k);

		System.out.println("第九题=======================");
		
		int isNum=123;
		if(isNum%2==0) {
			System.out.println("这是一个偶数");
		}else {
			System.out.println("这是一个奇数");
		}

		System.out.println("第十题=======================");
		
		int oldNum=153,newNum=0,caNum=0;
		for(int o=0;o<3;o++) {
			caNum=oldNum%10;
			newNum=newNum+caNum*caNum*caNum;
			oldNum/=10;
		}
		System.out.println(newNum);

		System.out.println("思考题=======================");
		
		/*
		 * 100:要求不添钱，不找钱，买：
		 * w.毛巾  10
		 * x.香皂  4
		 * y.牙刷   2
		 * z.洗发水 1
		 * 问：有多少种买法？
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
