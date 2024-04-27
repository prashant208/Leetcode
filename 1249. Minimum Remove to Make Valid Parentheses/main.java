class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int openCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            char current = s.charAt(i);
            if (current == ')' && openCount == 0) {
                continue;
            }
            if (current == '(') {
                ++openCount;
            } else if (current == ')') {
                --openCount;
            }
            stack.push(current);
        }
        StringBuilder result = new StringBuilder();
        openCount = 0;
        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (current == '(' && openCount == 0) {
                continue;
            }
            if (current == ')') {
                ++openCount;
            } else if (current == '(') {
                --openCount;
            }
            result.append(current);
        }
        return result.reverse().toString();
    }
}
