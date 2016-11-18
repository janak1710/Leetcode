import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		if (nums == null)
			return lists;
		int max = 1 << nums.length;
		for (int i = 0; i < max; i++) {
			lists.add(generateList(i, nums));
		}
		return lists;
	}

	private List<Integer> generateList(int k, int[] nums) {
		int idx = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int j = k; j > 0; j >>= 1) {
			if ((j & 1) == 1)
				list.add(nums[idx]);
			idx++;
		}
		return list;
	}
}