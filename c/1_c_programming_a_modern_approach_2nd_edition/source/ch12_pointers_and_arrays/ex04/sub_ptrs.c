/**
* Name: sub_ptrs.c
* Purpose: Substruct One Pointer from Another
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int a[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int *p, *q, i, j;

	p = &a[5];
	q = &a[1];
	i = p - q;	// 4
	j = q - p;	// -4

	printf("i: %d\n", i);
	printf("j: %d\n", j);

	return 0;
}