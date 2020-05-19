/*
	Name: main.c
	Purpose: Constant in C
	Author: Gafur Hayytbayev
*/

#include <stdio.h>
#include <stdlib.h>

//----------------------------------------------
#define VAR_CONST1 12345
#define HELLO_CONST "Hello, world!!!"
//----------------------------------------------

int main(void)
{
	const int n = 12345;
	const char str1[] = {"Hello!!!"};

	//1.
	printf("Constant value is %d\r\n", 12345); //int

	//2.
	// n = 5; // error
	printf("Constant value is %d\r\n", n); //int

	//3.
	printf("Constant value is %d\r\n", VAR_CONST1);

	//4.
	printf("Constant value is %u\r\n", 243u);//unsigned int
	printf("Constant value is %ld\r\n", 243L);//long
	printf("Constant value is %lu\r\n", 243UL);//unsigned long
	printf("Constant value is %lu\r\n", 0xFFAABBCCUL);//unsigned long
	printf("Constant value is %I64u\r\n", 0xFF00CCAAFFAABBCCUL);//unsigned long
	printf("Constant value is %lu\r\n", 043210ul);//unsigned long

	//5.
	printf("Constant value is %.25lf\r\n", 4.514);//double
	printf("Constant value is %.25lf\r\n", 753578.71345e-21);//double
	printf("Constant value is %.25f\r\n", 4.514f);//float
	printf("Constant value is %.25f\r\n", 753578.71345e-21f);//float

	//6.
	printf("Constant value is %c - 0x%02X\r\n", 'Z', 'Z');//char
	printf("Constant value is %c - 0x%02X\r\n", '0', '0');//char
	printf("Constant value is %c - 0x%02X\r\n", '\0', '\0');//char
	printf("Constant value is %c - 0x%02X\r\n", '\n', '\n');//char

	//6.
	printf("Constant value is %s\r\n", HELLO_CONST);
	printf("Constant value is %s\r\n", str1);

	return 0;
}