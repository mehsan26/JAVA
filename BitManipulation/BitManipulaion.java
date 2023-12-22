// package BitManipulation;
// import java.util.*;
public class BitManipulaion {
    public static void main(String[] args) {
        // evenOrOdd(60);
        // System.out.println(getIthBit(1, 0));
        // System.out.println(setIthBit(3,2)); 
        System.out.println(clearIthBit(7,2));
    }
    public static void evenOrOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }
    public static int getIthBit(int n, int i) {
        int bitMask=1 <<0;
        if((n & bitMask) == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask=1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
}




