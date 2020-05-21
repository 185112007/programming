/**
* Name: ptr_comparison.c
* Purpose: Comparing Pointers
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int a[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int *p, *q;

	p = &a[5];
	q = &a[1];

	printf("(p <= q): %d\n", (p <= q));
	printf("(p >= q): %d\n", (p >= q));

	return 0;
}