/*
	Filename: main.c
	Purpose: Types in C
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	char c1, c2;
	unsigned char c3;
	
	short ns1;
	unsigned short ns2;

	int ni1;
	unsigned int ni2;

	long nl1;
	unsigned long nl2;

	long long nll1;
	unsigned long long nll2;

	float f;
	double d;

	c1 = 'r';
	c2 = -115;
	c3 = 195;
		
	ns1 = -31511;
	ns2 = 63699;

	ni1 = -2011242517;
	ni2 = 4000000000;

	nl1 = -2011242517;
	nl2 = 4000000000;

	nll1 = -8446744073709551615;
	nll2 = 18446744073709551234ULL;

	f = 12.456f;
	d = 1.5364e-20;
	
	printf("Signed char: %c & %c\r\n", c1, c2);
	printf("Unsigned char: %c\r\n", c3);
	
    printf("Signed short: %hd\r\n", ns1);
    printf("Unsigned short: %hu\r\n", ns2);

    printf("Signed int: %d\r\n", ni1);
    printf("Unsigned int: %u\r\n", ni2);

    printf("Signed long: %ld\r\n", nl1);
    printf("Unsigned long: %lu\r\n", nl2);

    printf("Signed long long: %lld\r\n", nll1);
    printf("Unsigned long long: %llu\r\n", nll2);

	printf("Float: %f \r\n", f);;
    printf("Double: %.24lf\r\n", d);
	printf("Double with e: %lg\r\n", d);	

	printf("Hex: 0x%X\r\n", ni2);

	return 0;
}
