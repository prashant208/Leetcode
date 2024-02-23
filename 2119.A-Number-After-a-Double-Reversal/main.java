import java.util.Scanner;

public class main {
    public static boolean isSameAfterReversals(int num){
        int temp = num;
        int rev = 0;
        int rev1 = 0;
        while(temp > 0){
            int rem = temp %10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        int newtemp = rev;
        while(newtemp > 0){
            int rem1 = newtemp % 10;
            rev1 = rev1 * 10 + rem1;
            newtemp = newtemp / 10;
        }
        if(rev1 == num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
        boolean ans = isSameAfterReversals(num);
        System.out.println(ans);
    }
}
