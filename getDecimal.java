public class Hexadecimal {
    public static int getDecimal(String hexValue){
        //Convert hexadecimal to binary
        int number = 0;
        int[] digit = new int[20];
        String values = "0123456789ABCDEF";
        hexValue = hexValue.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexValue.length(); i++)
        {
            char c = hexValue.charAt(i);
            int d = values.indexOf(c);
            val = 16*val + d;
        }
        System.out.println("Decimal value: " + val);

        //Convert decimal value to an array
        number = val;
        for (int i = 0; i < 10; i++)
        {
            digit[i] = number % 10;
            number = number / 10;
        }

        return digit[4];

    }
    public static void main(String args[]){
        System.out.println(getDecimal("B8AB"));
    }
}
