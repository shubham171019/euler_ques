
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    long sum = 0;

	    for (int i = 2; i < 2000000; i++) {
	        boolean isPrime = true;

	        if ((i % 2 == 0 || i % 3 == 0) && (i!=2 || i!=3 || i!=5)) {
	            isPrime = false;
	        } else {
	            for (int j = 5; j <= Math.sqrt(i); j = j + 6) {
	                if (i % j == 0 || i % (j + 2) == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime == true) {
	            sum += i;
	        }
	    }

	    System.out.println(sum);
	   
	}
	}


