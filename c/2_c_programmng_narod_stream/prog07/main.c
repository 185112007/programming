/*
	Name: main.c
	Purpose: Operatory otnoseniya i logiceskie operatory
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	/*
		>  -->
		>= -->
		<  -->

		&& --> AND
		|| --> OR
		!  --> NOT(unary operator)
	*/

	//------------------------
	printf("\">\" ======================\r\n");
	int i = 10, j;
	while (i > 5)
	{
		printf("i = %d\r\n", i);
		i--;
	}

	//------------------------
	printf("\">=\" =====================\r\n");
	for (i = 7; i >= 3; --i)
	{
		printf("i = %d\r\n", i);
	}

	//------------------------
	printf("\"<\" =========================\r\n");
	i = 0;
	while (i < 5)
	{
		printf("i = %d\r\n", i);
		i++;
	}

	//------------------------
	printf("\"<=\" =========================\r\n");
	i = 0;
	do
	{
		printf("i = %d\r\n", i);
		i++;
	} while (i <= 5);

	//------------------------
	printf("\"==\" =========================\r\n");
	i = 5;
	while (i == 5)
	{
		printf("i = %d\r\n", i);
		i++;
	}

	//------------------------
	printf("\"!=\" =========================\r\n");
	i = 0;
	while (i != 5)
	{
		printf("i = %d\r\n", i);
		i++;
	}

	//------------------------
	printf("\"&&\" =========================\r\n");
	i = 0;
	j = 0;
	while ((i <= 5) && (j <= 7))
	{
		printf("i = %d\r\n", i);
		i++;
		j++;
	}

	//------------------------
	printf("\"||\" =========================\r\n");
	i = 0;
	j = 0;
	while ((i <= 5) || (j <= 7))
	{
		printf("i = %d\r\n", i);
		i++;
		j++;
	}

	//------------------------
	printf("\"!\" =========================\r\n");
	i = 0;
	while (!(i > 5))
	{
		printf("i = %d\r\n", i);
		i++;
	}

	return 0;
}