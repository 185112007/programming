/**
* Name: main.c
* Purpose: Testig static variable in C
* Autho: Gafur Hayytbayev
*
* Output: 1 1
*/

#include<stdio.h>

int fun()
{
	int count = 0;
	count++;
	return count;
}

int main()
{
	printf("%d ", fun());
	printf("%d ", fun());
	return 0;
}