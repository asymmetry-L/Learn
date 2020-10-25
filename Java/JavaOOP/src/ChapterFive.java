//多线程实验

//public class ChapterFive implements Runnable {
public class ChapterFive extends Thread {
	static int tickte = 100;
	String name;
	public ChapterFive(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public synchronized void run() {
		while(this.tickte>0) {
				
				try {
					System.out.println("窗口[" + this.name + "]" + "当前车票余量：" + (this.tickte--) + "张");			
//					this.tickte --;
//					sleep(30);
					sleep((int)Math.random()*30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				try {
//					this.wait(30);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChapterFive window1 = new ChapterFive("A");
		ChapterFive window2 = new ChapterFive("B");
		ChapterFive window3 = new ChapterFive("C");
		ChapterFive window4 = new ChapterFive("D");
		window1.start();
		window2.start();
		window3.start();
		window4.start();
//		System.out.println("车票售罄");
	}

}
