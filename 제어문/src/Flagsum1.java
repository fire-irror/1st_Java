import java.util.Scanner;
public class Flagsum1{
    public static void main(String args[]){
    System.out.print("수를 입력하세요 : ");
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
		System.out.println("합은" +sum+"입니다.");
	}
}
	  
    
	
     
