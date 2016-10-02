public class MissingNumber {
	public int missingNumber(int[] nums) {
		int x1 = 0;
		for (int i = 0; i < nums.length; i++) {
			x1 ^= i ^ nums[i];
		}

		return x1 ^ nums.length;
	}
}