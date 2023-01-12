import java.util.Scanner;
public class Condop_test {
    public static void main(String args[]){
        System.out.print("Á¤¼ö ÀÔ·Â :");
        Scanner scan=new Scanner(System.in);
         int a=scan.nextInt();
         String c=(a%2==0)? "Â¦¼ö":"È¦¼ö";
         System.out.println(c);
   }
}
        