import java.util.Scanner;

public class main {

    public static long countAlternatingSubarrays(int []nums){
        long l=-1;
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                l = i-1;
            }
            ans = ans + (i-l);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = scn.nextInt();
        }
        long ans = countAlternatingSubarrays(nums);
        System.out.println(ans);
    }
}
