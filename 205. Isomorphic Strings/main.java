class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastSeenPositionInS = new int[256];
        int[] lastSeenPositionInT = new int[256];
        int length = s.length();
        for (int i = 0; i < length; ++i){
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);
            if (lastSeenPositionInS[charFromS] != lastSeenPositionInT[charFromT]) {
                return false;
            }
            lastSeenPositionInS[charFromS] = i + 1;
            lastSeenPositionInT[charFromT] = i + 1;
        }
        return true;
    }
}