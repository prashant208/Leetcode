import java.util.Scanner;

public class main {
    public static int[] shuffle(int[] nums, int n) {
        int []result = new int [2*n];
        for(int index=0, resultindex=0; index<n; index++){
            result[resultindex] = nums[index];
            resultindex++;
            result[resultindex] = nums[index + n];
            resultindex++;
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
        int ans = shuffle(nums, n);
        System.out.println(ans);
    }
}
