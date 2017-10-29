import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> output = new ArrayList<Integer>();
		combination(result, output, k, 1, n);
		return result;

	}

	private void combination(List<List<Integer>> ans, List<Integer> comb,
			int k, int start, int n) {
		if (comb.size() > k) {
			return;
		}
		if (comb.size() == k && n == 0) {
			List<Integer> li = new ArrayList<Integer>(comb);
			ans.add(li);
			return;
		}
		for (int i = start; i <= 9; i++) {
			if (n - i >= 0) {
				comb.add(i);
				combination(ans, comb, k, i + 1, n - i);
				comb.remove(comb.size() - 1);
			}

		}
	}

}