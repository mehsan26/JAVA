class RecursionBasics {
    public static void printDec(int n) {
        if(n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if(n==0) {
            System.out.print(n);
            return;
        }
        printInc(n - 1);
        System.out.print(" "+n);
    }
    public static boolean isSorted(int arr[], int i) {
        if(arr[i]==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int n, int i) {
        if(i>arr.length-1) {
            return -1;
        }
        if(arr[i]==n) {
            return i;
        }
        return firstOccurence(arr,n,(i+1));
    }
    public static int lastOcc(int arr[], int n, int i) {
        if(i<0) {
            return -1;
        }
        if(arr[i]==n) { 
            // System.out.print(i +" ");
            // lastOcc(arr, n, i+1);
            return i;
        }
        return lastOcc(arr, n, i-1);
    }
    public static int pow(int n, int p) {
        if(p==0) {
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static int powOpti(int a, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = powOpti(a, n/2);
        int halfPowersq = halfPower * halfPower;
        if(n % 2 != 0) {
            halfPowersq=a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String args[]) {
        // printDec(10);
        // printInc(10);
        // int arr[]={1, 2, 3, 4, 5, 5, 6, 5, 8, 0};
        // System.out.print(isSorted(arr, 0));
        // System.out.println(lastOcc(arr, 5, (arr.length-1)));
        System.out.println(powOpti(3,6));
    }
}