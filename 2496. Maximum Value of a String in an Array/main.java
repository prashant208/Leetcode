class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for(String str : strs){
            ans = Math.max(ans, f(str));
        }
        return ans;
    }
    public static int f(String str){
        int value = 0;
        int len = str.length();
        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                return len;
            }
            value = value * 10 + (ch - '0');
        }
        return value;
    }
}