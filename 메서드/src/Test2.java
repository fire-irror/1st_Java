import java.util.Scanner;
public class Test2 {
	public static void main(String args[]){

		 int sco1=keyInput();
		 int sco2=keyInput();
		 int sco3=keyInput();
		
		System.out.println("================���� ó�� ���=================");
		getResult1(sco1,sco2,sco3);

		System.out.println("============����� ���� �ʿ��� ����=============");
		getResult2(sco1,sco2,sco3);
			}  
	static int keyInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int sco=scan.nextInt();
		return sco;
	}
	static void getResult1(int sco1, int sco2, int sco3) {
		int sum=sco1+sco2+sco3;
		int avg=sum/3;
		System.out.println("�հ� : "+sum+"        "+"��� :"+avg);
	
		System.out.print("���뵵 :");  //�ѹ��� ���� 
		if(avg>=90){
			 System.out.println("A");
		}else if(avg>=80){
			System.out.println("B");
		}else if(avg>=70){
			System.out.println("C");
		}else{
 			System.out.println("D");
			}
		}

	 static void getResult2(int sco1,int sco2,int sco3) {
		if(sco1<sco2 && sco1<sco3){
			System.out.println("���� : ����1"+"         "+"���� :"+sco1);
		}else if(sco2<sco1 && sco2<sco3){
			System.out.println("���� : ����2"+"         "+"���� :"+sco2);
		}else{
			System.out.println("���� : ����3"+"         "+"���� :"+sco3); 
			}
	}
}


	
	