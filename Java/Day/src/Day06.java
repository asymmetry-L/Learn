import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age[][]= {{"����","30"},{"����","28"},{"����","35"},{"����","19"}};
		Scanner scan=new Scanner(System.in);
		String name[][]=new String[2][4];
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name[i].length;j++) {
				name[i][j]=scan.next();
			}
		}
		for(int i=0;i<name.length;i++) {
			for(String j:name[i]) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=0;i<age.length;i++) {
			for(String j:age[i]) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
