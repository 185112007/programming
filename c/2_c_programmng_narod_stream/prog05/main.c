/*
	Name: main.c
	Purpose:
	Author: Gafur Hayytbayev
*/

#include <stdio.h>

int main(void)
{
	/*
		Most Significant Bit								Least Significant Bit
			  (MSB)														 (LSB)
	     	  _|___________________________________________________________|__
			 | 1 | 0 | 1 | 1 | 1 | 0 | 0 | 1 | 1 | 0 | 1 | 0 | 1 | 0 | 1 | 1 |
			 |-------------- |---------------|---------------|---------------|
			 |---- NIBBLE ---|---- NIBBLE ---|---- NIBBLE ---|---- NIBBLE ---|
			 |								 |							     |
			 |------------- BYTE ------------|------------- BYTE ------------|
			 |																 |
			 |----------------------------- WORD ----------------------------|
	*/


	// 1byte - byte
	char c1 = 19, c2 = 100, c_sub;
	unsigned char uc1 = 195, uc2 = 33, uc_sum;

	// 2byte - word
	short ns1 = -300, ns2 = 51, ns_mul;
	unsigned short uns1 = 51247, uns2 = 1000, uns_div, uns_divmod;

	// 4byte - dword
	int ni1 = -1011242517, ni2 = 2011242517, ni3 = 4, ni_res;
	unsigned int uni1 = 4000000000, uni2 = 1000000000, uni3 = 2, uni_res;

	// 4byte - dword
	long nl1 = -2011242517, nl2 = 1011242517, nl_sum;
	unsigned long unl1 = 4000000000, unl2 = 1000000000, unl_res;

	// 8byte - qword
	long long nll1 = -8446744073709551615, nll2 = 8446744073709551615, nll_sum;
	unsigned long long unll1 = 18446744073709551234ULL;
	unsigned long long unll2 = 8446744073709551234ULL, unll_sub;

	// 8byte - qword
	float f1 = 12.456f, f2 = 2.0f, f_div;
	double d1 = 1.5364e20, d2 = 2.5, d_mul;

	c_sub = c1 - c2;
	printf("Signed char: ");
	printf("c1 = %hd; c2 = %hd\r\nc1 - c2 = %hd\r\n", c1, c2, c_sub);

	c2++;
	c_sub = c1 - c2;
	printf("Signed char increment c2: ");
	printf("c1 = %hd; c2 = %hd\r\nc1 - c2 = %hd\r\n", c1, c2, c_sub);

	c2--;
	c_sub = c1 - c2;
	printf("Signed char decrement c2: ");
	printf("c1 = %hd; c2 = %hd\r\nc1 - c2 = %hd\r\n", c1, c2, c_sub);

	uc_sum = uc1 + uc2;
	printf("Unsigned char: ");
	printf("uc1 = %hd; uc2 = %hd\r\nuc1 + uc2 = %hd\r\n", uc1, uc2, uc_sum);

	ns_mul = ns1 * ns2;
	printf("Signed short: ");
	printf("ns1 = %hd; ns2 = %hd\r\nns1 * ns2 = %hd\r\n", ns1, ns2, ns_mul);

	uns_div = uns1 / uns2;
	uns_divmod = uns1 % uns2;
	printf("Unsigned short: ");
	printf("uns1 = %hu; uns2 = %hu\r\nuns1 : uns2 = %hu\r\n", uns1, uns2, uns_div);
	printf("uns1 %% uns2 = %hu\r\n", uns_divmod);

	ni_res = (ni1 + ni2) / ni3;
	printf("Signed integer: ");
	printf("ni1 = %d; ni2 = %d; ni3 = %d\r\n", ni1, ni2, ni3);
	printf("(ni1 + ni2) / ni3 = %d\r\n", ni_res);

	uni_res = uni1 - uni2 / uni3;
	printf("Unsigned integer: ");
	printf("uni1 = %u; uni2 = %u; uni3 = %u\r\n", uni1, uni2, uni3);
	printf("uni1 - uni2 / uni3 = %u\r\n", uni_res);

	nl_sum = nl1 + nl2;
	printf("%s\n", "Signed long:");
	printf("nl1 = %ld; nl2 = %ld\r\n", nl1, nl2);
	printf("nl1 + nl2 = %ld\r\n", nl_sum);

	unl_res = unll1 - unll2;
	printf("Unsigned long:\r\n");
	printf("unl1 = %lu; unl2 = %lu\n", unl1, unl2);
	printf("unl1 - unl2 = %lu\r\n", unl_res);

	nll_sum = nll1 + nll2;
	printf("Signed long long: ");
	printf("nll1 = %I64d; nll1 = %I64d\r\n", nll1, nll2);
	printf("nll1 + nll2 = %I64d\r\n", nll_sum);

	unll_sub = unll1 - unll2;
	printf("Unsigned long long: ");
	printf("unll1 = %I64u; unll1 = %I64u\r\n", unll1, unll2);
	printf("unll1 - unll2 = %I64u\r\n", unll_sub);

	f_div = f1 / f2;
	printf("Float: ");
	printf("f1 = %f; f2 = %f\r\n", f1, f2);
	printf("f1 : f2 = %f\r\n", f_div);

	d_mul = d1 * d2;
	printf("Double: ");
	printf("d1 = %lf; d2 = %lf\r\n", d1, d2);
	printf("d1 x f2 = %lf\r\n", d_mul);

	return 0;
}
