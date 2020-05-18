/**
* Name: const_in_arg.c
* Purpose: Using const
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

void f(const int *p);

int main(void)
{
	int a = 1;
	const int *ptr = &a;
	f(ptr);
	return 0;
}

void f(const int *p)
{
	*p = 0;		/*** WRONG ***/
}