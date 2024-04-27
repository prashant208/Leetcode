class Solution {
    public int findRotateSteps(String ring, String key) {
        int keyLength = key.length();
        int ringLength = ring.length();
        List<Integer>[] pos = new List[26];
        Arrays.setAll(pos, k -> new ArrayList<>());
        for (int i = 0; i < ringLength; ++i) {
            int index = ring.charAt(i) - 'a';
            pos[index].add(i);
        }
        int[][] dp = new int[keyLength][ringLength];
        for (var row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        for (int j : pos[key.charAt(0) - 'a']) {
            dp[0][j] = Math.min(j, ringLength - j) + 1;
        }
        for (int i = 1; i < keyLength; ++i) {
            for (int j : pos[key.charAt(i) - 'a']) {
                for (int k : pos[key.charAt(i - 1) - 'a']) {
                    dp[i][j] = Math.min(
                            dp[i][j], dp[i - 1][k] + Math.min(Math.abs(j - k), ringLength - Math.abs(j - k)) + 1);
                }
            }
        }
        int answer = Integer.MAX_VALUE / 2;
        for (int j : pos[key.charAt(keyLength - 1) - 'a']) {
            answer = Math.min(answer, dp[keyLength - 1][j]);
        }
        return answer;
    }
}
