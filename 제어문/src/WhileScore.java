import java.util.Scanner;
public class WhileScore{
    public static void main(String args[]){
	System.out.print("������ �Է��ϼ���. : ");
	Scanner scan=new Scanner(System.in);
	int sco=scan.nextInt();
	int count=0, total=0;
	
	while(sco !=0){    //0�� �ƴѵ��� �ݺ��ض�
	    total +=sco;
	    count ++;       //����� ���ϱ� ���� ������ ������ ī��Ʈ
	    Scanner scan=new Scanner(System.in);
	    sco=scan.nextInt();
	 }
	if(count ==0){   //������ 0 ���� �߻�
		System.out.println("�Է¾���.");
	}else{	
	  //��� ���ϱ�
	  System.out.println("===================");
	  System.out.println("���� : "+total);
	  System.out.printf("��� : %.2f", (double)(total/count));
	}
}
}