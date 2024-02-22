import java.util.Scanner;

public class main {
    public static int maximum69Number(int n) {
        int temp = n;
        int idx = 0;
        int i = 0;
        while(temp > 0){
            i++;
            int digit = temp % 10;
            temp = temp / 10;
            if(digit == 6){
                idx = i;
            }
        }
        return n + 3 * (int)Math.pow(10, idx-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = maximum69Number(n);
        System.out.println(ans);
    }
}
