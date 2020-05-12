/**
 * Name: solution.c
 * Purpose: Sum of Digits ot a Five Digit Number
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void sum_of_digits(int n)
{
	int sum = 0;
	int a[5] = {0,0,0,0,0};
	for(int i=0, j=1;i<5;i++, j=j*10)
	{
		a[i] = ((n-a[3]*1000-a[2]*100-a[1]*10-a[0])/j)%10;
		sum=sum+a[i];
	}

	printf("%d\n", sum);
}

int main(void)
{
	int n;
	
	scanf("%d", &n);
	sum_of_digits(n);
	return 0;
}
