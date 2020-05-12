/*
	Name: main.c
	Purpose: Operatory otnoseniya i logiceskie operatory
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	unsigned char i;
	int n1[6];
	n1[0] = 10; n1[1] = 25; n1[2] = 33; n1[3] = 71; n1[4] = 54; n1[5] = 99;

	printf("1. ==========================================\n");
	for (i = 0; i < 6; i++)
	{
		printf("%d ", n1[i]);
	}

	printf("\n\n2. ==========================================\n");
	int n2[6] = {10, 25, 33, 71, 54, 99};
	for (i = 0; i < 6; i++)
	{
		printf("%d ", n2[i]);
	}

	printf("\n\n3. ==========================================\n");
	int n3[6] = {0};
	for (i = 0; i < 6; i++)
	{
		printf("%d ", n3[i]);
	}

	printf("\n\n4. ==========================================\n");
	int n4[6] = {18};
	for (i = 0; i < 6; i++)
	{
		printf("%d ", n4[i]);
	}

	printf("\n\n5. ==========================================\n");
	int n5[6] = {18, -35, 60};
	for (i = 0; i < 6; i++)
	{
		printf("%d ", n5[i]);
	}

	printf("\n\n6. ==========================================\n");
	char str1[10] = {'H', 'e', 'l', 'l', 'o', '!', '\0'};
	for (i = 0; i < 10; i++)
	{
		printf("%d ", str1[i]);
	}
	printf("\r\n");
	for (i = 0; i < 10; i++)
	{
		printf("%c ", str1[i]);
	}
	printf("\r\n");
	printf(str1);

	printf("\n\n7. ==========================================\n");
	char str2[] = "Hello!";
	for (i = 0; i < 7; i++)
	{
		printf("%d ", str2[i]);
	}
	printf("\r\n");
	for (i = 0; i < 7; i++)
	{
		printf("%c ", str2[i]);
	}
	printf("\r\n");
	printf(str2);

	return 0;
}