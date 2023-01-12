import java.util.Scanner;
public class Constant1_1112{
     public static void main(String args[]){
         Scanner Scan=new Scanner(System.in);
         System.out.print("시험점수:");
         final int SCO=85;
         int score =Scan.nextInt( );
         System.out.print(score+"-" +SCO+"="+(score-SCO));
    } 
}