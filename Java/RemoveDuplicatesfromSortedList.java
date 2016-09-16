/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (!(head == null || head.next == null)) {
			ListNode curr = head;
			while (curr != null && curr.next != null) {
				if (curr.val == curr.next.val) {
					curr.next = curr.next.next;
				} else {
					curr = curr.next;
				}
			}

		}
		return head;
	}
}