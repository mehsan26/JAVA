public class PQ1 {
    public static void main(String args[]) {
        System.out.println(pq1(5));
    }
    public static int pq1(int x) {
        int ans =1;
        int p=x;
        while(p>0) {
            if((p&1) !=0) {
                ans*=x;
            }
            x*=x;
            p=p>>1;
        }
        return ans;
    }
}