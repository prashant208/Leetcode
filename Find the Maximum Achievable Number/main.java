import java.util.Scanner;

public class main {
    public static int theMaximumAchievableX(int num, int t){
        return num + 2*t;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int t = scn.nextInt();
        int ans  = theMaximumAchievableX(num, t);
        System.err.println(ans);
    }
}
