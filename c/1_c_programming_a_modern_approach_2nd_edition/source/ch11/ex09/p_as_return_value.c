/**
* Name: p_as_return_value.c
* Purpose: Pointer ad Return Values
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int *max(int *a, int *b);

int main(void)
{
	int *p, i = 10, j = 20;

	p = max(&i, &j);

	printf("*p: %d\n", *p);

	return 0;
}

int *max(int *a, int *b)
{
	if (*a > *b)
		return a;
	else
		return b;
}