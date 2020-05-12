all: main.exe
main.exe: main.o
	gcc -Wall main.o -o main.exe
main.o:	main.s
	gcc -Wall -g3 -c main.c
main.s: main.i
	gcc -Wall -masm=intel -g3 -S main.i -o main.s
main.i: main.c
	gcc -Wall -E main.c -o main.i
clean:
	rm *.exe *.o *.s *.i
