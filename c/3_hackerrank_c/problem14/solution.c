/**
 * Name: solution.c
 * Purpose: Digit Frequency
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define N 10

int main() {

	int numbers[N] = {0};
	char *s;
	s = malloc(1024 * sizeof(char));
	scanf("%[^\n]", s);
	s = realloc(s, strlen(s) + 1);

	for (int i = 0; i < strlen(s); ++i)
	{
		if (isdigit(*(s + i)))
		{
			numbers[*(s + i) - '0']++;
		}
	}

	for (int i = 0; i < N; ++i)
	{
		printf("%d ", numbers[i]);
	}
	printf("\n");

	free(s);

	return 0;
}