import java.util.Scanner;
public class Ifexam2_1{
    public static void main(String args[]){
        System.out.print(" �����ڸ� �Է��ϼ��� :");
        Scanner scan=new Scanner(System.in);
        int a=20;
        int b=10;
        String op=scan.nextLine();
        if (op.equals("+")) System.out.println(a+"+"+b+"="+(a+b));
        else if (op.equals("-")) System.out.println(a+"-"+b+"="+(a-b));
        else if (op.equals ("*")) System.out.println(a+"*"+b+"="+(a*b));
        else if (op.equals ("/")) System.out.println(a+"/"+b+"="+(a/b));
        else System.out.println("��Ģ �����ڰ� �ƴմϴ�.");
   }
}
	