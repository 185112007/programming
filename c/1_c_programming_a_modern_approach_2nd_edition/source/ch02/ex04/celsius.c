/*
 * Name: celsius.c
 * Purpose: converts a Fahrenheit temperature to Celsius
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

#define FREESING_PT 32.0f
#define SCALE_FACTOR (5.0f/9.0f)

int main(void)
{
	float fahrenheit, celsius;

	printf("Enter Fahrenheit temperature: ");
	scanf("%f", &fahrenheit);
	celsius = (fahrenheit - FREESING_PT)*SCALE_FACTOR;
	printf("Celsius equivalent: %.1f\n", celsius);

	return 0;
}
