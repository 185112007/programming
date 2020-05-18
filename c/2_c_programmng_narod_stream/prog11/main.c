/*
	Name: main.c
	Purpose: Ternary Operator
	Author: Gafur Hayytbayev
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{

	int n1, m1, res1;

	printf("Please enter an integer (n)\r\n");
	scanf("%d", &n1);
	printf("Please enter an integer (m)\r\n");
	scanf("%d", &m1);
	res1 = (n1 > m1) ? n1 : m1;
	printf("The maximum number of entered: %d", res1);



	int n2, res2;
	printf("Please enter an integer\r\n");
	scanf("%d", &n2);
	res2 = (n2 >= 0) ? n2 : -n2;
	printf("The modulus of the entered number is %d", res2);


	int n3;
	printf("Please enter an integer\r\n");
	scanf("%d", &n3);
	printf("The number entered is %s than 10\r\n", (n3 > 10) ? "greater" : "less than or equal");


	int n4;
	printf("Please enter an integer\r\n");
	scanf("%d", &n4);
	printf("The number entered is %s10\r\n", (n4 > 10) ? "greater than " : (n4 == 10) ? "" : "less than ");


	int n5 = 0;
	char *strnum  = (char*) malloc(10);
	while ((n5 >= 0) && (n5 <= 10))
	{
		printf("Please enter an integer\r\n");
		printf("To exit the program, enter a number greater than 10 ...\r\n");
		scanf("%d", &n5);
		strnum = n5 == 0 ? "zero" :
		         n5 == 1 ? "one" :
		         n5 == 2 ? "two" :
		         n5 == 3 ? "three" :
		         n5 == 4 ? "four" :
		         n5 == 5 ? "five" :
		         n5 == 6 ? "six" :
		         n5 == 7 ? "seven" :
		         n5 == 8 ? "eight" :
		         n5 == 9 ? "nine" :
		         n5 == 10 ? "ten" :
		         "greater than 10 or less than 0";
		printf("The number entered is %s.\r\n", strnum);
	}


	return 0;
}