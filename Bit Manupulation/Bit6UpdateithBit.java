public class Bit6updateithBit {
    public static int updateIthBit(int n, int i, int newBit) {
        int bitMask = ~(1 << i);
        n = n & bitMask;
        bitMask = (newBit << i);
        return n | bitMask;
    }

    public static void main(String args[]) {
        System.out.println(updateIthBit(10, 1, 1));  // Output: 11
        System.out.println(updateIthBit(10, 1, 0));  // Output: 8
    }
}


