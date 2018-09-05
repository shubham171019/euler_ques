
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x=0,y=0;
		for(int i=1;i<=100;i++)
		{
			x+=i;
			y+=(i*i);
		}
		x*=y;
		System.out.println(x-y);
	}

}
