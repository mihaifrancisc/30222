
public class Fibonaci {

	public static void main(String[] args) {
		
		int n = 4000000, a = 1, b = 1, c;
		int sum = 0;
		
		c = a + b;
	    while(c <= n ) {

	  	    if(c%2 == 0) sum += c;
		          
		     a = b;
		     b = c;
		     c = a + b;
	       }
	    
	    System.out.println("Suma elementelor pare din sirul lui Fibonacci este " + sum);

	}

}
