import java.util.Scanner;
public class For_Test4{
    public static void main(String args []){
	System.out.print("���� �Է��ϼ��� : ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	double sum=0;
	for(int i=1; i<=n; i++){
		sum += (double)1/i;
	}
		System.out.println(sum);
    }
}
