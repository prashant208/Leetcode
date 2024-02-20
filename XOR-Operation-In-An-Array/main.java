import java.util.Scanner;

public class main {

    public static int xorOperation(int n, int start){
        int result = 0;
        for(int i=0; i<n; i++){
            result ^= start + 2 * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int start = scn.nextInt();
        int ans = xorOperation(n, start);
        System.out.println(ans);
    }    
}
