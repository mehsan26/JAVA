// package BitManipulation;
// import java.util.*;
public class BitManipulaion {
    public static void main(String[] args) {
        // evenOrOdd(60);
        // System.out.println(getIthBit(1, 0));
        // System.out.println(setIthBit(3,2)); 
        // System.out.println(clearIthBit(7,2));
        // System.out.println(updateIthBit(10,2,1));
        // System.out.println(clearIBit(10,2));
        System.out.println(clearROBit(63,2,4));
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
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 1) {
        //     return setIthBit(n, i);
        // }
        // else {
        //     return clearIthBit(n, i);
        // }
        n=clearIthBit(n,i);
        int bitMask= newBit<<i;
        return n | bitMask;
    }
    public static int clearIBit(int n, int i) {
        int bitMask = -1<<i;
        return n & bitMask;
    }
    public static int clearROBit(int n, int i, int j) {
        // this method is done by me
        int bitMask1 = -1<<(j+1);
        int bitMask2=-1<<i;
        int finalBitMask=~(bitMask1^bitMask2);
        return n & finalBitMask;

        //this method is done my teaher

    }
    // public static int converToBinary(int n) {
    //     for(int i=n; i>0;i=i/2) {
    //         int r= n%2;
    //         int binaryNo=r;
    //     }
    // }
}






