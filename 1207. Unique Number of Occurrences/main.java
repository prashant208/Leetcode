class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[2001]; // Using 2001 to accommodate both positive and negative values (-1000 to 1000)
        boolean[] occurrences = new boolean[1001]; // Using 1001 to check for unique occurrences

        // Count the occurrences of each value in the array
        for (int num : arr) {
            count[num + 1000]++; // Shift by 1000 to handle negative indices
        }

        // Check for unique occurrences
        for (int value : count) {
            if (value > 0) {
                if (occurrences[value]) {
                    return false; // If the occurrences are not unique, return false
                }
                occurrences[value] = true;
            }
        }

        return true; // If all occurrences are unique, return true
    }
}