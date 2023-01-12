import java.util.Scanner;
public class Score_1112{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
  
    System.out.print("국어:");
    int kor=scan.nextInt();

   System.out.print("영어:");
    int eng=scan.nextInt();
 
   System.out.print("수학:");
   int math=scan.nextInt();

   System.out.print("자바:");
   int java=scan.nextInt();
  
   double sum;
   sum=kor+eng+math+java;
   System.out.print("합계:"+sum);
   System.out.printf("평균:"+"%.2f\n",sum/4);
 }
}
  