import java.util.Scanner;

public class main {
    public static int numberOfEmployeesWhoMetTarget(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = numberOfEmployeesWhoMetTarget(arr, target)
        System.out.println(ans);
    }
}
