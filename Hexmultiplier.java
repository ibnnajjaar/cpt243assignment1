
public class Hexmultiplier {
    public static void HexMulti(String hexvalue1, String hexvalue2){
        //used naish getDecimal into this
        int[] digithex1 = new int[16];
        int[] digithex2 = new int[16];

        int[] multdec1 = new int[16];
        int[] multdec2 = new int[16];
        int[] multdec3 = new int[16];
        int[] multdec4 = new int[16];
        int[] multdec5 = new int[16];
        
        String values = "0123456789ABCDEF";

        hexvalue1 = hexvalue1.toUpperCase();
        hexvalue2 = hexvalue2.toUpperCase();


        for (int i = 0; i < hexvalue1.length(); i++){
            char c = hexvalue1.charAt(i);
            int d = values.indexOf(c);
            digithex1[16-hexvalue1.length()+i] = d;
            // System.out.print(d+" ");
        }
        System.out.print("\n");
        
        for (int i = 0; i < hexvalue2.length(); i++){
            char c = hexvalue2.charAt(i);
            int d = values.indexOf(c);
            digithex2[16-hexvalue2.length()+i] = d;
        }
        System.out.print("\n");
        

        
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
                            multdec2[j-2] = v;
                            multdec2[j-1-2] = cr;
                        }
                        else if(md == 3){
                            multdec3[j-3] = v;
                            multdec3[j-1-3] = cr;
                        }
                        else if(md == 4){
                            multdec4[j] = v;
                            multdec4[j-1-4] = cr;
                        }
                        else if(md == 5){
                            multdec5[j] = v;
                            multdec5[j-1-5] = cr;
                        }
                    }
                    else{
                        if(md == 1){
                            multdec1[j] = v;
                        }
                        else if(md == 2){
                            multdec2[j-2] = v;
                        }
                        else if(md == 3){
                            multdec3[j-3] = v;
                        }
                        else if(md == 4){
                            multdec4[j-4] = v;
                        }
                        else if(md == 5){
                            multdec5[j-5] = v;
                        }
                    }
                }
                else{
                    if(md == 1){
                        multdec1[j] = v;
                    }
                    else if(md == 2){
                        multdec2[j-2] = v;
                    }
                    else if(md == 3){
                        multdec3[j-3] = v;
                    }
                    else if(md == 4){
                        multdec4[j-4] = v;
                    }
                    else if(md == 5){
                        multdec5[j-5] = v;
                    }
                }
            }
            ++md;
        }

        
        //print multipled arrays
        // multdec1[]
        // multdec2[]
        // multdec3[]
        // multdec4[]
        // multdec5[]


        for (int i = 0; i < 16; i++){
            System.out.print(multdec1[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 16; i++){
            System.out.print(multdec2[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 16; i++){
            System.out.print(multdec3[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < 16; i++){
            System.out.print(multdec4[i]+" ");
        }
        //Zeros added to the last
    }

    public static void main(String args[]){
        HexMulti("cebe","1234");
    }
}
