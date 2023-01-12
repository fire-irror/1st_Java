public class SwitchExam5{
     public static void main(String args[]){
	int a=Integer.parseInt(args[0]);
	String num;
	switch(a){
	case 1: case 2:
	  num="뉴미디어소프드웨어과"; break;
	case 3: case 4:
	  num="뉴미디어웹솔루션과"; break;
	case 5: case 6 :
	  num="뉴미디어디자인";break;
	default: num="잘못입력했습니다.";
      }
	System.out.println(num);
   }
}

	   