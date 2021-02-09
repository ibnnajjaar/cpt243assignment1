#include <iostream>
#include <string>
using namespace std;

/**
 * This program will add multiple arrays of same length
 * assuming 
 * 		each array is a hex value converted to decimal
 * 		each array represents a single hex value
 * and will output a hex value
 */


int getarrayback(int array[])
{
	return array;
}

int main()
{
	int array1[] = {0, 1, 2, 3, 4, 5, 6, 7};
	int array2 = getarrayback(array);
	int i = 0;
	
	while (i < 8) {
		cout << array2[i] << endl;
		i++;
	}
}
