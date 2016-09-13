public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
		return ((n & (n - 1)) == 0 && n > 0);

	}
}