import java.util.Scanner;
public class Condop_test {
    public static void main(String args[]){
        System.out.print("���� �Է� :");
        Scanner scan=new Scanner(System.in);
         int a=scan.nextInt();
         String c=(a%2==0)? "¦��":"Ȧ��";
         System.out.println(c);
   }
}
        