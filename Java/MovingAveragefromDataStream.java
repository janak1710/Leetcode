import java.util.LinkedList;
import java.util.Queue;

public class MovingAveragefromDataStream {
	Queue<Integer> queue;
	int capacity;
	double sum;

	/** Initialize your data structure here. */
	public MovingAveragefromDataStream(int size) {
		this.queue = new LinkedList<Integer>();
		this.capacity = size;
		this.sum = 0;
	}

	public double next(int val) {
		if (queue.size() == capacity) {
			sum -= queue.poll();
		}
		sum += val;
		queue.offer(val);
		return sum / queue.size();
	}
}