/*
 * Name: print_without_init.c
 * Purpose: Printing variables-without inittializing them
 * Author: Gafur Hayytayev
 */

#include <stdio.h>

int main(void)
{
	int intNumber;
	float floatNumber;

	printf("intNumber: %d\n", intNumber);
	printf("floatNumber: %f\n", floatNumber);

	return 0;
}
