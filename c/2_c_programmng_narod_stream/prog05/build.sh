#!/bin/bash

cpp -Wall main.c >> main.i	# preprocessing
gcc -Wall -S main.i -o main.s	# compile
as -Wall main.s -o main.o	# assemble
gcc -Wall main.o -o main.exe	# linking

