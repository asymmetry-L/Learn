
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
		char sex = zhangliang.sex = '男';
		String major = zhangliang.major = "美术";
		String brithplace = zhangliang.birthplace = "山东";
		String hobby = zhangliang.hobby = "打篮球";
		System.out.println("年龄：" + ageZL);
		System.out.println("年龄：" + ageWD);
//		byte b = 50;
//		b = (byte)(b * 2);
//		System.out.println(b);
	}

}
