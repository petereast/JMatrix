package org.JMatrix;

public class JMatrix {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		matrix x = new matrix(new double[][] {{1,2}, {3,4}});
		matrix y = new matrix(new double[][] {{5, 6}, {7, 8}});
		
		System.out.println(x.product(y));
		System.out.println("3x3 product");
		
		x = new matrix(new double[][]{{1,2,3}, {4,5,6}, {7,8,9}});
		y = new matrix(new double[][]{{9,8,7}, {6,5,4}, {3,2,1}});
		
		System.out.println(x.product(y));
		
		System.out.println(x);
		
		System.out.println(x.getDimensions()[0]);

		
		CuMatrix f = (CuMatrix) new matrix(new double[][] {{5, 6}, {7, 8}});
		f.iTest();

	}
}
