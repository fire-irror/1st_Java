import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
	 System.out.print(" ���� �Է��ϼ��� : ");
	 Scanner scan=new Scanner(System.in);
		int j=scan.nextInt();
		int fac=1;
		for(int i=j; i>=1; i--){
			fac=fac*i;
		}
		System.out.println(fac);
		 
	}
}
		
			