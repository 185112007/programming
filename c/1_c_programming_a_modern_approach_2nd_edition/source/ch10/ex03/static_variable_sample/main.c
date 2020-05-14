/**
* Name: main.c
* Purpose: Testig static variable in C
* Autho: Gafur Hayytbayev
*
* Output: 1 2
*/

#include<stdio.h>

int fun()
{
	static int count = 0;
	count++;
	return count;
}

int main()
{
	printf("%d ", fun());
	printf("%d ", fun());
	return 0;
}