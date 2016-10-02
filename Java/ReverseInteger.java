public class ReverseInteger {
	public int reverse(int x) {
		boolean negative = false;
		if (x < 0) {
			negative = true;
			x = -x;
		}

		int count = 0;
		while (x > 0) {
			if (count > Integer.MAX_VALUE / 10)
				return 0;
			count = count * 10 + x % 10;
			x /= 10;
		}
		if (negative)
			count = -count;
		return count;

	}
}