/**
 * Name: format_product.c
 * Purpose: A program that formats product info entered by the user
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>

int main()
{
	int itemNo, mm, dd, yyyy;
	float unitPrice;
	
	printf("Enter item number: ");
	scanf("%d", &itemNo);
	printf("Enter unit price: ");
	scanf("%f", &unitPrice);
	printf("Enter purchase date (mm/dd/yyyy): ");
	scanf("%d/%d/%d", &mm, &dd, &yyyy);

	printf("\n");
	printf("Item\tUnit\tPurchase\n");
	printf("\tPrice\tDate\n");
	printf("%d\t$ %.2f\t%d/%d/%d\n", itemNo, unitPrice, mm, dd, yyyy);

	return 0;
}
