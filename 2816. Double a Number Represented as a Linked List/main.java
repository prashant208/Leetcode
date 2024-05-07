class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int multiplier = 2;
        int carry = 0;
        while (head != null) {
            int product = head.val * multiplier + carry;
            carry = product / 10;
            current.next = new ListNode(product % 10);
            current = current.next;
            head = head.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = dummy.next;
            dummy.next = current;
            current = next;
        }
        return dummy.next;
    }
}