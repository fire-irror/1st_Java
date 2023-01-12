public class Bit_op {
   public static void main(String args[]){
      int x=0x0FFF;  //16Áø¼ö 00000FFF
      System.out.printf("%d\n",x);
      System.out.printf("%X\n",x);
      System.out.printf("%X\n",(x<<4));
      System.out.printf("%X\n",(x>>4));
      System.out.printf("%d\n",(x>>4));
      System.out.printf("%X\n",(x>>>4));
      System.out.printf("%d\n",(x>>>4));
      int y=0xFFFFFFFF;
      System.out.printf("%d\n",y);
      int z=-20;
      System.out.printf("%d\n",z);
      System.out.printf("%X\n",z);
      System.out.printf("%d\n",(z<<4));
      System.out.printf("%X\n",(z<<4));
      System.out.printf("%X\n",(z>>4));
      System.out.printf("%d\n",(z>>4));
      System.out.printf("%X\n",(z>>>4));
      System.out.printf("%d\n",(z>>>4));
  }
}
