import java.util.Arrays;
public class ArrayToHex {
    // This method loops through a loop and changes the numbers from 10-15 to their respective Hex value
    static String[] StrArrToHex(String StrArray[]) { 
        for (int i=0; i < StrArray.length; i++) {
            switch (StrArray[i]) {
                case "10":
                StrArray[i] = "A";
                    break;
                case "11":
                StrArray[i] = "B";
                    break;
                case "12":
                StrArray[i] = "C";
                    break;
                case "13":
                StrArray[i] = "D";
                    break;
                case "14":
                StrArray[i] = "E";
                    break;
                case "15":
                StrArray[i] = "F";
                    break;
            }
        }
        return StrArray;
    }
    public static void main(String[] args) {
        String[] ex1 = {"2", "5", "9", "8", "10", "11", "12", "13", "14", "15"};

        StrArrToHex(ex1);

        System.out.println(Arrays.toString(ex1));
    }
}