/**
 * Name: solution.c
 * Purpose: Using if-else statement.
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void checkn(int n)
{
	char numbers[9][6] = {"one", "two", "three", "four", "five",
			  "six", "seven", "eight", "nine"};
	if(n>=1 && n<=9)
		printf("%s\n", numbers[n-1]);
	else
		printf("Greater than 9\n");
}

int main(void)
{
	int n;

	scanf("%d", &n);

	checkn(n);

	return 0;
}
