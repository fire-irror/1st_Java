import java.util.Scanner;
public class Achieve{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("������ �Է��ϼ��� :");
        int sco=scan.nextInt();
        if(sco>=90){
          System.out.println("A");
        }else if(sco>=80){
          System.out.println("B");
        }else if(sco>=70){
          System.out.println("C");
        }else if(sco>=60){
           System.out.println("D");
        }else{
           System.out.println("E");
       }
  }
}