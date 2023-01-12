public class For_Test1{
   public static void main(String args[]){
	for(int i=1; i<=100; i++){
		int a=i%10;
		if((a==3) || (a==6) || (a==9)){
			System.out.print("X");
		}else{ 
		System.out.print(i);
			}	
			if(i%10==0){
				System.out.println();
			}
		}	
	}
}	