class Solution {
    public long wonderfulSubstrings(String word) {
        int[] stateCount = new int[1 << 10];
        stateCount[0] = 1;
        long totalCount = 0;
        int state = 0;
        for (char c : word.toCharArray()) {
            state ^= 1 << (c - 'a');

            totalCount += stateCount[state];

            for (int i = 0; i < 10; ++i) {
                totalCount += stateCount[state ^ (1 << i)];
            }
            ++stateCount[state];
        }
        return totalCount;
    }
}