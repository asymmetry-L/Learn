
public class Day05_lian1 {
	public static String getAuth() {
		String letter[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String code = "";
		for(int i=0;i<4;i++) {
			code+=letter[(int)(Math.random()*26)];
		}
		return code;
	}
	public static int sum() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void sum100() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void num() {
		int list[]= {5,6,11};
		int sum=0;
		for(int i=0;i<list.length;i++) {
			int a=1;
			for(int j=1;j<=list[i];j++) {
				a*=j;
			}
			sum+=a;
		}
		System.out.println(sum);
	}
	public static void main(String args[]) {
//		System.out.println(num());
		num();
	}
}
