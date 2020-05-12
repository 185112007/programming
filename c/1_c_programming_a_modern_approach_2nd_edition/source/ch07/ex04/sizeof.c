/**
* Name: sizeof.c
* Purpose: The sizeof operator
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	printf("Size of char: %lu\n", (unsigned long) sizeof(char));
	printf("Size of unsigned char: %lu\n", (unsigned long) sizeof(unsigned char));
	printf("Size of signed char: %lu\n", (unsigned long) sizeof(signed char));
	printf("Size of short int: %lu\n", (unsigned long) sizeof(short));
	printf("Size of unsigned short int: %lu\n", (unsigned long) sizeof(unsigned short));
	printf("Size of signed short int: %lu\n", (unsigned long) sizeof(signed short));
	printf("Size of int: %lu\n", (unsigned long) sizeof(int));
	printf("Size of unsigned int: %lu\n", (unsigned long) sizeof(unsigned int));
	printf("Size of signed int: %lu\n", (unsigned long) sizeof(signed int));
	printf("Size of long int: %lu\n", (unsigned long) sizeof(long int));
	printf("Size of unsigned long int: %lu\n", (unsigned long) sizeof(unsigned long int));
	printf("Size of signed long int: %lu\n", (unsigned long) sizeof(signed long int));
	printf("Size of long long int: %lu\n", (unsigned long) sizeof(long long int));
	printf("Size of unsigned long long int: %lu\n", (unsigned long) sizeof(unsigned long long int));
	printf("Size of signed long long int: %lu\n", (unsigned long) sizeof(signed long long int));
	printf("Size of float: %lu\n", (unsigned long) sizeof(float));
	printf("Size of double: %lu\n", (unsigned long) sizeof(double));
	printf("Size of long double: %lu\n", (unsigned long) sizeof(long double));

	return 0;
}