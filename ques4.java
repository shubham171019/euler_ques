

public class ques4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		for(int i= 1000;i>=900;i--)
		{
			for(int j=999;j>900;j--)
			{
				int s=i*j;
				int s1=s;
				String pal="";
				while(s1>0)
				{
					int rem= s1%10;
					pal = pal +rem;
					s1= s1/10;
				}
				if (Integer.parseInt(pal)==s)
				{
					System.out.println(s);
					System.exit(0);
				}
			}

	}

}
}
