class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(deck);
        int deckLength = deck.length;
        for (int i = deckLength - 1; i >= 0; --i) {
            if (!deque.isEmpty()) {
                deque.offerFirst(deque.pollLast());
            }
            deque.offerFirst(deck[i]);
        }
        int[] result = new int[deckLength];
        for (int i = deckLength - 1; i >= 0; --i) {
            result[i] = deque.pollLast();
        }
        return result;
    }
}