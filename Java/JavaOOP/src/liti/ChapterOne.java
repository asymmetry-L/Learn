package liti;

public class ChapterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ͽ����");
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
		System.out.println("Բ�������" + area + "\n" + "Բ���ܳ���" + perimeter);
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
