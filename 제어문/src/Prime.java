import java.util.Scanner;
public class Prime{
   public static void main(String args[]){
	System.out.print("���� �Է��ϼ���.");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	boolean result=false;
	for(int i=2; i<num; i++){
		if(num%i==0){
			result=true;
			}
		}
	if(result){
		System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
	}else{
		System.out.println(num+"�� �Ҽ��Դϴ�");

		}
	}
}