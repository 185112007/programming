/**
* Name: ptr_to_compound_literal.c
* Purpose: Pointers to compound Literals
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int *p = (int []) {3, 0, 3, 4, 1};	// p points to the first element

	// the same with above declaration
	int a[] = {3, 0, 3, 4, 1};
	int *q = &a[0];

	return 0;
}