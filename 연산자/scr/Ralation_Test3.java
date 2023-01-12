import java.util.Scanner;
public class Ralation_Test3{
    public static void main(String args[]){
   Scanner scan =new Scanner(System.in);
    System.out.print("나이를 입력하세요 : "); 
        int age = 19;
        age=scan.nextInt();
        String a = "성인";
        String b = "청소년";
        String c = (age>=19)? a : b ;
        System.out.println(c+"입니다.");
        
   }
}


