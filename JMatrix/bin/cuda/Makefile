all:
	g++ matrixencode.cu -o matrixencode_cpu

	make dev

dev:
	nvcc matrixencode.cu -o matrixencode
