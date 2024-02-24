import java.util.Scanner;

public class main {
    public static int findMissingAndRepeatedValues(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int ans = findMissingAndRepeatedValues(num1, num2);
        System.out.println(ans);
    }
}
