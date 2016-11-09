import java.util.Stack;

class MyQueue {

	Stack<Integer> insert = new Stack<Integer>();
	Stack<Integer> remove = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		insert.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (remove.isEmpty()) {
			while (!insert.isEmpty()) {
				remove.push(insert.pop());
			}
		}
		remove.pop();
	}

	// Get the front element.
	public int peek() {
		if (remove.isEmpty()) {
			while (!insert.isEmpty()) {
				remove.push(insert.pop());
			}
		}
		return remove.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return remove.isEmpty() && insert.isEmpty();
	}
}