import java.util.Scanner;
public class Scanner_1112{
    public static void main(String args[]){
    Scanner scan= new Scanner(System.in);
    System.out.print("�簢���� �ظ�:");
    int width=scan.nextInt();
    
    System.out.print("�簢���� ����:");
    int height=scan.nextInt();
    
    int area=scan.nextInt();
    area= width*height;
    System.out.print("�簢���� ����:"+ area);
    
    if(area >=100) {
         System.out.println("���� ��");
    }else{
            System.out.println("���� ��");
    }
  }
}
    