/**
 * Name: solution.c
 * Purpose: 1D Arrays in C
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int n, sum = 0;
	int *ptr;

	scanf("%d", &n);
	ptr = (int*)malloc(n * sizeof(int));

	for (int i = 0; i < n; ++i)
	{
		scanf("%d", ptr + i);
		sum += *(ptr + i);
	}

	printf("%d\n", sum);

	free(ptr);

	return 0;
}