public class Vartest4{
    public static void main(String[]args){
        int a = 19; //맞는 문장
        //int b = 2147483648; // 틀린문장 (47까지만 가능)=> integer number too large
        //int c = 3.14; // 소수여서 안됨 (틀린 문장)=>자동 형 변환 안됨
        double d=5; // 더블 값에 int를 넣음 (자동 형 변환이 일어남)
        double e =5+3.14; //5=>double로 형 변환이 됨
      System.out.println(e);
        
  }
}