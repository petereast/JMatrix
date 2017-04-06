all:
	make cpu
	make gpu

cpu:
	mkdir -p ./bin/cpu/
	gcc ./src/cpu/compiler_test.c -o ./bin/cpu/compiler_test
	./bin/cpu/compiler_test
	

gpu:
	mkdir -p ./bin/gpu
	nvcc ./src/gpu/compiler_test.cu -o ./bin/gpu/compiler_test
	./bin/gpu/compiler_test

	nvcc ./src/gpu/gpu_device_info.cu -o ./bin/gpu/gpu_device_info
	./bin/gpu/gpu_device_info

test:
	mkdir -p ./bin/test
	$(MAKE) -C ./src/test

	mv ./src/test/tmp/* ./bin/test/


clean:
	rm -rf ./bin/cpu
	rm -rf ./bin/gpu
