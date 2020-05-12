/*
	Name: main.c
	Purpose: Operatory otnoseniya i logiceskie operatory
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int n;

	printf("Please anter an integer: ");
	scanf("%d", &n);

	if (n < 10)
	{
		printf("You have entered a number less than 10\r\n");
	}

	else
	{
		printf("You entered a number greater than or equal to 10\r\n");
	}

	if ((n >= 10) && (n <= 30))
	{
		printf("You entered a number between 10 and 30\r\n");
	}
	else
	{
		printf("You entered a number less than 10 or more than 30\r\n");
	}

	if (n < 10)
	{
		printf("You have entered a number less than 10\r\n");
	}
	else if (n <= 30)
	{
		printf("You entered a number between 10 and 30\r\n");
	}
	else
	{
		printf("You entered a number greater than 30\n");
	}

	n = 0;
	while (n <= 1000)
	{
		printf("Please enter an integer.\r\n");
		printf("To exit the program, enter a number greater than 1000 ...\r\n");
		scanf("%d", &n);
		if (n < 10)
		{
			printf("You have entered a number less than 10\r\n");
		}
		else if ((n >= 10) && (n <= 30))
		{
			printf("You entered a number between 10 and 30\r\n");
		}
		else if ((n >= 31) && (n <= 100))
		{
			printf("You entered a number between 31 and 100\r\n");
		}
		else
		{
			printf("You entered a number greater than 100\r\n");
		}
	}

	return 0;
}