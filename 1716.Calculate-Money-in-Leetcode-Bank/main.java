import java.util.Scanner;

public class main {
    public static int totalMoney(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (i / 7) + 1 + (i % 7);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = totalMoney(n);
        System.out.println(ans);
    }
}
