package org.JMatrix;

import java.lang.*;
import java.lang.reflect.Array;


public class matrix {

	/**
	 * @param args
	 */
	
	double[][] data;
	
	public matrix(){
		// TODO: Instantiate the data (provide overload method)
		System.out.println("New matrix created!");
	}
	
	public matrix(double[][] data){
		this.data = data;		
	}
	
	public double[][] getData(){
		
		return this.data;
	}
	
	public boolean equals(matrix comp){
		for(double[] x : this.data){for(double y: x){
				System.out.println(y);
			}}
		
			return true;
		}
	
	public int[] getDimensions(){
		int x = 0;
		int y = 0;
		for(double[] row: this.data){
			x = Array.getLength(row);
			y++;
		}
		
		return new int[]{x,y};
	}
	
	public static int[] getDimensions(matrix m){
		return m.getDimensions();
	}
	
	public matrix product(matrix B){
		// TODO: provide method for getting the dimensions of a matrix
		
		// Dimensions of resultant matrices l * m and n * j = l * j
		
		int dims[] = new int[]{this.getDimensions()[0], B.getDimensions()[1]};
		
		double[][] result = new double[dims[0]][dims[1]];
		
		// Iterate through the rows of the original matrices and produce the resultant matrix;
		
		System.out.println(dims[0]+" - "+dims[1]);
		
		for(int x = 0; x <= dims[0]-1; x++){
			for(int y = 0; y <= dims[1]-1; y++){
				// System.out.println("x:"+x+";y:"+y);
				double tempTotal = 0;
				// For each square in the matrix
				// multiply each item in the column of this matrix by each item in the row of that matrix
				// x = column index, y = row index
				
				double[] col = new double[dims[0]];
				for(int n = 0; n != dims[0]; n ++){
					col[n] = B.data[n][x];
				}				
				int index =0;
				for(double entity: col){
					tempTotal += entity*this.data[y][index];
					// System.out.print(this.data[y][index]*entity);
					index++;
				}
				// System.out.print("\n");
				
				// System.out.println(tempTotal);
				// when multiplied, set as x,y for the result matrix
				result[x][y] = tempTotal;
			}
			
			
		}
		return new matrix(result);		
	}
	
	public double getDeterminant(){
		//ok so determinant is going to be a little difficult
		// I need to go through each diagonal of the matrix, finding the sum
		// and then performing maths on it basically THIS IS GOING TO BE A BITCH TO IMPLEMENT
		
		
		return 0;
	}
	
	public static double getDeterminance(matrix m){
		return m.getDeterminant();
	}
	
	public boolean isInvertable(){
		if(this.getDeterminant() == 0){
			return false;
		}
		return true;
	}
	
	
	@Override
	public String toString(){
		String output = "";
		
		if(this.data != null){
			output+="[";
			for(double[]x:this.data){
				output+="\n";
				for(double item: x){
					output+= item+", ";
				}
			}
			output+="]";
		}	
		return output;
	}

}
