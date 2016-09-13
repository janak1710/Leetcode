public class MajorityElement {
	public int majorityElement(int[] nums) {
		int maj_index = 0;
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[maj_index]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				maj_index = i;
				count = 1;
			}
		}

		return nums[maj_index];
	}
}