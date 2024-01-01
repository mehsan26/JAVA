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
    public static void lastOcc(int arr[], int n, int i) {
        
    }
    public static void main(String args[]) {
        // printDec(10);
        // printInc(10);
        int arr[]={1,27,33,24,59};
        // System.out.print(isSorted(arr, 0));
        System.out.println(firstOccurence(arr, 24, 0));
    }
}