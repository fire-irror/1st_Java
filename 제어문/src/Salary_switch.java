import java.util.Scanner;
public class Salary_switch{
    public static void main(String args[]){
	System.out.print("현 연봉을 입력하세요 : ");
	Scanner scan=new Scanner(System.in);
	double currentSalary=scan.nextDouble();
	System.out.print("근무평가등급을 입력하세요 :");
	String rating=scan.next();
	double raise=0.0;
	double newSalary;
	if(rating.equals("우수")){
	 raise=currentSalary*0.06;
 
	}else if(rating.equals("보통")){
	 raise=currentSalary*0.04;
	
	}else if (rating.equals("불량")){
	raise=currentSalary*0.02;
	}
  	  System.out.println("연봉 인상액 : "+(int)raise);
	  System.out.println("새 연봉 인상액 : "+ ((int)raise+(int)currentSalary));
  }
}
	
	