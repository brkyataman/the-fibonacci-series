package fibonacci_series;

public class IterativeMethod {
	
	int IterativeFib(int n){
		int firstElem = 1;
		int secondElem = 1;
		int result = 0;
		//F(1) and F(2) are known so for loop starts from 3
		for(int i = 3; i <= n; i++){
			result = firstElem + secondElem; //Each time result grows iteratively
			firstElem = secondElem;
			secondElem = result;
		}
		return secondElem;
	}
}
