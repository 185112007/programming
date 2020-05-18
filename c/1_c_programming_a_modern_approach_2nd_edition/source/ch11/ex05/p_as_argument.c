/**
* Name: p_as_argument.c
* Purpose: Pointer As Argument
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

/* prototypes */
void decompose(double x, long *int_part, double *frac_part);
/*or void decompose(double, long *, double *);*/

int main(void)
{
	long i;
	double pi = 4.14159, d;

	decompose(pi, &i, &d);
	printf("pi = %lf\n", pi);
	printf("i  = %ld\n", i);
	printf("d  = %lf\n", d);

	return 0;
}

void decompose(double x, long *int_part, double *frac_part)
{
	*int_part = (long)x;
	*frac_part = x - *int_part;
}