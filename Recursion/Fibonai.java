class Fibonai {
    public static void main(String args[]) {
        System.out.print(fibo(10));
    }
    public static int fibo(int n) {
        if( n==0 || n==1) {
            return n;
        }
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int fn=fnm1+fnm2;
        System.out.print(" " +fn);
        return fn;
    }
}