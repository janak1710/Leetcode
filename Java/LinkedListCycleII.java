public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		ListNode fastptr = head;
		ListNode slowptr = head;

		do {
			if (slowptr == null || fastptr == null)
				return null;
			fastptr = fastptr.next;
			slowptr = slowptr.next;
			if (fastptr != null)
				fastptr = fastptr.next;
			else
				return null;
		} while (slowptr != fastptr);
		slowptr = head;
		while (slowptr != fastptr) {
			fastptr = fastptr.next;
			slowptr = slowptr.next;
		}
		return slowptr;
	}
}