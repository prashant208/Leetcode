class Solution {
    private String startCombination;
    private String targetCombination;
    private Set<String> deadEnds = new HashSet<>();

    public int openLock(String[] deadends, String target) {
        startCombination = "0000";
        this.targetCombination = target;

        Collections.addAll(this.deadEnds, deadends);

        if (this.deadEnds.contains(startCombination)) {
            return -1;
        }

        if (target.equals(startCombination)) {
            return 0;
        }

        return bidirectionalBfs();
    }

    private int bidirectionalBfs() {
        Map<String, Integer> visitedFromStart = new HashMap<>();
        Map<String, Integer> visitedFromTarget = new HashMap<>();
        Deque<String> queueFromStart = new ArrayDeque<>();
        Deque<String> queueFromTarget = new ArrayDeque<>();

        visitedFromStart.put(startCombination, 0);
        visitedFromTarget.put(targetCombination, 0);
        queueFromStart.offer(startCombination);
        queueFromTarget.offer(targetCombination);

        while (!queueFromStart.isEmpty() && !queueFromTarget.isEmpty()) {
            int turns = queueFromStart.size() <= queueFromTarget.size()
                    ? extendQueue(visitedFromStart, visitedFromTarget, queueFromStart)
                    : extendQueue(visitedFromTarget, visitedFromStart, queueFromTarget);
            if (turns != -1) {
                return turns;
            }
        }
        return -1;
    }

    private int extendQueue(Map<String, Integer> currentVisited, Map<String, Integer> oppositeVisited,
            Deque<String> currentQueue) {
        int currentSize = currentQueue.size();
        for (int i = 0; i < currentSize; ++i) {
            String currentCombination = currentQueue.poll();
            int currentStepCount = currentVisited.get(currentCombination);

            for (String nextCombination : getNextCombinations(currentCombination)) {

                if (currentVisited.containsKey(nextCombination) || deadEnds.contains(nextCombination)) {
                    continue;
                }

                if (oppositeVisited.containsKey(nextCombination)) {
                    return currentStepCount + 1 + oppositeVisited.get(nextCombination);
                }

                currentVisited.put(nextCombination, currentStepCount + 1);
                currentQueue.offer(nextCombination);
            }
        }
        return -1;
    }

    private List<String> getNextCombinations(String combination) {
        List<String> nextCombinations = new ArrayList<>();
        char[] chars = combination.toCharArray();

        for (int i = 0; i < 4; ++i) {
            char originalChar = chars[i];

            chars[i] = originalChar == '9' ? '0' : (char) (originalChar + 1);
            nextCombinations.add(new String(chars));

            chars[i] = originalChar == '0' ? '9' : (char) (originalChar - 1);
            nextCombinations.add(new String(chars));

            chars[i] = originalChar;
        }

        return nextCombinations;
    }
}