/*
	Name: main.c
	Purpose:
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int i = 10;
	printf("While loop:\n");
	while (i)
	{
		printf("i = %d\r\n", i);
		i--;
	}

	i = 10;
	printf("\nDo-while loop:\r\n");
	do
	{
		printf("i = %d\r\n", i);
		i--;
	} while (i);

	printf("\nFor loop:\r\n");
	for (i = 0; i < 10; ++i)
	{
		printf("i = %d\r\n", i);
	}

	return 0;
}
