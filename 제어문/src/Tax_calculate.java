import java.util.Scanner;
public class Tax_calculate{
    public static void main(String args[]){
	System.out.print("���� �ٷμҵ��� �Է��ϼ��� : ");
	Scanner scan=new Scanner(System.in);
	int salary=scan.nextInt();
	if(salary<=20000000){
	  System.out.println("�ҵ漼��"+(int)(salary*0.05));
	
	}else if(salary<=40000000){
	  System.out.println("�ҵ漼��"+(int)(salary*0.15));
	java
	}else if(salary<=80000000){
	  System.out.println("�ҵ漼��"+(int)(salary*0.25));
	
	}else if(salary>80000000){
	  System.out.println("�ҵ漼��"+(int)(salary*0.4));
	}
       
  }
}