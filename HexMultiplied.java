

public class HexMultiplied {
    public static void HexMulti(String hexvalue1, String hexvalue2){
        //used naish getDecimal into this
        int[] digithex1 = new int[16];
        int[] digithex2 = new int[16];

        int[] multdec1 = new int[16];
        int[] multdec2 = new int[16];
        int[] multdec3 = new int[16];
        int[] multdec4 = new int[16];
        int[] multdec5 = new int[16];
        
        int[] answ = new int[16];
        String[] hexansw = new String[16];
        
        String values = "0123456789ABCDEF";

        hexvalue1 = hexvalue1.toUpperCase();
        hexvalue2 = hexvalue2.toUpperCase();
        
        //Print Hex values
        System.out.print("\n");
        System.out.print(hexvalue1);
        System.out.print("  X ");
        System.out.print(hexvalue2);
        System.out.print("\n");

        //value1 to Decimal
        for (int i = 0; i < hexvalue1.length(); i++){
            char c = hexvalue1.charAt(i);
            int d = values.indexOf(c);
            digithex1[16-hexvalue1.length()+i] = d;
        }
        
        //value2 to Decimal
        for (int i = 0; i < hexvalue2.length(); i++){
            char c = hexvalue2.charAt(i);
            int d = values.indexOf(c);
            digithex2[16-hexvalue2.length()+i] = d;
        }

        //Multiplication of arrays
        int md = 1;
        for(int i = 15; i > 15-hexvalue2.length(); i--){
            int s = digithex2[i];
            int cr = 0;

            for(int j = 15; j > 15-hexvalue1.length(); j--){
                int h = digithex1[j];
                int v = ((((s*h) + cr) >= 16) ? (((s*h) + cr) % 16) : ((s*h) + cr));
                cr = (((s*h) + cr) / 16);

                if(15-hexvalue1.length() == j-1){
                    if(cr != 0){
                        if(md == 1){
                            multdec1[j] = v;
                            multdec1[j-1] = cr;
                        }
                        else if(md == 2){
                            multdec2[j-1] = v;
                            multdec2[j-1-1] = cr;
                        }
                        else if(md == 3){
                            multdec3[j-2] = v;
                            multdec3[j-1-2] = cr;
                        }
                        else if(md == 4){
                            multdec4[j-3] = v;
                            multdec4[j-1-3] = cr;
                        }
                        else if(md == 5){
                            multdec5[j-4] = v;
                            multdec5[j-1-4] = cr;
                        }
                    }
                    else{
                        if(md == 1){
                            multdec1[j] = v;
                        }
                        else if(md == 2){
                            multdec2[j-1] = v;
                        }
                        else if(md == 3){
                            multdec3[j-2] = v;
                        }
                        else if(md == 4){
                            multdec4[j-3] = v;
                        }
                        else if(md == 5){
                            multdec5[j-4] = v;
                        }
                    }
                }
                else{
                    if(md == 1){
                        multdec1[j] = v;
                    }
                    else if(md == 2){
                        multdec2[j-1] = v;
                    }
                    else if(md == 3){
                        multdec3[j-2] = v;
                    }
                    else if(md == 4){
                        multdec4[j-3] = v;
                    }
                    else if(md == 5){
                        multdec5[j-4] = v;
                    }
                }
            }
            ++md;
        }

        //Sum of Arrays
        int crr = 0;
        for(int i =15; i>0; i--){
            int r = multdec1[i] + multdec2[i] + multdec3[i]+ multdec4[i] + multdec5[i];
            int o = ((((r) + crr) >= 16) ? (((r) + crr) % 16) : ((r) + crr));
            answ[i] = o;
            crr = ((r + crr ) / 16);            
        }

        //Decimal to Hex
        for (int i = 0; i < 16; i++){
            switch (answ[i]) {
                case 0:
                hexansw[i] = "0";
                    break;
                case 1:
                hexansw[i] = "1";
                    break;
                case 2:
                hexansw[i] = "2";
                    break;
                case 3:
                hexansw[i] = "3";
                    break;
                case 4:
                hexansw[i] = "4";
                    break;
                case 5:
                hexansw[i] = "5";
                    break;
                case 6:
                hexansw[i] = "6";
                    break;
                case 7:
                hexansw[i] = "7";
                    break;
                case 8:
                hexansw[i] = "8";
                    break;
                case 9:
                hexansw[i] = "9";
                    break;
                case 10:
                hexansw[i] = "A";
                    break;
                case 11:
                hexansw[i] = "B";
                    break;
                case 12:
                hexansw[i] = "C";
                    break;
                case 13:
                hexansw[i] = "D";
                    break;
                case 14:
                hexansw[i] = "E";
                    break;
                case 15:
                hexansw[i] = "F";
                    break;
            }
            
        }
        
        //Print final Answer in HEX
        boolean haha = false;
        System.out.print("\nAnswer : ");
        for (int i = 0; i < 16; i++){
            if(hexansw[i] != "0"){
                haha = true;
            }
            if(haha){
                System.out.print(hexansw[i]);
            }
        }
        
    }

    public static void main(String args[]){
        HexMulti("abcd","1234");
    }
}
