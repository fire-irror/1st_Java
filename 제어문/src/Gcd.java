import java.util.Scanner;
public class Gcd{
	public static void main(String args[]){
	System.out.print("�� ���� �Է��ϼ��� :");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	while(b!=0){
		int r=a%b;
		a=b;	//a�� b�� �ִ������� b�� r�� �ִ������� ����. �׸��� �ݺ��Ͽ� �������� 0�̸� �ִ������̴�.
		b=r;   //a�� b�� ���� �������� r�̴�.
		}		
		System.out.println("�ִ����� :"+a);
   }
}
