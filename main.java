/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        List<Integer> nodeValues = new ArrayList<>();
        while (head != null) {
            nodeValues.add(head.val);
            head = head.next;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int value : nodeValues) {
            while (!stack.isEmpty() && stack.peek() < value) {
                stack.pop();
            }
            stack.push(value);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!stack.isEmpty()) {
            current.next = new ListNode(stack.pollLast());
            current = current.next;
        }
        return dummy.next;
    }
}