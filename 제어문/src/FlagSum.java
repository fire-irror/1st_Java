import java.util.Scanner;
public class FlagSum{
    public static void main(String args[]){
   	Scanner scan=new Scanner(System.in);
	System.out.print("���� �Է��ϼ��� : ");
	int n=scan.nextInt();
	int j=0;
	for(int i=1; i<=n; i++){
	    if( i%2==0) {
		j-=i;		
	     }else{
		j+=i;
				}
			}
			System.out.println(j);
	}
}   