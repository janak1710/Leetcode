import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer>[] buckets = new List[nums.length + 1];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if (buckets[value] == null)
				buckets[value] = new ArrayList<Integer>();
			buckets[value].add(key);
		}

		List<Integer> result = new ArrayList<Integer>();

		for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
			if (buckets[i] != null)
				result.addAll(buckets[i]);
		}
		return result;
	}
}