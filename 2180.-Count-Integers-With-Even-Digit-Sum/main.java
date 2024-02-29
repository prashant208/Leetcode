import java.util.Scanner;

public class main {
    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int digitsum = 0;
            int x = i;
            while (x > 0) {
                digitsum = digitsum + x % 10;
                x = x / 10;
            }
            if (digitsum % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = countEven(num);
        System.out.println(ans);
    }
}
