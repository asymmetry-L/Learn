class Book{
	String bCode;
	String name;
	String author;
	Double price;
	String press;
	String data;
	public String getBCode(){
		return this.bCode;
	}
	public void setBCode(String bCode){
		this.bCode = bCode;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public Double getPrice(){
		return this.price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public String getPress(){
		return this.press;
	}
	public void setPress(String press){
		this.press = press;
	}
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String toString(){
		return "|书名：" + this.name + "|编号：" + this.bCode + "|作者：" + this.author + "|价格：" + this.price + "|";
	}
}
public class Test{
	public static void main(String[] args){
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		book1.setBCode("13136");
		book1.setName("Jacky");
		book1.setAuthor("LIly");
		book1.setPrice(25.36);
		book1.setPress("bei ji chu ban she");
		book1.setData("2005.3.20");
		
		book2.setBCode("133366");
		book2.setName("The collapse of the House of Usher");
		book2.setAuthor("Allan Poe");
		book2.setPrice(67.63);
		book2.setPress("bei ji chu ban she");
		book2.setData("2000.8.20");

		book3.setBCode("18646");
		book3.setName("Madicated Leaven");
		book3.setAuthor("Dante");
		book3.setPrice(57.3);
		book3.setPress("bei ji chu ban she");
		book3.setData("2007.6.8");
		//System.out.println(book1);
		//System.out.println(book2);
		//System.out.println(book3);

		book1.setPrice(book1.getPrice() * 0.8);
		book2.setPrice(book2.getPrice() * 0.8);
		book3.setPrice(book3.getPrice() * 0.8);

		System.out.println(book1.getName() + "价格：" + book1.getPrice());
		System.out.println(book2.getName() + "价格：" + book2.getPrice());
		System.out.println(book3.getName() + "价格：" + book3.getPrice());
		
	}
}