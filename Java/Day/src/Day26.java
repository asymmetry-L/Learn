class Car{
	String color;
	String brand;
	public void run() {
		System.out.println("ʱ��180");
	}
	public void stop() {
		System.out.println("ɲ��");
	}
}
public class Day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = car1;
		car1.color = "red";
		car1.brand = "��";
		car1.run();
		car1.stop();
		System.out.println("���");
		System.out.println(car2.color);
	}

}
