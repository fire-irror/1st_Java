import java.util.Scanner;
public class Relation_Test2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("나이를 입력하세요:");
        int age;   
        age=scan.nextInt();
        if(age>=19){
           System.out.println("성인");
        }else {
           System.out.println("청소년");
       }
     }
}
       