/*
	Name: main.c
	Purpose: Operatory otnoseniya i logiceskie operatory
	Author: Gafur Hayytbayev
*/

#include <stdio.h>
#include <string.h>

int main(void)
{
	/*
	int i, j;
	printf("1-----------------------------------------\n");
	int n[3][4];
	n[0][0] = 10; n[0][1] = 25; n[0][2] = 33; n[0][3] = 71;
	n[1][0] = 45; n[1][1] = 77; n[1][2] = 44; n[1][3] = 18;
	n[2][0] = 38; n[2][1] = 84; n[2][2] = 21; n[2][3] = 99;
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 4; j++)
		{
			printf("%d ", n[i][j]);
		}
		printf("\r\n");
	}

	printf("\n\n2-----------------------------------------\n");
	int n1[3][4] = {{10, 25, 33, 71},
		{45, 77, 44, 18},
		{38, 84, 21, 99}
	};
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 4; j++)
		{
			printf("%d ", n1[i][j]);
		}
		printf("\r\n");
	}

	printf("\n\n3-----------------------------------------\n");
	char str1[3][30];
	strcpy(str1[0], "Hello World!\r\n");
	strcpy(str1[1], "Hi!\r\n");
	strcpy(str1[2], "Hello!\r\n");
	printf("%s%s%s", str1[0], str1[1], str1[2]);

	//printf("\n\n4-----------------------------------------\n");
	char str2[3][32] = {"Hello World!\r\n", "Hi!\r\n", "Hello!\r\n"};
	printf("%s%s%s", str2[0], str2[1], str2[2]);
	*/

	printf("\n\n5-----------------------------------------\n");
	char * str3[] = {"Hello World!\r\n", "Hi!\r\n", "Hello!\r\n"};
	printf("%s%s%s", str3[0], str3[1], str3[2]);

	return 0;
}