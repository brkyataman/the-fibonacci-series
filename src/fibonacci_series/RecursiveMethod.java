package fibonacci_series;

public class RecursiveMethod {	
	int RecursiveFib(int n){
		if(n <= 2) 
			return 1;
		else
			return RecursiveFib(n-1) + RecursiveFib(n-2);
	}
}
