/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addUtils(l1, l2, 0);
	}

	private ListNode addUtils(ListNode l1, ListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0)
			return null;
		int sum = carry;
		if (l1 != null)
			sum += l1.val;
		if (l2 != null)
			sum += l2.val;
		ListNode head = new ListNode(sum % 10);
		head.next = addUtils(l1 == null ? null : l1.next, l2 == null ? null
				: l2.next, sum / 10);
		return head;
	}
}