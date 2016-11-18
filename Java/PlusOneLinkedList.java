/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class PlusOneLinkedList {
	public ListNode plusOne(ListNode head) {
		int carry = addOne(head);
		if (carry == 1) {
			ListNode temp = new ListNode(1);
			temp.next = head;
			head = temp;
		}
		return head;
	}

	private int addOne(ListNode head) {
		if (head == null)
			return 1;
		int carry = addOne(head.next);
		int sum = head.val + carry;
		head.val = sum % 10;
		return sum / 10;
	}
}