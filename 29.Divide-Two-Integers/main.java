import java.util.Scanner;

public class main {
    public static int divide(int dividend, int divisor){
        if(dividend == -2147483648 && divisor == -1) return Integer.MAX_VALUE;
        int x = dividend / divisor;
        return x;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        int ans = divide(dividend, divisor);
        System.out.println(ans);
    }
}
