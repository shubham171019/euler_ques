public class ques10
{
   static boolean primecheck(long n)
    {
        boolean status = true;
        for (int i = 3; i<=Math.sqrt(n);i+=2)
        {
            if (n%i==0)
            {
                status=false;
                break;
            }
        }
        return status;
    }
    public static void main(String args[])
    {
        
        long sum = 2;
        for(long i = 3 ;i<=2000000;i+=2)
        {
            if(primecheck(i))
            {
                sum = sum +i;
            }
        }
        System.out.println(sum); 
   }
}
