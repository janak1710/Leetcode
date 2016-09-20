public class ReverseVowelsofaString {
	public String reverseVowels(String s) {
		if (s == null)
			return s;
		int i = 0;
		int j = s.length() - 1;
		char[] chars = s.toCharArray();
		char temp;
		while (i < j) {
			while (i < j && !isVowel(chars[i]))
				i++;
			while (i < j && !isVowel(chars[j]))
				j--;
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;

		}
		return new String(chars);
	}

	private boolean isVowel(Character ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}