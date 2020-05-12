#!/bin/bash

cpp -Wall numdigits.c > numdigits.i      	# preprosessing, generates expanded source code
gcc -Wall -S numdigits.i              	# compilation, generates date.s, assemble code
as -Wall numdigits.s -o numdigits.o       # assembly, converts as code to machine code
gcc -Wall numdigits.o -o numdigits.out    # linker, generate executable file