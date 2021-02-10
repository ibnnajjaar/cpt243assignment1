import java.util.*;
import java.io.*; 

public class MultiplyHex {

    protected String firstHex;
    protected String secondHex;
    protected int[] firstHexInDecimal;
    protected int[] secondHexInDecimal;

    public static void main(String[] args) {
        
        MultiplyHex multipleHex = new MultiplyHex();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first hex number: ");
        multipleHex.firstHex = scanner.next();
        System.out.print("Enter second hex number: ");
        multipleHex.secondHex = scanner.next();

        // String mulitpliedValue = multipleHex.multiplyGivenHexValues();
        multipleHex.firstHexInDecimal = multipleHex.convertHexToDecimal(multipleHex.firstHex);
        int[] goodArray = {1, 2, 3};
        String check = Arrays.toString(goodArray);
        System.out.println(check);
        // System.out.print("Multiplication of " + multipleHex.firstHex + " and " + multipleHex.secondHex + " is " + mulitpliedValue);

    }

    public String multiplyGivenHexValues() {
        /**
         * Convert given inputs to arrays
         * Mulitply each number into first value and get an array
         * Add arrays
         * Convert arrays back to hex
         * Convert array into string
         * return string
         */

        this.firstHexInDecimal = this.convertHexToDecimal(this.firstHex);
        this.secondHexInDecimal = this.convertHexToDecimal(this.secondHex);

        String check = Arrays.toString(this.firstHexInDecimal);

        return check;        
    }

    public int[] convertHexToDecimal(String hexValue) {

        int[] tempValues = new int[hexValue.length()]; 
        int i = 0;
        int temp;

        while (i < hexValue.length()) {
            temp = hexValue.charAt(i);

            if (temp >= 0 && temp < 10) { 
                tempValues[i] = temp;
            } else {
               // tempValues[i] = getDecimalValue(temp);
            }
            
        }

        return tempValues;
    }

    /**
     * Get decimal value from hex
     * 
     * @param value
     * @return
     */
    static int getDecimalValue(int value)
    {
        
        switch (value) {
            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;

            case 'E':
                return 14;

            case 'F':
                return 15;

            default:
                return 0;

        }

    }

    /**
     * Returns hex character for decimal values above 9 and below 16
     * 
     * @param value
     * @return
     */
    static char getHexVal(int value)
    {
        
        switch (value) {
            case 10:
                return 'A';

            case 11:
                return 'B';

            case 12:
                return 'C';

            case 13:
                return 'D';

            case 14:
                return 'E';

            case 15:
                return 'F';

            default:
                return 'X';

        }

    }

}
