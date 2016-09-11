public class SingleNumber {
	public int singleNumber(int[] nums) {
		int y = 0;
		for (int x : nums) {
			y ^= x;
		}
		return y;
	}
}