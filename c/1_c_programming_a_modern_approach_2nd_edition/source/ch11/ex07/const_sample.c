/**
* Name: const_sample.c
* Purpose: Using const
* Autho: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	printf("1) Pointer to variable.\n");

	/*
		We can change the value of ptr and
		we can also change the value of
		object ptr pointing to.
	*/

	int i1 = 10;
	int j1 = 20;
	int *ptr1 = &i1;

	/* pointer to integer */
	printf("*ptr1: %d\n", *ptr1);

	/* pointer is pointing to another variable */
	ptr1 = &j1;
	printf("*ptr1: %d\n", *ptr1);

	/* we can change value stored by pointer */
	*ptr1 = 100;
	printf("*ptr1: %d\n", *ptr1);

	/*
		output:
			*ptr1 = 10
			*ptr1 = 20
			*ptr1 = 100
	*/

	printf("2) Pointer to constant.\n");

	/*
		We can change the pointer to point to any
		other integer variable, but cannot change
		the value of the object (entity) pointed
		using pointer ptr.
	*/

	int i2 = 10;
	int j2 = 20;
	/* ptr2 is pointer to constant */
	const int *ptr2 = &i2;

	printf("*ptr2: %d\n", *ptr2);

	/* error: object pointed cannot be modified
	   using the pointer ptr2 */
	//*ptr2 = 100;

	ptr2 = &j2;		/* valid */
	printf("*ptr2: %d\n", *ptr2);

	/*
		output:
			*ptr2 = 10
			*ptr2 = 20
	*/

	printf("3) Constant pointer to variable.\n");

	/*
		we can change the value of object pointed
		by pointer, but cannot change the pointer
		to point another variable.
	*/

	int i3 = 10;
	int j3 = 20;
	/* constant pointer to integer */
	int *const ptr3 = &i3;

	printf("*ptr3: %d\n", *ptr3);

	*ptr3 = 100;
	printf("*ptr3: %d\n", *ptr3);

	//ptr3 = &j3;		/* error */
	//printf("*ptr3: %d\n", *ptr3);

	printf("4) Constant pointer to constant.\n");

	/*
		we can change the value of object pointed
		by pointer, but cannot change the pointer
		to point another variable.
	*/

	int i4 = 10;
	int j4 = 20;
	/* constant pointer to constant integer */
	const int *const ptr4 = &i4;

	printf("*ptr4: %d\n", *ptr4);

	// *ptr4 = 100;	// error
	// ptr4 = &j4;		// error

	return 0;
}