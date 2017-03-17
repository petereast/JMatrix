package org.JMatrix;

public class CuMatrix extends matrix {
	
	// Accelerated matrix methods
	// 		Each operation is forked out to a CUDA binary - which means we need
	//		a really nice way of encoding matrices and operations into strings

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating an accelerated matrix");

	}
	
	public void iTest(){
		System.out.println(this.data);
	}

}
