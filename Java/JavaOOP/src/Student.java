import java.util.Scanner;
public class Student {
	static Scanner scan = new Scanner(System.in);
	String[][] msgList = new String[30][7];
	//����ɴ洢30�˵���Ϣ
	//�洢˳��ѧ�ţ����������䣬���ĳɼ�����ѧ�ɼ����ܷ֣�ƽ����
	String studentCode;
	String name;
	String age;
	int gradeL;
	int gradeM;
	int score;
	double avgScore;
	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("==============================");
	System.out.println("=======ѧ���ɼ�����ϵͳ=======");
	System.out.println("==============================");
	System.out.print("�״�ʹ�ã�");
	}
	public int input() {
		int i = 0;
		
		while(true) {
			System.out.println("������ѧ����Ϣ��");
			System.out.print("ѧ��:");
//			if(scan.nextLine()=="" || !)
			this.msgList[i][0] = studentCode = scan.nextLine();
			System.out.print("����:");
			this.msgList[i][1] = name = scan.nextLine();
			System.out.print("����:");
			this.msgList[i][2] = age = scan.nextLine();
			System.out.print("���ĳɼ�:");
			this.gradeL = scan.nextInt();
			scan.nextLine();
			this.msgList[i][3] = "" + gradeL;
			System.out.print("��ѧ�ɼ�:");
			this.gradeM = scan.nextInt();
			scan.nextLine();
			this.msgList[i][4] = "" + this.gradeM;
			this.score = this.gradeL + this.gradeM;
			this.msgList[i][5] = "" + this.score;
			this.avgScore = this.score / 2;
			this.msgList[i][6] = "" + this.avgScore;
			i++;
			System.out.print("�Ƿ�¼����һ��ѧ��(y/n):");
			String stop = scan.next();
			if(stop.equals("n")|| i>=30) {break;}
		}
		return i;
	}
	public int input(int i) {
		
		while(true) {
			System.out.println("������ѧ����Ϣ��");
			System.out.print("ѧ��:");
//			if(scan.nextLine()=="" || !)
			this.msgList[i][0] = studentCode = scan.nextLine();
			System.out.print("����:");
			this.msgList[i][1] = name = scan.nextLine();
			System.out.print("����:");
			this.msgList[i][2] = age = scan.nextLine();
			System.out.print("���ĳɼ�:");
			this.gradeL = scan.nextInt();
			scan.nextLine();
			this.msgList[i][3] = "" + gradeL;
			System.out.print("��ѧ�ɼ�:");
			this.gradeM = scan.nextInt();
			scan.nextLine();
			this.msgList[i][4] = "" + this.gradeM;
			this.score = this.gradeL + this.gradeM;
			this.msgList[i][5] = "" + this.score;
			this.avgScore = this.score / 2;
			this.msgList[i][6] = "" + this.avgScore;
			i++;
			System.out.print("�Ƿ�¼����һ��ѧ��(y/n):");
			String stop = scan.next();
			if(stop.equals("n")|| i>=30) {break;}
		}
		return i;
	}
	public static void searchMsg(String[][] list,int times ) {
		while (true) {			
			System.out.print("��ѯѧ��:");
			String searchCode = scan.next();
			for(int i = 0;i < times; i++) {  //�����д�
				if(list[i][0].equals(searchCode)) {
					System.out.print("����:" + list[i][1] + "����:" + list[i][2] + "���ĳɼ�:" + list[i][3] + "��ѧ�ɼ�:" + list[i][4] + "�ܳɼ�:" + list[i][5] + "ƽ���ɼ�:" + list[i][6]);
				}
			}
			System.out.println("========================================");
			System.out.print("�Ƿ������ѯ(y/n)");
			if (scan.next().equals("n")) {
				break;
			}
		}
	}
	
	

	public static String getType(Object test) {
		return test.getClass().getName().toString();			
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Student sdt = new Student();
//		String choose = scan.next().toUpperCase();

		int time = sdt.input();
		searchMsg(sdt.msgList,time);
				
			
//		System.out.println(list.length);
	}

}
