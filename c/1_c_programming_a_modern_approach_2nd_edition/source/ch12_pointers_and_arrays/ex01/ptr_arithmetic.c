/**
* Name: ptr_arithmetic.c
* Purpose: Pointer Arithmetic
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int a[10] = {0}, *ptr;

	ptr = &a[0];

	*ptr = 5;
	printf("a[0]: %d\n", a[0]);
	printf("*ptr: %d\n", *ptr);

	return 0;
}