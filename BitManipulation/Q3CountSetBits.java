public class Q3CountSetBits {
    public static void main(String args[]) {
        System.out.println(countSetBit(1));
    }
    public static int countSetBit(int n) {
        int count=0;
        while (n>0) {
            if((n&1)== 1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
