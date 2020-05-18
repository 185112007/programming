/*
	Name: main.c
	Purpose: funcitons in C
	Author: Gafur Hayytbayev
*/

#include <stdio.h>
#include <stdlib.h>

//----------------------------------------------
void print_sum(int x, int y);
int sum(int x, int y);
//----------------------------------------------

//----------------------------------------------
void my_func()
{
	printf ("Hello from myfunc!\r\n");
}
//----------------------------------------------

int main(void)
{
	my_func();

	print_sum(15, 17);

	int a = 15, b = 17;

	printf("%d + %d = %d\r\n", a, b, sum(a, b));

	return 0;
}

//----------------------------------------------
void print_sum(int x, int y)
{
	printf ("%d + %d = %d\r\n", x, y, x + y);
}
//----------------------------------------------

//----------------------------------------------
int sum(int x, int y)
{
	return x + y;
}
//----------------------------------------------