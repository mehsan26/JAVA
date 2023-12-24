public class Q2PowerOf2 {
    public static void main(String args[]) {
        powerOf2(3);
    }
    public static void powerOf2(int n) {
        if((n & (n-1)) == 0) {
            System.out.println(n+" the given no. is power of 2");
        }
        else {
            System.out.println(n+" the given no. is not power of 2");
        }
    }
}