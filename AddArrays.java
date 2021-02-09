

public class AddArrays {

    /**
     * Reverses an array and returns it
     * 
     * @param array
     * @param arrayLength
     * @return
     */
    static int[] reverse(int array[], int arrayLength) 
    { 
        int[] reversedArray = new int[arrayLength]; 
        int position = arrayLength; 
        for (int i = 0; i < arrayLength; i++) { 
            reversedArray[position - 1] = array[i]; 
            position--; 
        } 
  
        return reversedArray;
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

    public static void main(String[] args) {

        /**
         * These are expected inputs
         */
        int[] arrayOne      = {0, 0, 0, 5, 12, 5, 5, 8};
        int[] arrayTwo      = {0, 0, 5, 0, 12, 10, 13, 0};
        int[] arrayThree    = {0, 7, 14, 15, 5, 9, 0, 0};
        int[] arrayFour     = {6, 7, 14, 0, 3, 0, 0, 0};


        /**
         * The arrays are reversed
         */
        int[] arrayOneReversed = reverse(arrayOne, arrayOne.length);
        int[] arrayTwoReversed = reverse(arrayTwo, arrayTwo.length);
        int[] arrayThreeReversed = reverse(arrayThree, arrayThree.length);
        int[] arrayFourReversed = reverse(arrayFour, arrayFour.length);

        /**
         * The arrays are added and assigned to another array
         */
        int i = 0;
        int sum, carry = 0, placeValue;
        int[] arraySum;
        arraySum = new int[10]; 
        while ( i < 8) {
            sum = arrayOneReversed[i] + arrayTwoReversed[i] + arrayThreeReversed[i] + arrayFourReversed[i] + carry;
            carry = (int) (sum / 16);
            placeValue = sum % 16;
            arraySum[i] = placeValue;
            i++;
        }

        /**
         * The sum array is again reverted back
         */
        int[] arraySumReversed = reverse(arraySum, arraySum.length);

        /**
         * And output(ted) as a hex value
         */
        i = 0;
        while (i < arraySumReversed.length) {

            if (arraySumReversed[i] < 10) {
                System.out.print(arraySumReversed[i]);
            } else {
                char hexVal = getHexVal(arraySumReversed[i]);
                System.out.print(hexVal);
            }
 
            i++;
        }
        
    }

}