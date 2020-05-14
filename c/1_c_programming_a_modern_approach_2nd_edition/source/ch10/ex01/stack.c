/**
* Name: stack.c
* Purpose: Stack implementation in C
* Autho: Gafur Hayytbayev
*/

#include <stdbool.h>
#include <stdio.h>

#define STACK_SIZE 100

/* external variables */
int contents[STACK_SIZE];
int top = 0;

void make_empty(void)
{
	top = 0;
}

bool is_empty(void)
{
	return top == 0;
}

bool is_full(void)
{
	return top == STACK_SIZE;
}

void push(int i)
{
	if (is_full())
		stack_overflow();
	else
		contents[top++] = i;
}

int pop(void)
{
	if (is_empty())
		stack_underflow();
	else
		return contents[--top];
}

void stack_overflow(void)
{
	printf("Stack overflow!\n");
}

void stack_underflow(void)
{
	printf("Stack underflow!\n");
}