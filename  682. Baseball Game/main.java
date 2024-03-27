class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int[] record = new int[operations.length];
        int index = 0;

        for (String op : operations) {
            switch (op) {
                case "+":
                    int lastTwoSum = record[index - 1] + record[index - 2];
                    record[index++] = lastTwoSum;
                    sum += lastTwoSum;
                    break;
                case "D":
                    int doubleLast = record[index - 1] * 2;
                    record[index++] = doubleLast;
                    sum += doubleLast;
                    break;
                case "C":
                    sum -= record[--index];
                    break;
                default:
                    int score = Integer.parseInt(op);
                    record[index++] = score;
                    sum += score;
                    break;
            }
        }

        return sum;
    }
}