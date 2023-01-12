import java.util.Scanner;
public class Gcd{
	public static void main(String args[]){
	System.out.print("두 수를 입력하세요 :");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	while(b!=0){
		int r=a%b;
		a=b;	//a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 그리고 반복하여 나머지가 0이면 최대공약수이다.
		b=r;   //a를 b로 나눈 나머지가 r이다.
		}		
		System.out.println("최대공약수 :"+a);
   }
}
