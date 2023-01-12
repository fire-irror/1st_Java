import java.util.Scanner;
public class Prime{
   public static void main(String args[]){
	System.out.print("수를 입력하세요.");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	boolean result=false;
	for(int i=2; i<num; i++){
		if(num%i==0){
			result=true;
			}
		}
	if(result){
		System.out.println(num+"은 소수가 아닙니다.");
	}else{
		System.out.println(num+"은 소수입니다");

		}
	}
}