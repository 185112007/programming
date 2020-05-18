/**
* Name: p_assignment.c
* Purpose: The Indirection Operator
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int i, j, *p, *q;

	p = &i;			/* pointer assignment:
					   the address  of i is copied into p*/

	q = p;			/* another way of pointer assignment */

	*p = 1;
	printf("\t*p = 1\n");
	printf("*p = %d\n", *p);
	printf("*q = %d\n", *q);

	*q = 2;
	printf("\n\t*q = 2\n");
	printf("*p = %d\n", *p);
	printf("*q = %d\n", *q);

	p = &i;
	q = &j;
	i = 1;
	printf("\n\tp = &i;\n");
	printf("\tq = &j;\n");
	printf("\ti = 1;\n");
	printf("*p = %d\n", *p);
	printf("*q = %d\n", *q);
	printf(" i = %d\n", i);
	printf(" j = %d\n", j);

	*q = *p;
	printf("\n\t*p = *p;\n");
	printf("*p = %d\n", *p);
	printf("*q = %d\n", *q);
	printf(" i = %d\n", i);
	printf(" j = %d\n", j);

	return 0;
}