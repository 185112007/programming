/**
 * Name: solution.c
 * Purpose: 
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

#define MAX_LEN 20

int main(void)
{
	char ch;
	char s[MAX_LEN], sen[MAX_LEN];
	
	scanf("%c", &ch);
	scanf("\n%s", s);
	scanf("\n%[^\n]%*c", sen);

	printf("%c\n", ch);
	printf("%s\n", s);
	printf("%s\n", sen);
	return 0;
}
