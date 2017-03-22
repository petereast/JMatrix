//CUDA

#include <stdio.h>
#include <stdlib.h>


int main(int argc, char* argv[]){
	printf("Hello world\n");
	// Read matrices metadata from stdin

	// format:
	//	nnn x mmm - height x width
	
	int n, m;

	// Allocate memory (both on host & device)
	// 	Allocate host memory
	
	// Array of pointers;
	double *host_matrix[n];
	for(int i = 0; i < n; i++){
		host_matrix[i] = (double *)malloc(m*sizeof(double));
	}
	// useful thing: a[i][j] = *(*(a+i)+j)
	
	// Populate host memory structure with data - streamed in via stdin

	
	//	Allocate device memory
	
	double* dev_matrix;
	// serialise data for easiness
	cudaMalloc((void **)&dev_matrix, sizeof(double)*m*n);
		
	// read the matrix data from stdin
	// perform accelerated matrix calculation
	// write output (& metadata) to stdout
	return 0;
}
