/*키보드로부터 나이, 성별 (남:0, 여:1) 입력받아 나이가 19세 미만이고 여성인 경우 
입장권이 20% 할인 임장권 금액 =50000원, 
반드시 상수 선언, 논리, 산술연산, 비교연산, if*/
import java.util.Scanner;
public class Logical2{
    public static void main (String args[]){ 
        Scanner scan=new Scanner(System.in);
	final int WON = 50000;
        double pri=WON*0.8;
        System.out.print("나이를 입력하세요:");
        
        int age=scan.nextInt();
        System.out.print("남자는 0 여자는 1을 입력하세요"); 
        
        int sex=scan.nextInt();
         if( (age<=19)&& (sex==1)){
             System.out.println( pri + "원" );
         }
	else{
        System.out.println(WON);
        }
    
  }
}
        