/**
* Name: sum.c
* Purpose: Sums a series of numbers
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int n, sum = 0;

	printf("This program sums a series of integers.\n");
	printf("Enter integer (0 to terminate): ");

	scanf("%d", &n);
	while (n != 0)
	{
		sum += n;
		scanf("%d", &n);
	}

	printf("The sum is: %d\n", sum);

	return 0;
}