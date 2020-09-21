import java.util.Scanner;
public class TestTwo_2{
    public static void main(String args[]){
        int day = 5;
        Scanner scan  = new Scanner(System.in);
        System.out.print("今天是周" + day + "你想知道几天之后？：");
        int after = scan.nextInt();
        int thatDay;
        thatDay = after - 2;
        thatDay %= 7;
        System.out.println(after + "天之后是星期" + thatDay);
        //scan.next();
    }
}