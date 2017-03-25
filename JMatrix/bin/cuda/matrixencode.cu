//c++

#include <stdio.h>

int main(int argc, char* argv[]){
	printf("Hello world\n");
	// Read matrices metadata from stdin

	// format:
	//	nnn x mmm - height x width
	
	int n, m;

	// Allocate memory (both on host & device)
	// 	Allocate host memory

	// TODO: This probably isn't valid cuda code, I need to compile
	// test it.Or find an alternative
	double matrix** = new double*[n];
	for(int i = 0; i <= m; i++){
		matrix[i] = new double[m];
	}
	
	//	Allocate device memory
	//	Serialize the data so it can be addressed & accessed by
	//	the CUDA device, or use a multidimensional cuda array (werk tho)

	// read the matrix data from stdin
	// perform accelerated matrix calculation
	// write output (& metadata) to stdout
	return 0;
}
