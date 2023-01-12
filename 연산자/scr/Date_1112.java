import java.util.Scanner;
public class Date_1112{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("년도를 입력하세요 :");
    int year=scan.nextInt();
    System.out.print("월을 입력하세요 :");
    int mon=scan.nextInt();
    System.out.print("일을 입력하세요 :");
    int day=scan.nextInt();
    System.out.println(year+"."+mon+"."+day);

  }
}