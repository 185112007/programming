/**
 * Name: solution.c
 * Purpose: 1D Arrays in C
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int n;
	int *arr;

	scanf("%d", &n);
	arr = (int*)malloc(n * sizeof(int));

	for (int i = 0; i < n; ++i)
	{
		scanf("%d ", arr[i]);
	}

	for (int i = 0; i < n; ++i)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}