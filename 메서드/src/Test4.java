import java.util.Scanner;
public class Test4{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		
		System.out.print("������ ������ �Է��ϼ��� :");
		String ver=scan.nextLine();
		
		System.out.print("������ ������ �Է��ϼ��� :");
		int num=scan.nextInt();
		
			int money=0;
			switch(ver) {
				case "���" : money=1500;
					break;
				case "����" : money=7000;
					break;
				case "�丶��" : money=1000;
				}
			
			int moneysum=money*num;
			if(moneysum>10000)
				System.out.print("���ԺҰ�");
			else
				System.out.print("�Ž����� :"+ (10000-moneysum));
	}
}
		
		