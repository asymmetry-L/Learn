
public class FirstObjStudent {
	
	char sex;
	int age;
	String major;
	String birthplace;
	String hobby;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstObjStudent zhangliang = new FirstObjStudent();
		int ageZL = zhangliang.age = 19;
		int ageWD = zhangliang.age = 20;
		char sex = zhangliang.sex = '��';
		String major = zhangliang.major = "����";
		String brithplace = zhangliang.birthplace = "ɽ��";
		String hobby = zhangliang.hobby = "������";
		System.out.println("���䣺" + ageZL);
		System.out.println("���䣺" + ageWD);
//		byte b = 50;
//		b = (byte)(b * 2);
//		System.out.println(b);
	}

}
