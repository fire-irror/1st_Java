public class Ifexam2{
    public static void main(String args[]){
        int a=20;
        int b=10;
        char op='*';
        if( op=='+') System.out.println(a+"+"+b+"="+(a+b));
        else if (op =='-') System.out.println(a+"-"+b+"="+(a-b));
        else if (op =='*') System.out.println(a+"*"+b+"="+(a*b));
        else if (op =='/') System.out.println(a+"/"+b+"="+(a/b));
        else System.out.println("사칙 연산자가 아닙니다.");
   }
}
	