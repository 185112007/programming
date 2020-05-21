/**
* Name: sub_an_int_from_ptr.c
* Purpose: Substructing an Integer from a Pointer
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int a[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int *p, *q;

	p = &a[8];		// p points to a[8]
	q = p - 3;		// q points to a[5]
	p -= 6;			// now p points to a[2]

	printf("*p: %d\n", *p);		// prints 2
	printf("*q: %d\n", *q);		// prints 5

	return 0;
}