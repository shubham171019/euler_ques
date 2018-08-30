// prime factor
import java.util.*;

public class ques3 {

	public static void main(String[] args) {
		
		long num= 600851475143L;
		for (int i=2; i<= num;i++)
		{
			while (num % i == 0)
			{
				System.out.println(i);
				num =num/i;
			}
		}
		
		
	}

}
