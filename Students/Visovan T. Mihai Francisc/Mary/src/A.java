//import java.util.*;

public class A {
	private String a = "cosmin";
	private String b = "cosmina";
	private char c = 'A';
	static final boolean m = true;
	private static int n = 10;
	
	public A(String x, String y){
		
		a = x;
		b = y;
		n *= (n+1);
	}
	
	public A(){
		c++;
		--n;
	}
	private void increment(int n){
		for(int i  = 0; i <300; i++)
			eticheta:for(int j = 0; j < 200; j++)
				for(int k = 0; k < 200; k++)
				{
					if(k > 0)
						break eticheta;
					n++;
				}
		System.out.println(n);
	}
	private static void adauga(String x, String y){
		x = x + y;
	}
	
	public static void main(String[]args){
		A x = new A();
		System.out.println(n);
		String a = "cosmin";
		String b = new String("cosmina");
		A y = new A(a,b);
		System.out.println(y.a == "cosmin");
		System.out.println(y.b.equals("cosmina"));
		System.out.println(y.b == y.a+"a");
		adauga(y.a,"a");
		System.out.println(y.a);
		System.out.println(n);
		A z = new A();
		z.increment(n);
		System.out.println(z.n);
		System.out.println(z.c);
		boolean m = false;
		System.out.println(m);
	}
			
}
