/**
 * Name: tprinft.c
 * Purpose: Prints int & float values in various formats
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

int main(void)
{
	int i;
	float f;

	i = 40;
	f = 839.21f;

	printf("|%d|%5d|%-5d|%5.3d|%-5.3d|\n", i, i, i, i, i);
	printf("|%10.3f|%10.3e|%-10g|\n", f, f, f);

	return 0;
}
