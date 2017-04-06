#include <stdio.h>
#include <stdlib.h>

int main( void ){
	//printf("Started io\n");

	FILE *out;
	out = fopen("output.txt", "a");

	fprintf(out, "started io\n");
	float value = 0;

	float *values;
	
	int qty = 10;

	//printf("Enter number of inputs\n>");

	//scanf("%h", &qty);
	
	values = malloc(sizeof(float)*qty);

	char buffer[128];
	for(int i = 0; i < qty; i++){
		//printf(":%i >", i);
		scanf("%s", &buffer);
		values[i] = atol(buffer);
		//printf("Value: %i = %f\n", i, values[i]);
		fprintf(out, "    Value %i: %f\n", i, values[i]);
	}
	
	for(int i = 0; i < qty; i++){
		value+=values[i];
	}

	printf("Average: %f\n", value/qty);
	fprintf(out, "  Average: %f\n", value/qty);
	free(values);

	return 0;
}
