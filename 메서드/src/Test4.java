import java.util.Scanner;
public class Test4{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		
		System.out.print("과일의 종류를 입력하세요 :");
		String ver=scan.nextLine();
		
		System.out.print("과일의 갯수를 입력하세요 :");
		int num=scan.nextInt();
		
			int money=0;
			switch(ver) {
				case "사과" : money=1500;
					break;
				case "수박" : money=7000;
					break;
				case "토마토" : money=1000;
				}
			
			int moneysum=money*num;
			if(moneysum>10000)
				System.out.print("구입불가");
			else
				System.out.print("거스름돈 :"+ (10000-moneysum));
	}
}
		
		