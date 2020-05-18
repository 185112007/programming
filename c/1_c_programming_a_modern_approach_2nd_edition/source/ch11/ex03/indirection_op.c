/**
* Name: indirection_op.c
* Purpose: The Indirection Operator
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int i = 0;
	int *p = &i;

	printf("\t*p = &i\n");
	printf("i  = %d\n", i);
	printf("p  = %p\n", p);
	printf("*p = %d\n", *p);		/* prints the value of i */

	int j = *&i;					/* same as j = i */
	printf("\n\tj = *&i\n");
	printf("j  = %d\n", j);

	*p = 2;
	printf("\n\t*p = 2\n");
	printf("i  = %d\n", i);
	printf("p  = %p\n", p);
	printf("*p = %d\n", *p);

	return 0;
}