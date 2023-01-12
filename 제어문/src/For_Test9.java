import java.util.Scanner;
public class For_Test9{
    public static void main(String args[]){
	System.out.print("줄 수를 입력하세요 :");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++){
		for(int j=1; j<=5; j++){
		sum++;
		System.out.print(sum);
			
		}
		System.out.println();
	}
  }
}
	