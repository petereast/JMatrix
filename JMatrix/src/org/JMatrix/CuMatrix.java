package org.JMatrix;

import java.io.IOException;

public class CuMatrix extends matrix {
	
	// Accelerated matrix methods
	// 		Each operation is forked out to a CUDA binary - which means we need
	//		a really nice way of encoding matrices and operations into strings

	/**
	 * @param args
	 */
	
	public CuMatrix(){
		
	}
	
	public CuMatrix(double[][] data){
		this.data = data;
	}
	
	public void forktest(){
		try {
			Runtime.getRuntime().exec("./test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void iTest(){
		
	}

}
