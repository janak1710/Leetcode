import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int x : nums) {
			if (!s.add(x)) {
				return true;
			}
		}
		return false;
	}
}