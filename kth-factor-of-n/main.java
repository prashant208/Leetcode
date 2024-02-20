import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static int kthFactor(int n, int k){
        int count = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                count++;
            }
            if(count == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ans = kthFactor(n, k);
        System.out.println(ans);
    }
}
