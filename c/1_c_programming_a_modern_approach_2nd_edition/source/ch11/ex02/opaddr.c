/**
* Name: opaddr.c
* Purpose: The Address Operator
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	int *p1;				/* points nowhere in particular */
	int i2, *p2;
	/* some code */
	p2 = &i2;				/* now p2 points to i2 */

	int i3;
	int *p3 = &i3;			/* init p3 at the time we declare it */

	int i4, *p4 = &i4;		/* combine decl of i4 with decl of p4
							   provided that i4 is declared first! */


	return 0;
}