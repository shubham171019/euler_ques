import java.util.*;
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1= 0;
		int t2= 1;
		int  sum =0;
		int sum2=0; 
		
		while(sum < 4000000)
		{
			sum =t1 + t2;
			t1= t2;
			t2= sum;
			System.out.println(sum+"  ");
			if(sum%2==0)
			{
				
				sum2 =sum + sum2;
				
			}
		}
		System.out.println("sum of even="+sum2);
	}

}
