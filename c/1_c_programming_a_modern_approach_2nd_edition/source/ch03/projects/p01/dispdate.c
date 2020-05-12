/**
 * Name: dispdate.c
 * Purpose: Display date accepted from the user
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

int main(void)
{
	int mm, dd, yyyy;
	printf("Enter a date (mm/dd/yyyy): ");
	scanf("%d/%d/%d", &mm, &dd, &yyyy);

	printf("You entered the date %.4d%.2d%.2d\n", yyyy, mm, dd);

	return 0;
}
