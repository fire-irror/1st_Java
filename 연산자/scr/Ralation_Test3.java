import java.util.Scanner;
public class Ralation_Test3{
    public static void main(String args[]){
   Scanner scan =new Scanner(System.in);
    System.out.print("���̸� �Է��ϼ��� : "); 
        int age = 19;
        age=scan.nextInt();
        String a = "����";
        String b = "û�ҳ�";
        String c = (age>=19)? a : b ;
        System.out.println(c+"�Դϴ�.");
        
   }
}


