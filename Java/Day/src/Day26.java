class Car{
	String color;
	String brand;
	public void run() {
		System.out.println("时速180");
	}
	public void stop() {
		System.out.println("刹车");
	}
}
public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = car1;
		car1.color = "red";
		car1.brand = "大奔";
		car1.run();
		car1.stop();
		System.out.println("起飞");
		System.out.println(car2.color);
	}

}
