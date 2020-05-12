/**
 * Name: solution.c
 * Purpose: for loop usage
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void checkab(int a, int b)
{
	int i;
	char numbers[9][6] = 
	{
		"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
	};
	for(i=a; i<=b; i++)
	{
		if(i>=1 && i<=9)
			printf("%s\n", numbers[i-1]);
		else if(i%2 == 0)
		{
			printf("even\n");
		}else
		{
			printf("odd\n");
		}
	}
}

int main(void)
{
	int a, b;

	scanf("%d\n%d", &a, &b);

	checkab(a,b);

	return 0;
}
