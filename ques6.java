
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0  ;
		for(int i=1;i<=100;i++)
		{
			sum = sum + Math.pow(i,2);
			
		}
		System.out.println(sum);
		long sum2=0;
		int sum1 =0;
		for(int j=1;j<=100;j++)
		{
			sum1= sum1 + j;
			
		}
		
		 sum2 = (long)sum1 * (long)sum1;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		int dif;
		dif = (int)sum2- (int)sum;
		System.out.println(dif);
	}

}
