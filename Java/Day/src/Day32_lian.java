
public class Day32_lian {

	public int add(int a,int b){
		try{
			return a+b;
		}catch(Exception e){
			System.out.println("catch ����");
		}finally{
			System.out.println("finally ����");
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day32_lian demo = new Day32_lian();
		System.out.println("���ǣ�"+demo.add(9,34));
	}

}
