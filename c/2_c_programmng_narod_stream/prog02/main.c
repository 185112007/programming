/**
* Filename: main.c
* Purpose:
* Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main()
{
    printf("String: ");
    printf("%s\r\n", "\"Hello, world!\"");

    printf("\nChar: ");
    printf("%c\r\n", 'e');

    printf("\nSigned integer: ");
    printf("%d\r\n", 3000000000);

    printf("\nUnsigned integer: ");
    printf("%u\r\n", 3000000000);

    printf("\nSigned short: ");
    printf("%hd\r\n", 40000);

    printf("\nUnsigned short: ");
    printf("%hu\r\n", 40000);

    printf("\nSigned long: ");
    printf("%ld\r\n", 18446744073709551615);

    printf("\nUnsigned long: ");
    printf("%llu\r\n", 18446744073709551615);

	printf("\nFloat: ");
	printf("%f\r\n", 12.456f);

	printf("\nDouble: ");
	printf("%lf\r\n", 12345.67891);
	
	printf("\nHex: ");
	printf("0x%X\r\n", 3000000000);	

    return 0;
}
