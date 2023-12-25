public class SwapTwoNo {
    public static void main(String args[]) {
        int x=11;
        int y=6;
        System.out.println("Before Swaping x = " + x + " and y = " +y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swaping x = " + x + " and y = " +y);
    }
}
