import java.util.*;

public class ABC {
	private String a = "cosmin";
	private String b = "cosmina";
	private char c = 'A';
	static final boolean m = true;
	private static int n = 10;
	
	public ABC(String x, String y){
		
		a = x;
		b = y;
		n *= (n+1);
	}
	
	public ABC(){
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
	private static void audaga(String x, String y){
		x = x + y;
	}
				
}
