
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		
		for(int i= 1000;i>=100;i--)
		{
			int k= i-1;
			int num = k*i;
			temp= num;
			while(num>0)
			{    
	     	   r=num%10;   
			   sum=(sum*10)+r;    
			   num=num/10;    
			}    
	    	 if(temp==sum)    
			   System.out.println("palindrome number "+num);    
		}

	}

}
