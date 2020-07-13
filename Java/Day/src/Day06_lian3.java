import java.util.Scanner;

public class Day06_lian3 {
	public static void avgNum() {
		Scanner scan=new Scanner(System.in);
		float score[]=new float[10];
		float caNum=0,sum=0,avg=0;
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"号评委打分:");
			score[i]=scan.nextFloat();
		}
		for(int i=1;i<score.length;i++) {
			for(int j=0;j<score.length-1;j++) {
				if(score[j]<score[j+1]) {
					caNum=score[j];
					score[j]=score[j+1];
					score[j+1]=caNum;
				}
			}
		}
		score[0]=score[score.length-1]=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		avg=sum/(score.length-2);
		System.out.println("平均分："+avg);
	}
	public static void plateNum() {
		int num=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				num=i*1100+j*11;
				for(int k=1;k<100;k++) {
					if(k*k==num) {
						System.out.println(num+"  "+k);
					}
				}
//				System.out.println(num);
			}
		}
	}
	public static void isLie() {
		int z=0,l=0,w=1;
		int three=0,four=0,five=0;
		three=z-l;
		four=l-w;
		five=w-z-l;
		System.out.println("张三"+three+"\n李四"+four+"\n王五"+five);
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				for(int k=0;k<2;k++) {
//				}
//			}
//		}
	}
//	public static void isLie2() {
//		int z=1,l=1,w=1;
//		int three=0,four=0,five=0;
//		if(z-three==0) {
//			
//		}
//	}
	public static void main(String args[]) {
//		avgNum();
//		plateNum();
//		byte a=0;
//		System.out.println((boolean)(a));
		isLie();
	}
}
