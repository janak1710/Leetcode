public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0)
			return true;
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (i < j && !isLetterOrDigit(s.charAt(i)))
				i++;
			while (i < j && !isLetterOrDigit(s.charAt(j)))
				j--;
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s
					.charAt(j)))
				return false;
			i++;
			j--;
		}
		return true;
	}

	private boolean isLetterOrDigit(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
				|| (c >= '0' && c <= '9');
	}
}