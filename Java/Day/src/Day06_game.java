import java.util.Scanner;

public class Day06_game {
	//用户回合
	public static int userTB(String uPkm) {
		String skill[]= {"石头","剪刀","布"};
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("技能：\n1.石头    2.剪刀    3.布\n使用：");
		int user=scan.nextInt();
		if(user>3) {
			System.out.println("指令无效，已退出");
			return 999;
		}else {
			System.out.print(uPkm+"使用了"+skill[user-1]+"\n");
			return user;			
		}
	}
	//电脑选择
	public static String ranPkm() {
		String role[]= {"杰尼龟(PC)","小火龙(PC)","妙蛙种子(PC)"};
		int cmtChoose=(int) (Math.random()*3);
		return role[cmtChoose];
	}
	//电脑回合
	public static int computerTB(String uPkm) {
		String skill[]= {"石头","剪刀","布"};
		int cmt=(int) (Math.random()*3);
		System.out.print(uPkm+"使用了"+skill[cmt]+"\n");
		return cmt;
	}
	//比较
	public static int fight(int user,int cmt) {
		int result=0;
//		String result[][]= {{"胜",""},{"平",""},{"败",""}};
		if(user<cmt) {
			result=-1;
		}else if(user==cmt) {
			result=0;
		}else if(user>cmt) {
			result=1;
		}
		return result;
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("石头，剪刀，布,输入无效指令退出");
		//选择角色
		String role[]= {"杰尼龟","小火龙","妙蛙种子"};
		System.out.print("1.杰尼龟    2.小火龙    3.妙蛙种子\n请选择精灵：");
		String pkm=role[scan.nextInt()-1];
		System.out.print("就决定是你了"+pkm+"\n");
		String cptPkm=ranPkm();
		System.out.println("电脑精灵"+cptPkm+"\n\n");
		//运算
		int win=0,lose=0,draw=0;
		while(true) {
			int user=userTB(pkm);
			if(user==999) {
				break;
			}
			int computer=computerTB(cptPkm);
			int result=fight(user,computer);
			switch(result) {
			case -1:
				System.out.println(cptPkm+"胜");
				lose+=1;
			case 0:
				System.out.println("平局");
				draw+=1;
			case 1:
				System.out.println(pkm+"胜");
				win+=1;
			}
		}
		System.out.println("胜："+win+"\n平："+draw+"\n输："+lose);
		
		
	}
}
