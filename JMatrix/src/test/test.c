#include <stdio.h>
int main(int argc, char * argv[]){
	FILE* x;
	x = fopen("out.txt", "a");
	fprintf(x, "test worked! - %s\n", argv[argc-1]);
	printf("Read success (y)\n");
	return 0;
}
