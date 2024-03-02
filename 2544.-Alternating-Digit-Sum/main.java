import java.util.Scanner;

public class main {
    public static int alternateDigitSum(int n) {
        String num = n + "";
        int sum = Integer.parseInt(num.charAt(0) + "");
        for (int i = 1; i < num.length(); i++) {
            if (i % 2 == 1) {
                sum = sum - Integer.parseInt(num.charAt(i) + "");
            } else {
                sum = sum + Integer.parseInt(num.charAt(i) + "");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = alternateDigitSum(n);
        System.out.println(ans);
    }
}
