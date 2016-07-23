package fibonacci_series;

public class MatrixExponentiation {
	int[][] M = {{1,0},{0,1}};
	int[][] unitMatrix = {{1,1},{1,0}};
	
	int MatrixFib(int n){
		pow(n-1);
		return M[0][0];
	}
	//Calculating 'n' by squares.
	void pow(int n){
		if(n > 1){
			pow(n/2);
			M = MatrixMultiply(M,M);
		}
		
		if(n % 2 == 1){//n is odd
			M = MatrixMultiply(M,unitMatrix);
		}
	}
	
	int[][] MatrixMultiply(int[][] A, int[][] B){
		int[][] result = {{0,0},{0,0}};
		
		for(int i = 0; i < 2 ; i++){
			for(int j = 0 ; j < 2; j++){
				for(int k = 0; k < 2; k++){
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return result;
	}
}
