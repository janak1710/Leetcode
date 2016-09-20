/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		if (l2 == null)
			return l1;
		else if (l1 == null)
			return l2;
		else if (l1.val > l2.val) {
			head = l2;
			head.next = mergeTwoLists(l1, l2.next);
		} else {
			head = l1;
			head.next = mergeTwoLists(l1.next, l2);
		}
		return head;
	}
}