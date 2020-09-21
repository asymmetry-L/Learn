
public class Day02 {
	public static void main(String args[])
	{
//		float score=56.5f;
//		if(score>=0&&score<=100)
//		{
//			if(score>=85&&score<=100)
//			{
//				System.out.println("牛13！！");
//			}
//			else if(score>=60&&score<85)
//			{
//				System.out.println("及格");
//			}
//			else
//			{
//				System.out.println("叫家长！！");
//			} 
//		}
		
		
		int month=12;
		if(month>=1&&month<=12) {
			if(month>=3&&month<=5){
				System.out.println("春天");
			}else if(month>=6&&month<=8) {
				System.out.println("夏天");
			}else if(month>=9&&month<=11) {
				System.out.println("秋天");
			}else {
				System.out.println("冬天");
			}
			
		}
//		System.out.println(month/3);
		if(month>=1&&month<=12) {
			switch(month/4) {
			case 1:
				System.out.println("春天");
				break;
			case 2:
				System.out.println("夏天");
				break;
			case 3:
				System.out.println("秋天");
				break;
			default:
				System.out.println("冬天");
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
