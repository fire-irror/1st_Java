import java.util.Scanner;
public class Multiple_if{
     public static void main(String args[]){
	System.out.print("수 입력");
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	if(number%5==0) {
	System.out.println(number+"은 5의 배수이다.");
	}else if(number%3==0) {
	System.out.println(number+"은 3의 배수이다.");
	}else if(number%8==0) {
	System.out.println(number+"은 8의 배수이다.");
	}else{ System.out.println("어느 배수도 아닙니다.");
	}
      }
}
	