public class SwitchExam5{
     public static void main(String args[]){
	int a=Integer.parseInt(args[0]);
	String num;
	switch(a){
	case 1: case 2:
	  num="���̵�����������"; break;
	case 3: case 4:
	  num="���̵�����ַ�ǰ�"; break;
	case 5: case 6 :
	  num="���̵�������";break;
	default: num="�߸��Է��߽��ϴ�.";
      }
	System.out.println(num);
   }
}

	   