import java.util.Scanner;

public class main {
    public static int commonFactors(int a, int b) {
        int ans = 0;
        int n = Math.min(a, b);
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = commonFactors(a, b);
        System.out.println(ans);
    }
}
