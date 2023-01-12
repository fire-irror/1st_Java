public class For_Test2{
   public static void main(String args[]){
	int sum=0;
	for(int i=1; i<5; i++){
		for(int j=1; j<=i; j++){
			sum++;
			if (sum<10){
				System.out.print("0"+sum);
			}else{
				System.out.print(sum);
				}
			}
			System.out.println();
		}
		
	}
}
			