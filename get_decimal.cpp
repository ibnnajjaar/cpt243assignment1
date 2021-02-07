#include<iostream>
#include<string.h>
#include<math.h>

using namespace std;

int get_decimal(){
	//Converting the hexadecimal value to decimal
	char num[20] = {"B8AB"};
    int hex, r, i, len = 0;
    int digits[20];

    len = strlen(num);
    for (i = 0; num[i] != '\0'; i++){
        len--;
        if(num[i] >= '0' && num[i] <= '9')
            r = num[i] - 48;
        else if(num[i] >= 'a' && num[i] <= 'f')
                r = num[i] - 87;
             else if(num[i] >= 'A' && num[i] <= 'F')
                    r = num[i] - 55;
        hex += r * pow(16,len);
    }

    cout<<"Decimal Value of " << num << " = " << hex << endl;

    //Converting the int decimal value to an array
    int number = hex;
    for (int i = 0; i < 10; i++){
        digits[i] = number % 10;
        number = number / 10;
    }

    cout << digits[0];

}
