/**
 * Name: solution.c
 * Purpose: Using Pointers in C
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

void update(int *a, int *b)
{
	int vala = *a;
	int valb = *b;

	*a = vala + valb;	
	
	if(vala > valb)
		*b = vala - valb;
	else
		*b = valb - vala;
	
}

int main(void)
{
	int a, b;
	int *pa = &a, *pb = &b;

	scanf("%d %d", &a, &b);
	update(pa, pb);
	printf("%d\n%d\n", a, b);

	return 0;
}
