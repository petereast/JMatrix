package org.JMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
			ProcessBuilder builder = new ProcessBuilder("./test");
			builder.redirectErrorStream(true);
			Process proc = builder.start();
			
			InputStream procStdout = proc.getInputStream();
			
			BufferedReader outputBuffer = new BufferedReader( new InputStreamReader(procStdout));
			
			System.out.println(outputBuffer.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void iTest(){
		System.out.println("itest");
	}

}
