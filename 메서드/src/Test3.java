import java.util.Scanner;
public class Test3 {
	public static void main(String args[]){

		 int sco1=keyInput();
		 int sco2=keyInput();
		 int sco3=keyInput();
		
		System.out.println("================성적 처리 결과=================");
		getResult1(sco1,sco2,sco3);

		System.out.println("============노력이 가장 필요한 교과=============");
		getResult2(sco1,sco2,sco3);
			}
	static int keyInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		int sco=scan.nextInt();
		return sco;
	}
	static void getResult1(int sco1, int sco2, int sco3) {
		int sum=sco1+sco2+sco3;
		int avg=sum/3;
		System.out.println("합계 : "+sum+"        "+"평균 :"+avg);

        switch (avg/10) {
        case 10:        
		case 9:
            System.out.println("A");
            break;
        case 8:            
            System.out.println("B");
            break;
        case 7:            
            System.out.println("C");
            break;
        default:       
            System.out.println("D");
            break;    
			}
		}

	 static void getResult2(int sco1,int sco2,int sco3) {
		if(sco1<sco2 && sco1<sco3){
			System.out.println("과목 : 과목1"+"         "+"점수 :"+sco1);
		}else if(sco2<sco1 && sco2<sco3){
			System.out.println("과목 : 과목2"+"         "+"점수 :"+sco2);
		}else{
			System.out.println("과목 : 과목3"+"         "+"점수 :"+sco3); 
			}
	}
}


	
	