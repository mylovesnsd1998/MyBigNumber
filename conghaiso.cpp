#include <stdio.h>
#include <string.h>
int main()
{
	char* a = "12323598352";
	char* b = "8";
	size_t a_len = strlen(a), b_len = strlen(b);
	char* result = new char[a_len + 2];
	memset(result, '0', a_len);
	bool remember = false;
	for (int i = 0; i < b_len; i++)
	{
		int temp = *(b + b_len - i - 1) - '0' + *(a + a_len - i - 1) - '0';
 
		if (remember)
			temp++;
 
		if (temp > 9)
			remember = true;
		else
			remember = false;
 
		temp = temp % 10;
 
		*(result + a_len - i) = temp + '0';
	}
 
	for (int i = 0; i < a_len - b_len; i++)
	{
		int temp = *(a + a_len - b_len - i - 1) - '0';
 
		if (remember)
			temp++;
		if (temp > 9)
			remember = true;
		else
			remember = false;
	
		temp = temp % 10;
 
		*(result + a_len - b_len - i) = temp + '0';
	}
 
	*(result + a_len + 1) = '\0';
 
	if (remember)
	{
		*(result) = '1';
	}
	else
	{
		for (int i = 0; i <= a_len; i++)
			*(result + i) = *(result + i + 1);
	}
	
	printf("%s \n", result);
	
}

