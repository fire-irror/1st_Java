import java.util.Scanner;
public class Time_1112{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("����(��)�� �Է��ϼ��� :");
    double sec=scan.nextDouble();
    int our;
    int min;
    Double sum=(sec/60);
    double sum1=sum/60;
    double sum2=(sum/60);
   System.out.printf("%.0f �ð� ��",sum1,sum2);
 }
}
    