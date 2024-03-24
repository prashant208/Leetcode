class Solution {
    public int countLargestGroup(int n) {
        int []sumfrequency = new int[40]; // The maximum sum for n digits can be 9 * 4 = 36, thus 40 is safe.
        int max = 0; // This will hold the count of groups with the largest size.
        int totalmaxfreq = 0; // This will hold the maximum size of any group encountered.

        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int x=i; x>0; x /= 10){
                sum = sum + x%10;
            }
            sumfrequency[sum]++;

            if (max < sumfrequency[sum]) {
                max = sumfrequency[sum];
                totalmaxfreq = 1; // Reset count for new maximum frequency
            } else if (sumfrequency[sum] == max) {
                totalmaxfreq++; // Increment count for elements with maximum frequency
            }
        }
        return totalmaxfreq;
    }
}