import java.util.Scanner;

public class main {
    public static int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = addDigits(num);
        System.out.println(ans);
    }
}
