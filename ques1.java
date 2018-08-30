import java.util.*;



public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= new int [10000];
		for(int i=0;i<=1000;i++)
		{
			if(i%3==0 || i%5==0)
			{
				A[i]=i;
			}
		}
		int sum=0;
		for (int j=0;j<1000;j++)
		{
			sum= sum+ A[j];
		}
		System.out.println(sum);

	}

}
