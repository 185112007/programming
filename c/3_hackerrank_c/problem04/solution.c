/**
 * Name: solution.c
 * Purpose: find max of 4 numbers
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

int max_of_four(int a, int b, int c, int d)
{
	if(a >= b && a >= c && a >= d)
		return a;
	if(b >= a && b >= c && b >= d)
		return b;
	if(c >= a && c >= b && c >= d)
		return c;
	return d;
}

int main(void)
{
	int num1, num2, num3, num4, max;

	scanf("%d", &num1);
	scanf("%d", &num2);
	scanf("%d", &num3);
	scanf("%d", &num4);

	max = max_of_four(num1, num2, num3, num4);
	
	printf("%d\n", max);

	return 0;
}
