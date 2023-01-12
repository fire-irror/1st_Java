public class For_Test11{
    public static void main(String args[]){
	int narcissus=1;
	for(int i=100; i<=999; i++){
		int hun=i/100;
		int ten=(i%100)/10;
		int one=i%10;
		if(hun*hun*hun+ten*ten*ten+one*one*one==i){
			System.out.println(narcissus+"Narcissus : "+i);
			narcissus++;
			}
		}
	}
   }
