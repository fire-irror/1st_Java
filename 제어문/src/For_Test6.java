import java.util.Scanner;
public class For_Test6{
   public static void main(String args[]){
	System.out.print("���� �Է� ==>");
	Scanner scan=new Scanner(System.in);
	int k=scan.next().charAt(0);
	int a=1;     //���ĺ��� ����
	for(int i=65; i<=k; i++){	
		for(int j=1; j<=a; j++){
			System.out.print((char)i);
				}
			a+=2;
			System.out.println();	
		}
	}
}
