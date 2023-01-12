public class Assign_operator{
    public static void main(String args[]){
         int num1=7, num2=7;
  
         num1=num1+3;
         num2+=3;
         System.out.println("+연산자에 의한 결과 :"+num1);
         System.out.println("+=연산자에 의한 결과 : "+num2);
     
         num1=num1-3;
         num2-=3;
         System.out.println("-연산자에 의한 결과 : "+num2);
         System.out.println("-=연산자에 의한 결과 : "+num2);
  
         num1=num1*3;
         num2*=3;
         System.out.println("*연산자에 의한 결과 : "+num2);
         System.out.println("*=연산자에 의한 결과 : "+num2);
    }
}