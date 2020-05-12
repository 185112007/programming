/**
* Name: length.c
* Purpose: Determine the length of a message
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	char ch;
	int len = 0;

	printf("Enter a message: \n");
	ch = getchar();
	while (ch != '\n')
	{
		len++;
		ch = getchar();
	}
	printf("Your message was %d character(s) long.\n", len);

	return 0;
}