import java.util.Scanner;

public class main {
    public static boolean winnerSquareGame(int n) {
        boolean []dp = new boolean[n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j*j <= i; j++){
                if(!dp[i - j*j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = winnerSquareGame(n);
        System.out.println(ans);
    }
}
