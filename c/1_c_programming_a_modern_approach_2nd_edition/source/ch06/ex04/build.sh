#!/bin/bash

cpp -Wall square2.c > square2.i      	# preprosessing, generates expanded source code
gcc -Wall -S square2.i              	# compilation, generates date.s, assemble code
as -Wall square2.s -o square2.o       # assembly, converts as code to machine code
gcc -Wall square2.o -o square2.out    # linker, generate executable file