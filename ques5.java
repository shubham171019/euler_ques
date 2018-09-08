
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcm=11;
		int x,y;
		
		for(int i=1;i<20;i++)
		{
			x=lcm;
			y=i;
			while(x!=y)
			{
				if(x>y)
				{
					x=x-y;
				}
					
				else
				{
					y=y-x;
				}
					
			}
			lcm=(lcm*i)/x;
		}
		System.out.println("LCM= "+lcm);
	}

}
