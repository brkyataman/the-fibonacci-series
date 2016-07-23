package fibonacci_series;

import java.util.Scanner;

public class FibonacciCalculation {
	
	public static void main(String []args){
		//Scan the input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fibonacci number you want to calculate: ");
		int n = scan.nextInt();
		
		int methodNumber = 0;
		int result = 0;
		
		//Forcing to enter a valid method number.
		while(!(methodNumber <= 4 && methodNumber >= 1)){
			System.out.println("Enter the method number.\n 1.Recursive \n 2.Iterative"
					+ "\n 3.Matrix Exponentiation\n");
			methodNumber = scan.nextInt();
		}
	
		
		switch(methodNumber){
			case 1: RecursiveMethod rec = new RecursiveMethod();
					result = rec.RecursiveFib(n);
					break;
			case 2: IterativeMethod it = new IterativeMethod();
					result = it.IterativeFib(n);
					break;
			case 3: MatrixExponentiation mat = new MatrixExponentiation();
					result = mat.MatrixFib(n);
					break;
		}
		
		System.out.println("\n Fib(" + n + "): " + result);
		
	}
}
