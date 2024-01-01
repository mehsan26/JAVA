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
    public static void main(String args[]) {
        // printDec(10);
        // printInc(10);
        int arr[]={1,2,3,4,5};
        boolean a=isSorted(arr, 0);
        System.out.print(a);
    }
}