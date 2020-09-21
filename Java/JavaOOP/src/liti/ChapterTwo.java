package liti;

import java.util.Scanner;

public class ChapterTwo {
	Scanner scan = new Scanner(System.in);
	String name;
	String sex;
	public String setSex(String str) {
//		sex = scan.nextLine();
		this.sex = str;
		return this.sex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChapterTwo zhangsan = new ChapterTwo();
		ChapterTwo lisi = new ChapterTwo();
		zhangsan.name = "ÕÅÈý";
		zhangsan.sex = zhangsan.setSex("ÄÐ");
		lisi.sex = lisi.setSex("Å®");
		System.out.println(zhangsan.sex + "\n" + lisi.sex);
	}

}