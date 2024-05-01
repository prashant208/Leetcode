class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        char[] charArray = word.toCharArray();
        for (int i = 0; i < index; ++i, --index) {
            char temp = charArray[i];
            charArray[i] = charArray[index];
            charArray[index] = temp;
        }
        return String.valueOf(charArray);
    }
}
