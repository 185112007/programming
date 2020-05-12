/**
 * Name: solution.c
 * Purpose: Bitwise operators in C
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void calculate_the_maximum(int n, int k)
{
        int max_and=0, max_or=0, max_xor=0;
	int and, or, xor;

	for(int a=1;a<n;a++)
	{
		for(int b=a+1;b<=n;b++)
		{
			and = a&b;
			or = a|b;
			xor = a^b;
			if(max_and<and && and<k)
				max_and = and;
			if(max_or<or && or<k)
				max_or = or;
			if(max_xor<xor && xor<k)
				max_xor = xor;	
		}
	}
	printf("%d\n%d\n%d\n",max_and,max_or,max_xor);
}

int main(void)
{
	int n, k;

	scanf("%d %d", &n, &k);
	calculate_the_maximum(n, k);

	return 0;
}
