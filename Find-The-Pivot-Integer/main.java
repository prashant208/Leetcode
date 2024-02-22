import java.util.Scanner;

public class main {
    public static int pivotInteger(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        int pivotsum = 0;
        for (int i = 1; i <= n; i++) {
            pivotsum = pivotsum + i;
            if (pivotsum == (sum - pivotsum + i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = pivotInteger(n);
        System.out.println(ans);
    }
}
