class Solution {
    public String makeGood(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char currentChar : s.toCharArray()) {
            if (stringBuilder.length() == 0 || Math.abs(stringBuilder.charAt(stringBuilder.length() - 1) - currentChar) != 32) {
                stringBuilder.append(currentChar);
            }else{
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        return stringBuilder.toString();
    }
}