// Ű����κ��� ���� �Է¹޾� ���
import java.util.Scanner;
public class Scantest{
    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.print("���� �Է�:");
	int num = scan.nextInt( ); // Ű����κ��� ������ �Է¹޾� num������ �־��

	System.out.println("�Է¹��� ��:"+num);
	System.out.print("�Ǽ� �Է�:");
	double num2 = scan.nextDouble();
	System.out.println("�Է¹��� ��:"+num2);
    }
}