import java.util.Scanner;
public class Low_number2{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("������ �� �Է� : ");
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    int num3=scan.nextInt();
    int result=(num1<=num2)? num1:num2;
    int result1=(result<=num3)? result:num3;
    System.out.println("���� ���� ����" + result+" �Դϴ�.");
        
    }
}