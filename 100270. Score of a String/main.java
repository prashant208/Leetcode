class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        // Iterate through the string
        for (int i = 1; i < s.length(); i++) {
            // Calculate the absolute difference between ASCII values of adjacent characters
            int diff = Math.abs((int) s.charAt(i) - (int) s.charAt(i - 1));
            // Add the difference to the total score
            score += diff;
        }
        return score;
    }
}