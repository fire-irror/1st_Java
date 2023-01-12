public class Method_Test {
     public static void main(String args[]){
	System.out.println(sum_method(1,10)); //1부터 10까지 더하는 메서드

	int res=sum_method(5,15);
	System.out.println(res);
	
	int ans=sum_method(100,250)+10;
		System.out.println(ans);
	}
	static int sum_method(int beg, int end){
		 int sum=0;
		 for(int i=beg;  i<=end; i++)
			sum+=i;
		//System.out.println(sum);
		return sum;

	}
}
