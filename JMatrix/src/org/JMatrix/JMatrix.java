package org.JMatrix;

import static org.junit.Assert.*;

import org.junit.*;

public class JMatrix {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		matrix x = new matrix(new double[][] {{1,2}, {3,4}});
		matrix y = new matrix(new double[][] {{5, 6}, {7, 8}});
		matrix z = new matrix(new double[][] {{1,2}, {3,4}});
		
		
		System.out.println("x = z: "+x.equals(z));

		System.out.println("x = y: "+y.equals(z));
		
		
		System.out.println(x.product(y));
		System.out.println("3x3 product");
		
		x = new matrix(new double[][]{{1,2,3}, {4,5,6}, {7,8,9}});
		y = new matrix(new double[][]{{9,8,7}, {6,5,4}, {3,2,1}});
		
		
		System.out.println(x.product(y));
		
		System.out.println(x);
		
		System.out.println(x.getDimensions()[0]);
		
		CuMatrix f = new CuMatrix(new double[][] {{5, 6, 3}, {7, 8,2}, {1, 1, 1}});
		f.iTest();
		
		System.out.println(System.getProperty("user.dir"));
		f.forktest();
		
		System.out.println(f.product(y));
		
		System.out.println(f);

	}
	@Test
	public void largeProductTest(){
		// Test the CPU processing time
		int dim = 1000;
		
		double [][] td = new double[dim][dim];
		double [][] tdb = new double[dim][dim];

		
		for(int i = 0; i != dim; i ++){
			for(int j = 0; j != dim; j++){
				td[i][j] = Math.random()*10;
				tdb[i][j] = Math.random()*10;
			}
		}
		System.out.println("Generation complete");
		matrix large1 = new matrix(td);
		matrix large2 = new matrix(tdb);
		matrix result;
		assertFalse((result = large1.product(large2)).equals(large1));
		assertFalse(result.equals(large2));
		assertTrue((result.getDimensions()[0] == dim && result.getDimensions()[1] == dim))
		// Now test the GPU Processing time.

	}
}
