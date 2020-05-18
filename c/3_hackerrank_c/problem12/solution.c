/**
 * Name: solution.c
 * Purpose: Array Reversal
 * Author: Gafur Hayytbayev
 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i, j, tmp;
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    for (i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }


    /* Write the logic to reverse the array. */
    for (i = 0, j = num - 1; i < j; i++, j--)
    {
        tmp = *(arr + i);       /* tmp = arr[i] */
        *(arr + i) = *(arr + j);/* arr[i] = arr[j] */
        *(arr + j) = tmp;       /* arr[j] = tmp */
    }

    for (i = 0; i < num; i++)
        printf("%d ", *(arr + i));

    free(arr);

    return 0;
}