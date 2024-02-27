import java.util.Scanner;

public class main {
    public static int smallerNumbersThanCurrent(int []nums){
        int []result = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j]< nums[i] && i!=j){
                    count++;
                }
            }
            result[i] = count;
            count=0;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scn.nextInt();
        }
        int ans = smallerNumbersThanCurrent(nums);
        System.out.println(ans);
    }
}
