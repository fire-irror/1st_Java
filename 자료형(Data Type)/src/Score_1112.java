import java.util.Scanner;
public class Score_1112{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
  
    System.out.print("����:");
    int kor=scan.nextInt();

   System.out.print("����:");
    int eng=scan.nextInt();
 
   System.out.print("����:");
   int math=scan.nextInt();

   System.out.print("�ڹ�:");
   int java=scan.nextInt();
  
   double sum;
   sum=kor+eng+math+java;
   System.out.print("�հ�:"+sum);
   System.out.printf("���:"+"%.2f\n",sum/4);
 }
}
  