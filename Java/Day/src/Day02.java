
public class Day02 {
	public static void main(String args[])
	{
//		float score=56.5f;
//		if(score>=0&&score<=100)
//		{
//			if(score>=85&&score<=100)
//			{
//				System.out.println("ţ13����");
//			}
//			else if(score>=60&&score<85)
//			{
//				System.out.println("����");
//			}
//			else
//			{
//				System.out.println("�мҳ�����");
//			} 
//		}
		
		
		int month=12;
		if(month>=1&&month<=12) {
			if(month>=3&&month<=5){
				System.out.println("����");
			}else if(month>=6&&month<=8) {
				System.out.println("����");
			}else if(month>=9&&month<=11) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
			
		}
//		System.out.println(month/3);
		if(month>=1&&month<=12) {
			switch(month/4) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			default:
				System.out.println("����");
			}
		}
		
		System.out.println("===================================");
		for(int i=1;i<=10;i++) {
			System.out.println(11-i);
			System.out.println(i);
		}
		int j=0;
		int sum = 0;
		while(j<10) {
			j++;
			sum+=j;
		}
		System.out.println(sum);
	}
}
