import java.util.Scanner;
public class Prime_1{
   public static void main(String args[]){
	System.out.print("���� �Է��ϼ��� :");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		for(int i=2; i<=n; i++){
			if(n%i==0){
			   if(i==n){
			  System.out.println(i+"�� �Ҽ��Դϴ�.");
			}else{
			  System.out.println(i+"�� �Ҽ��� �ƴմϴ�.");
			   break;
			
				}
			}
		}
	}
}                                                                                                                                                                                  