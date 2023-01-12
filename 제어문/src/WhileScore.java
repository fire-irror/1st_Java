import java.util.Scanner;
public class WhileScore{
    public static void main(String args[]){
	System.out.print("점수를 입력하세요. : ");
	Scanner scan=new Scanner(System.in);
	int sco=scan.nextInt();
	int count=0, total=0;
	
	while(sco !=0){    //0이 아닌동안 반복해라
	    total +=sco;
	    count ++;       //평균을 구하기 위해 점수의 갯수를 카운트
	    Scanner scan=new Scanner(System.in);
	    sco=scan.nextInt();
	 }
	if(count ==0){   //나누지 0 에러 발생
		System.out.println("입력없음.");
	}else{	
	  //평균 구하기
	  System.out.println("===================");
	  System.out.println("총점 : "+total);
	  System.out.printf("평균 : %.2f", (double)(total/count));
	}
}
}