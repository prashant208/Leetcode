import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static int minimumSum(int num){
        int []digit = new int[4];
        for(int i=0; num!=0; ++i){
            digit[i] = num%10;
            num = num/10;
        }

        Arrays.sort(digit);

        return 10*(digit[0] + digit[1]) + digit[2] + digit[3];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = minimumSum(num);
        System.out.println(ans);
    }
}
