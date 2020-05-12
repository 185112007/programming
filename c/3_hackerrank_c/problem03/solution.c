/**
 * Name: solution.c
 * Purpose: Sum & Difference of Two Numbers
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

int main(void)
{
	int inum1, inum2, isum, idiff;
	float fnum1, fnum2, fsum, fdiff;

	scanf("%d%d", &inum1, &inum2);
	scanf("%f%f", &fnum1, &fnum2);
	
	isum = inum1 + inum2;
	idiff = inum1 - inum2;
	printf("%d %d\n", isum, idiff);

	fsum = fnum1 + fnum2;
	fdiff = fnum1 - fnum2;
	printf("%.1f %.1f\n", fsum, fdiff);

	return 0;
}
