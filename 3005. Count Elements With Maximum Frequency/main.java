import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        int[] nums2 = {1, 2, 3, 4, 5};

        System.out.println("Total frequencies of elements with maximum frequency in nums1: " + maxFreqElements(nums1));
        System.out.println("Total frequencies of elements with maximum frequency in nums2: " + maxFreqElements(nums2));
    }

    // Function to find the total frequencies of elements with maximum frequency
    public static int maxFreqElements(int[] nums) {
        int[] freq = new int[101]; // Since elements are positive integers between 1 and 100

        // Count the frequency of each element
        for (int num : nums) {
            freq[num]++;
        }

        int maxFreq = 0;
        int totalMaxFreqElements = 0;

        // Find the maximum frequency
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                totalMaxFreqElements = 1; // Reset count for new maximum frequency
            } else if (freq[i] == maxFreq) {
                totalMaxFreqElements++; // Increment count for elements with maximum frequency
            }
        }

        return maxFreq * totalMaxFreqElements;
    }
}
