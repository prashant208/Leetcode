class Solution {
    public int countTriples(int n) {
        int result = 0; // Initialize result count to 0

        // Iterate over all pairs of numbers (a, b)
        for (int a = 1; a <= n; ++a) {
            for (int b = 1; b <= n; ++b) {
                // Calculate the sum of squares of a and b
                int sumOfSquares = a * a + b * b;
                // Find the square root of the sum which should be integer if a^2 + b^2 = c^2
                int c = (int) Math.sqrt(sumOfSquares);
                // Check if c is within the limit and whether the square of c equals the sum
                if (c <= n && c * c == sumOfSquares) {
                    // If both conditions hold, increment result
                    ++result;
                }
            }
        }
        // Return the total count of triples found
        return result;
    }
}
