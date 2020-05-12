#!/bin/bash

cpp -Wall sum.c > sum.i      	# preprosessing, generates expanded source code
gcc -Wall -S sum.i              	# compilation, generates date.s, assemble code
as -Wall sum.s -o sum.o       # assembly, converts as code to machine code
gcc -Wall sum.o -o sum.out    # linker, generate executable file