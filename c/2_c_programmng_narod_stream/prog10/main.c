/*
	Name: main.c
	Purpose: Using switch in C
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int n = 0;
	while (1)
	{
		printf("Enter an integer of 10, 20, 30, 40, or 50\r\n");
		scanf("%d", &n);
		switch (n)
		{
		case 10:
			printf("You entered number 10.\r\n");
			break;
		case 20:
			printf("You entered number 20.\r\n");
			break;
		/*case 25:
			printf("You entered the number 20 or 25.\r\n");*/
		case 30:
			printf("You entered number 30.\r\n");
			break;
		case 40:
			printf("You entered number 40.\r\n");
			break;
		case 50:
			printf("You entered number 50.\r\n");
			break;
		default:
			printf("The entered number does not match with any of the proposed.\r\n");
			return 0;
		}
	}

	return 0;
}