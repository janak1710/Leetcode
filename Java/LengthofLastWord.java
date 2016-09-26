public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		int result = 0;
		if (s == null)
			return result;

		s = s.trim();
		int len = s.length();
		if (len == 0)
			return result;

		boolean found = false;
		for (int i = len - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				found = true;
				result++;
			} else {
				if (found)
					return result;
			}
		}
		return result;
	}
}