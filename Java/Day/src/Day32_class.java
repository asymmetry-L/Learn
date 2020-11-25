
public class Day32_class {
	private static String name;
	public Day32_class(String name) {
		this.name = name;
	}
	public void newClass() {
		class Nclass{
			public void print() {
				
				System.out.println("外部类属性" + name);
			}
		}		
	}
	public static void main(String[] args) {
//		Day31_class day =  new Day31_class("张三");
//		Day31_class.Nclass nClass = day.new Nclass();
//		nClass.print();
//		new Nclass().print();	//静态内部类==>外部类（只能访问静态属性）
		
	}
}
