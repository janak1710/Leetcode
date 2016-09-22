public class PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i] += carry;
				carry = 0;
				break;
			}
		}

		if (carry == 1) {
			int sum[] = new int[digits.length + 1];
			int j;
			for (j = digits.length; j > 0; j--) {
				sum[j] = digits[j - 1];
			}
			sum[j] = 1;
			return sum;
		}
		return digits;
	}
}