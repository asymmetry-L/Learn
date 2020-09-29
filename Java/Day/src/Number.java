public class Number{
	int n1;
	int n2;
	public Number(int m, int n){
		this.n1 = m;
		this.n2 = n;
	}
	public int add(int m, int n){
		return m+n;
	}
	public int sub(int m, int n){
		return m-n;
	}
	public int mul(int m, int n){
		return m*n;
	}
	public double div(int m,int n){
		double consult = 0;
		try{
			consult = m / n;
		}catch(ArithmeticException){
			System.out.println("除数不能为0");
		}finally{
			return consult;
		}
	}
	public void operation(String opt){
		
	}
	public static void main(String[] args){
		

	}
}