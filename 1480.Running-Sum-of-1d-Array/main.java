import java.util.Scanner;

public class main {
    public static int runningSum(int []nums){
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scn.nextInt();
        }
        int ans = runningSum(nums);
        System.out.println(ans);
    }
}
