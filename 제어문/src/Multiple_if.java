import java.util.Scanner;
public class Multiple_if{
     public static void main(String args[]){
	System.out.print("�� �Է�");
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	if(number%5==0) {
	System.out.println(number+"�� 5�� ����̴�.");
	}else if(number%3==0) {
	System.out.println(number+"�� 3�� ����̴�.");
	}else if(number%8==0) {
	System.out.println(number+"�� 8�� ����̴�.");
	}else{ System.out.println("��� ����� �ƴմϴ�.");
	}
      }
}
	