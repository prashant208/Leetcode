import java.util.Scanner;

public class main {
    public static boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%3 != 0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }
}
