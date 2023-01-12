// 변수는 덮어쓰기가 된다
public class Vartest1{
    public static void main(String args[]){
               int   a, b, c;  //int:정수 세줄로 분리해서 쓸 수 있다.
	 a=10;
               b=20;
	String str = "자바를 즐깁시다"; //String => 문자열
               c=a+b;
	 System.out.println("a="+(a));
	 System.out.println("b="+(b));
               System.out.println("c="+(a+b));
	System.out.println(str);
     }
}