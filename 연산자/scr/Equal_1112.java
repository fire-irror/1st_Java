import java.util.Scanner;
public class Equal_1112{
   public static void main(String args[]){
   Scanner scan=new Scanner(System.in);
   System.out.print("2�ڸ��� ���� �Է�(10~99) >>");
   int num=scan.nextInt();
   int a=num;
   if(a%11==0){
   System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
   }
   else{
   System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
   }
  }
}
  