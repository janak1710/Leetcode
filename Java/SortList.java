/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SortList {
	public ListNode sortList(ListNode head) {
		return mergeSort(head);
	}

	private ListNode mergeSort(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode left = head;
		ListNode right = null;

		ListNode slowptr = head;
		ListNode prev = null;
		ListNode fastptr = head;
		while (fastptr != null && fastptr.next != null) {
			prev = slowptr;
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		right = slowptr;
		prev.next = null;
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}

	private ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = null;
		if (l1.val > l2.val) {
			head = l2;
			head.next = merge(l1, l2.next);
		} else {
			head = l1;
			head.next = merge(l1.next, l2);
		}
		return head;
	}
}