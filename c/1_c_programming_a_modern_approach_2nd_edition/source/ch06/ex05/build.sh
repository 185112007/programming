#!/bin/bash

cpp -Wall main.c > main.i      	# preprosessing, generates expanded source code
gcc -Wall -S main.i              	# compilation, generates date.s, assemble code
as -Wall main.s -o main.o       # assembly, converts as code to machine code
gcc -Wall main.o -o main.out    # linker, generate executable file