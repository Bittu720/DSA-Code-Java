public class Bit7clearlastIbits {
    public static int clearlastIthBit(int n, int i) {
        int bitMask = (~0)<< i;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearlastIthBit(15, 2));  
    }
}


