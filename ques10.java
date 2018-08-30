
public class ques10 {

	public static void main(String[] args) {
		
		int s= 0;
		for (int i=1;i<2000000;i++)
		{
			int k=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					k++;
				
			}
			if(k==1)
				s+=i;
			
		}
		System.out.println(s);
}

	}


