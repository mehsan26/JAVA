public class PrintFactorial {
    public static void main(String args[])  {
        int a=printFactorial(5);
        System.out.println(a);
    }
    public static int printFactorial(int n) {
        if(n==1) {
            System.out.print(n+" = ");
            return n;
        }
        System.out.print(n+"*");
        int fact=n*printFactorial(n-1);

        return fact;
    }
}
