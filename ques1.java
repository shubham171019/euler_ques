public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		for (int i=1;i<1000;i++)
		{
			if((i%5==0) || (i%3==0))
			s=s+i;
		}
		System.out.println(s);
	}

}
