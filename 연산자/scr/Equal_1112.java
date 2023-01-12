import java.util.Scanner;
public class Equal_1112{
   public static void main(String args[]){
   Scanner scan=new Scanner(System.in);
   System.out.print("2자리수 정수 입력(10~99) >>");
   int num=scan.nextInt();
   int a=num;
   if(a%11==0){
   System.out.println("YES! 10의 자리과 1의 자리가 같습니다.");
   }
   else{
   System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
   }
  }
}
  