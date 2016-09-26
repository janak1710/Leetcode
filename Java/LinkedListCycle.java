public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode fastptr = head;
		ListNode slowptr = head;
		while (fastptr != null && fastptr.next != null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if (fastptr == slowptr)
				return true;
		}
		return false;
	}
}