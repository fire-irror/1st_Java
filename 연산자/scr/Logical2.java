/*Ű����κ��� ����, ���� (��:0, ��:1) �Է¹޾� ���̰� 19�� �̸��̰� ������ ��� 
������� 20% ���� ����� �ݾ� =50000��, 
�ݵ�� ��� ����, ��, �������, �񱳿���, if*/
import java.util.Scanner;
public class Logical2{
    public static void main (String args[]){ 
        Scanner scan=new Scanner(System.in);
	final int WON = 50000;
        double pri=WON*0.8;
        System.out.print("���̸� �Է��ϼ���:");
        
        int age=scan.nextInt();
        System.out.print("���ڴ� 0 ���ڴ� 1�� �Է��ϼ���"); 
        
        int sex=scan.nextInt();
         if( (age<=19)&& (sex==1)){
             System.out.println( pri + "��" );
         }
	else{
        System.out.println(WON);
        }
    
  }
}
        