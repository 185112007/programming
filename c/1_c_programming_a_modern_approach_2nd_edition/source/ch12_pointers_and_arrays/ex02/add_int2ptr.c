/**
* Name: add_int2ptr.c
* Purpose: Adding an Integer to a Pointer
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int a[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, *p, *q;

	p = &a[2];			// p points to a[2] element
	q = p + 3;			// q points to a[5] element
	p += 6;				// now p points a[8]

	printf("a[2]: %d\n", a[2]);
	printf("*p  : %d\n", *p);
	printf("*q  : %d\n", *q);

	return 0;
}