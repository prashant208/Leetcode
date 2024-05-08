class Solution {
    public String[] findRelativeRanks(int[] scores) {
        int numAthletes = scores.length;
        Integer[] indices = new Integer[numAthletes];
        for (int i = 0; i < numAthletes; ++i) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(scores[b], scores[a]));
        String[] ranks = new String[numAthletes];
        String[] medals = new String[] { "Gold Medal", "Silver Medal", "Bronze Medal" };
        for (int i = 0; i < numAthletes; ++i) {
            if (i < 3) {
                ranks[indices[i]] = medals[i];
            } else {
                ranks[indices[i]] = String.valueOf(i + 1);
            }
        }
        return ranks;
    }
}