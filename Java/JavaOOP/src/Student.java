import java.util.Scanner;
public class Student {
	static Scanner scan = new Scanner(System.in);
	String[][] msgList = new String[30][7];
	//数组可存储30人的信息
	//存储顺序：学号，姓名，年龄，语文成绩，数学成绩，总分，平均分
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
	System.out.println("=======学生成绩管理系统=======");
	System.out.println("==============================");
	System.out.print("首次使用，");
	}
	public int input() {
		int i = 0;
		
		while(true) {
			System.out.println("请输入学生信息：");
			System.out.print("学号:");
//			if(scan.nextLine()=="" || !)
			this.msgList[i][0] = studentCode = scan.nextLine();
			System.out.print("姓名:");
			this.msgList[i][1] = name = scan.nextLine();
			System.out.print("年龄:");
			this.msgList[i][2] = age = scan.nextLine();
			System.out.print("语文成绩:");
			this.gradeL = scan.nextInt();
			scan.nextLine();
			this.msgList[i][3] = "" + gradeL;
			System.out.print("数学成绩:");
			this.gradeM = scan.nextInt();
			scan.nextLine();
			this.msgList[i][4] = "" + this.gradeM;
			this.score = this.gradeL + this.gradeM;
			this.msgList[i][5] = "" + this.score;
			this.avgScore = this.score / 2;
			this.msgList[i][6] = "" + this.avgScore;
			i++;
			System.out.print("是否录入下一名学生(y/n):");
			String stop = scan.next();
			if(stop.equals("n")|| i>=30) {break;}
		}
		return i;
	}
	public int input(int i) {
		
		while(true) {
			System.out.println("请输入学生信息：");
			System.out.print("学号:");
//			if(scan.nextLine()=="" || !)
			this.msgList[i][0] = studentCode = scan.nextLine();
			System.out.print("姓名:");
			this.msgList[i][1] = name = scan.nextLine();
			System.out.print("年龄:");
			this.msgList[i][2] = age = scan.nextLine();
			System.out.print("语文成绩:");
			this.gradeL = scan.nextInt();
			scan.nextLine();
			this.msgList[i][3] = "" + gradeL;
			System.out.print("数学成绩:");
			this.gradeM = scan.nextInt();
			scan.nextLine();
			this.msgList[i][4] = "" + this.gradeM;
			this.score = this.gradeL + this.gradeM;
			this.msgList[i][5] = "" + this.score;
			this.avgScore = this.score / 2;
			this.msgList[i][6] = "" + this.avgScore;
			i++;
			System.out.print("是否录入下一名学生(y/n):");
			String stop = scan.next();
			if(stop.equals("n")|| i>=30) {break;}
		}
		return i;
	}
	public static void searchMsg(String[][] list,int times ) {
		while (true) {			
			System.out.print("查询学号:");
			String searchCode = scan.next();
			for(int i = 0;i < times; i++) {  //疑似有错
				if(list[i][0].equals(searchCode)) {
					System.out.print("姓名:" + list[i][1] + "年龄:" + list[i][2] + "语文成绩:" + list[i][3] + "数学成绩:" + list[i][4] + "总成绩:" + list[i][5] + "平均成绩:" + list[i][6]);
				}
			}
			System.out.println("========================================");
			System.out.print("是否继续查询(y/n)");
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
