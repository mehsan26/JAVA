public class FastExponeiation {
    public static void main(String args[]) {
        System.out.println(fastExponent(5,5));
    }
    public static int fastExponent(int n, int p) {
        int ans=1;
        while(p>0) {
            if((p&1)==0) {
                ans=ans*1;
                n=n*n;
                p=p>>1;
            }
            else {
                ans=ans*n;
                n=n*n;
                p=p>>1;
            }
        }
        return ans;
    }
}
