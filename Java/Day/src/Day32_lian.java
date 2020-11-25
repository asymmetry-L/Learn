
public class Day32_lian {

	public int add(int a,int b){
		try{
			return a+b;
		}catch(Exception e){
			System.out.println("catch Óï¾ä¿é");
		}finally{
			System.out.println("finally Óï¾ä¿é");
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day32_lian demo = new Day32_lian();
		System.out.println("ºÍÊÇ£º"+demo.add(9,34));
	}

}
