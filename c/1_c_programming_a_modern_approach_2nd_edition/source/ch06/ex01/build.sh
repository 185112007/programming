#!/bin/bash

cpp -Wall square.c > square.i      	# preprosessing, generates expanded source code
gcc -Wall -S square.i              	# compilation, generates date.s, assemble code
as -Wall square.s -o square.o       # assembly, converts as code to machine code
gcc -Wall square.o -o square.out    # linker, generate executable file