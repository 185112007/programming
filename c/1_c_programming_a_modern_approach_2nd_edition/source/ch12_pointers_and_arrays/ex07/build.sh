#!/bin/bash

gcc -Wall -E sum_arr_elements_using_ptr.c -o main.i		# preprocessing only: will produce the contents of the stdio.h header file joined with the contents of the "main.c" file
gcc -Wall -S main.i -o main.s		# compile only: generate assembly instructions
gcc -Wall -c main.s -o main.o		# compile and assemble: contains the object code of the program
gcc -Wall main.o -o prog.out	  	# linking: final executable program
