import java.util.Scanner;
public class Ifexam2_1{
    public static void main(String args[]){
        System.out.print(" 연산자를 입력하세요 :");
        Scanner scan=new Scanner(System.in);
        int a=20;
        int b=10;
        String op=scan.nextLine();
        if (op.equals("+")) System.out.println(a+"+"+b+"="+(a+b));
        else if (op.equals("-")) System.out.println(a+"-"+b+"="+(a-b));
        else if (op.equals ("*")) System.out.println(a+"*"+b+"="+(a*b));
        else if (op.equals ("/")) System.out.println(a+"/"+b+"="+(a/b));
        else System.out.println("사칙 연산자가 아닙니다.");
   }
}
	