import java.util.Scanner;
public class WhileScore_1{
    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int sco, count=0, total=0;
	while(true){   
	    System.out.print("������ �Է��ϼ��� : ");
	    sco=scan.nextInt();
	    if(sco==0){
		break;
	    }else{
	           total +=sco;
	           count ++;      
	 }
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