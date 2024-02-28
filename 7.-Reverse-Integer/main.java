import java.util.Scanner;

public class main {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            if (reversed < Integer.MIN_VALUE / 10 || reversed > Integer.MAX_VALUE / 10) {
                return 0;
            }

            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int ans = reverse(x);
        System.out.println(ans);
    }
}
