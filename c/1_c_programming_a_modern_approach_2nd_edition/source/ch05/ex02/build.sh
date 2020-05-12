#!/bin/bash

cpp -Wall date.c > date.i       # preprosessing, generates expanded source code
gcc -Wall -S date.i             # compilation, generates date.s, assemble code
as -Wall date.s -o date.o       # assembly, converts as code to machine code
gcc -Wall date.o -o date.exe          # linker, generate executable file

