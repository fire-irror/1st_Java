// 키보드로부터 정수 입력받아 출력
import java.util.Scanner;
public class Scantest{
    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("정수 입력:");
	int num = scan.nextInt( ); // 키보드로부터 정수를 입력받아 num변수에 넣어라

	System.out.println("입력받은 수:"+num);
	System.out.print("실수 입력:");
	double num2 = scan.nextDouble();
	System.out.println("입력받은 수:"+num2);
    }
}