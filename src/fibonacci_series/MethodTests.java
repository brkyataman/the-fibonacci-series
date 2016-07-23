package fibonacci_series;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodTests {

	@Test
	public void testRecursive() {
		RecursiveMethod test = new RecursiveMethod();
		int result = test.RecursiveFib(10);
		assertEquals(55, result);
		
		result = test.RecursiveFib(46);
		assertEquals(1836311903,result);
		
		result = test.RecursiveFib(1);
		assertEquals(1,result);
		
	}
	
	@Test
	public void testIterative() {
		IterativeMethod test = new IterativeMethod();
		int result = test.IterativeFib(10);
		assertEquals(55, result);
		
		result = test.IterativeFib(46);
		assertEquals(1836311903,result);
		
		result = test.IterativeFib(1);
		assertEquals(1,result);
		
	}
	
	@Test
	public void testMatrix() {
		MatrixExponentiation test = new MatrixExponentiation();
		int result = test.MatrixFib(46);
		assertEquals(1836311903,result);
		
		MatrixExponentiation test2 = new MatrixExponentiation();
		result = test2.MatrixFib(10);
		assertEquals(55, result);
		
		MatrixExponentiation test3 = new MatrixExponentiation();
		result = test3.MatrixFib(1);
		assertEquals(1, result);
		
	}
}
