/**
 * Name: solution.c
 * Purpose: Print Pattern using Loops
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void print_pattern(int n)
{
	int row = n * 2 - 1;
	int column = row;
	int min;

	for (int i = 0; i < row / 2 + 1; ++i)
	{

		for (int j = 0; j < row / 2 + 1; ++j)
		{
			if (j >= i)
			{
				printf("%d ", n - i);
			} else
			{
				printf("%d ", n - j);
			}
		}
		for (int j = row / 2 - 1; j >= 0; --j)
		{
			if (j >= i)
			{
				printf("%d ", n - i);
			} else
			{
				printf("%d ", n - j);
			}
		}
		printf("\n");
	}

	for (int i = row / 2 - 1; i >= 0; --i)
	{

		for (int j = 0; j < row / 2 + 1; ++j)
		{
			if (j >= i)
			{
				printf("%d ", n - i);
			} else
			{
				printf("%d ", n - j);
			}
		}
		for (int j = row / 2 - 1; j >= 0; --j)
		{
			if (j >= i)
			{
				printf("%d ", n - i);
			} else
			{
				printf("%d ", n - j);
			}
		}
		printf("\n");
	}
}

int main(void)
{
	int n;

	scanf("%d", &n);
	print_pattern(n);

	return 0;
}