/*
	Name: main.c
	Purpose: Type cast in C
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

#define div(x,y) (float)(x)/(y)		// sample macro

float my_div(float a, float b);

int main(void)
{
	//1.
	char c1 = 54;
	int i1 = c1;
	printf("Value is %d\r\n", i1);

	//2.
	int i2 = 128;
	char c2 = i2;
	printf("Value is %d\r\n", c2);

	//3.
	int i3 = 8;
	int j3 = 3;
	float f_res3 = i3 / j3;
	printf("Result is %.10f\r\n", f_res3);

	//4.
	int i4 = 8;
	int j4 = 3;
	float f_res4 = (float) i4 / (float) j4;
	printf("Result is %.10f\r\n", f_res4);

	//5.
	int i5 = 8;
	int j5 = 3;
	float f_res5 = (float) i5 / j5;
	printf("Result is %.10f\r\n", f_res5);

	int i55 = 8;
	int j55 = 3;
	float f_res55 = i55 / (float) j55;
	printf("Result is %.10f\r\n", f_res55);

	//6.
	int i6 = 8;
	int j6 = 3;
	float f_res6 = my_div (i6, j6);
	printf("Result is %.10f\r\n", f_res6);

	//7.
	//небезопасное преобразование типов - от большего типа к меньшему
	unsigned int i7 = 65535;
	unsigned char c7 = i7;
	unsigned int j7 = c7;
	printf("Value is %u, %u, %u\r\n", i7, c7, j7);

	//8.
	//безопасное преобразование типов
	unsigned int i8 = 65535;
	unsigned long long j8 = i8;
	printf("Value is %u, %I64u\r\n", i8, j8);

	//9.
	/*
	int arr_i[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	float f9 = 3.1f;
	printf("Value is %d", arr_i[f9]); // error here
	*/

	//10
	int x = 2;
	int y = 3;
	float f = div(x, y);
	printf("%f\n", f);

	return 0;
}

float my_div(float a, float b)
{
	return a / b;
}