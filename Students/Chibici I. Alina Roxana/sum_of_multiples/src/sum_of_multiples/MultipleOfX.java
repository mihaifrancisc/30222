package sum_of_multiples;

public class MultipleOfX {
	public int value;
	//constructorul
	public MultipleOfX(int number){
		value = number;
	}
	//metoda
	public long sumOfMultiples(long n){
		long i;
		long sum;
		sum = 0;
		for(i = 1; i < n; i++){
			if(i % value == 0){
				sum = sum + i;
			}
		}
		return sum;
	}
}
