import java.util.Scanner;
public class For_Test7{
    public static void main(String args[]){
	System.out.print("���ڸ� �Է��ϼ��� :");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=1; i<=n ; i++){
		for(int j=90; j>=91-i; j--){
			System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
	
	
 