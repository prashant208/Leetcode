import java.util.Scanner;

public class main {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int finaltime = arrivalTime + delayedTime;
        if (finaltime >= 24) {
            return finaltime - 24;
        } else {
            return finaltime;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arrivalTime = scn.nextInt();
        int delayedTime = scn.nextInt();
        int ans = findDelayedArrivalTime(arrivalTime, delayedTime);
        System.out.println(ans);
    }
}