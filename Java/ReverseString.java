public class ReverseString {
	public String reverseString(String s) {
		if (s == null)
			return null;
		char arr[] = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return new String(arr);
	}
}