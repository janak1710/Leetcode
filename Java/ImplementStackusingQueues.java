import java.util.LinkedList;
import java.util.Queue;

class MyStack {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int active = 1;
	Queue<Integer> qarr[] = new Queue[] { q1, q2 };

	// Push element x onto stack.
	public void push(int x) {
		qarr[active].add(x);
		active = 1 - active;
		while (!qarr[active].isEmpty()) {
			qarr[1 - active].add(qarr[active].poll());
		}
	}

	// Removes the element on top of the stack.
	public void pop() {
		if (!empty())
			qarr[1 - active].poll();
	}

	// Get the top element.
	public int top() {
		if (!empty())
			return qarr[1 - active].peek();
		return -1;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return qarr[1 - active].isEmpty();
	}
}