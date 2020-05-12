/**
* Name: square2.c
* Purpose: Prints a table of quares using a for statement
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int i, n;

	printf("This program prints a table of squares.\n");
	printf("Enter number of entries in table: ");
	scanf("%d", &n);

	for (i = 1; i <= n; ++i)
	{
		printf("%10d%10d\n", i, i * i);
	}

	return 0;
}