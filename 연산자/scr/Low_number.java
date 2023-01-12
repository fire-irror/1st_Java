import java.util.Scanner;
public class Low_number{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("두 수 입력 : ");
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    int result=(num1<=num2)? num1:num2;
    System.out.println("두 수 중 작은 값은" + result+" 입니다.");
        
    }
}