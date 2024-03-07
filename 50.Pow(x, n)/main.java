import java.util.Scanner;

public class main {
    public static double myPow(double x, int n){
        return (double)Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextInt();
        int n = scn.nextInt();
        double ans = myPow(x, n);
        System.out.println(ans);
    }
}
