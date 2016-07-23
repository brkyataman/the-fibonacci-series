package fibonacci_series;

public class IterativeMethod {
	
	int IterativeFib(int n){
		int firstElem = 1;
		int secondElem = 1;
		int result = 0;
		for(int i = 3; i <= n; i++){
			result = firstElem + secondElem;
			firstElem = secondElem;
			secondElem = result;
		}
		return secondElem;
	}
}
