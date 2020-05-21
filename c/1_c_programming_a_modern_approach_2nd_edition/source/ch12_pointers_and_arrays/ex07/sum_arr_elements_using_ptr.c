/**
* Name: sum_arr_elements_using_ptr.c
* Purpose: Sum array elements by incrementing ptr
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

#define N 10

int main(void)
{
	int a[N] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, sum, *p;

	sum = 0;
	for (p = &a[0]; p < &a[N]; p++)
		sum += *p;
	printf("sum: %d\n", sum);

	return 0;
}