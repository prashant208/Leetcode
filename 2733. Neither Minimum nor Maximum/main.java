import java.util.Arrays;
class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] > min && nums[i+1] < max){
                return nums[i+1];
            }
        }
        return -1;
    }
}