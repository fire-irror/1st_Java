import java.util.Scanner;
public class Salary_switch{
    public static void main(String args[]){
	System.out.print("�� ������ �Է��ϼ��� : ");
	Scanner scan=new Scanner(System.in);
	double currentSalary=scan.nextDouble();
	System.out.print("�ٹ��򰡵���� �Է��ϼ��� :");
	String rating=scan.next();
	double raise=0.0;
	double newSalary;
	if(rating.equals("���")){
	 raise=currentSalary*0.06;
 
	}else if(rating.equals("����")){
	 raise=currentSalary*0.04;
	
	}else if (rating.equals("�ҷ�")){
	raise=currentSalary*0.02;
	}
  	  System.out.println("���� �λ�� : "+(int)raise);
	  System.out.println("�� ���� �λ�� : "+ ((int)raise+(int)currentSalary));
  }
}
	
	