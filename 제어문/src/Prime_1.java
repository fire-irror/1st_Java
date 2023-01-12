import java.util.Scanner;
public class Prime_1{
   public static void main(String args[]){
	System.out.print("수를 입력하세요 :");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
		for(int i=2; i<=n; i++){
			if(n%i==0){
			   if(i==n){
			  System.out.println(i+"은 소수입니다.");
			}else{
			  System.out.println(i+"은 소수가 아닙니다.");
			   break;
			
				}
			}
		}
	}
}                                                                                                                                                                                  