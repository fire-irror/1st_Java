import java.util.Scanner;
public class Scanner_1112{
    public static void main(String args[]){
    Scanner scan= new Scanner(System.in);
    System.out.print("»ç°¢ÇüÀÇ ¹Ø¸é:");
    int width=scan.nextInt();
    
    System.out.print("»ç°¢ÇüÀÇ ³ôÀÌ:");
    int height=scan.nextInt();
    
    int area=scan.nextInt();
    area= width*height;
    System.out.print("»ç°¢ÇüÀÇ ¸éÀû:"+ area);
    
    if(area >=100) {
         System.out.println("³ÐÀº ¶¥");
    }else{
            System.out.println("Á¼Àº ¶¥");
    }
  }
}
    