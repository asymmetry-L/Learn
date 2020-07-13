import java.util.Scanner;

public class Day06_hui {
	public static void main(String args[]) {
		int score[]=new int[10];
		int length=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.print("ÇëÊäÈë³É¼¨(999ÍË³ö)£º");
			int item=scan.nextInt();
			if(item==999) {
				break;
			}
			score[i]=item;
			length++;
			
		}
		int score_s[]=new int[length];
		for(int i=1;i<length;i++) {
			int caNum=0;
			for(int j=0;j<length-1;j++) {
				if(score[j]>score[j+1]) {
					caNum=score[j];
					score[j]=score[j+1];
					score[j+1]=caNum;
				}
			}
		}
		for(int item:score_s) {
			System.out.print(item+",");
		}
	}
}
