
public class ques10 {

	public static void main(String[] args) {
		
		long s= 2;
		for (long i=3;i<2000000;i=i+2)
		{
			int k=0;
			for(long j=2;j<Math.sqrt(i);j++)
			{
				if(i%j==0)
					k++;
				
			}
			if(k==0)
				s+=i;
			
		}
		System.out.println(s);
}

	}

