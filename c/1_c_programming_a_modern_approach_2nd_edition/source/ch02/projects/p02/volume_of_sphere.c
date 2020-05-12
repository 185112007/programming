/*
 * Name: volume_of_sphere.c
 * Purpose: Program that computes the volume of a sphere.
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

#define FRACTION (4.0f / 3.0f)
#define PI 3.14f

int main(void)
{
	int radius;
	float volume;

	printf("Enter the radius of a sphere: ");
	scanf("%d", &radius);

	volume = FRACTION * PI * radius * radius * radius;

	printf("Volume: %.2f\n", volume);

	return 0;
}
