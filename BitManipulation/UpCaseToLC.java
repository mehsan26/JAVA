public class UpCaseToLC {
    public static void main(String args[]) {
        for(char c='A'; c<='Z';c++){
            System.out.println((char)(c | ' '));
        }
    }
}
