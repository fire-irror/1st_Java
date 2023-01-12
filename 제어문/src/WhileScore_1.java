import java.util.Scanner;
public class WhileScore_1{
    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int sco, count=0, total=0;
	while(true){   
	    System.out.print("점수를 입력하세요 : ");
	    sco=scan.nextInt();
	    if(sco==0){
		break;
	    }else{
	           total +=sco;
	           count ++;      
	 }
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