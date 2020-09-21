package liti;

public class ChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("法外狂徒张三");
		System.out.println("==========================");
		
		
		int sum = 0;
		for(int i=0; i<=10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("==========================");
		
		
		double r = 5.5;
		double area = Math.PI * r * r;
		double perimeter = Math.PI * 2 * r;
		System.out.println("圆的面积：" + area + "\n" + "圆的周长：" + perimeter);
		System.out.println("==========================");
		
		
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 1;j <= i; j++) {
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("==========================");
	}

}
