import java.util.Scanner;
public class Flagsum1{
    public static void main(String args[]){
    System.out.print("���� �Է��ϼ��� : ");
    Scanner scan=new Scanner(System.in);
	int n;
	int sum=0;
	int j=scan.nextInt();
	for(int i=0; i<=j; i++){
		if(i%2==0){
			n=(-1)*i;
		}else{
			n=i;
		}
		sum+=n;
		}
		System.out.println("����" +sum+"�Դϴ�.");
	}
}
	  
    
	
     
