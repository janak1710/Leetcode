public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count *= 26;
			count += (s.charAt(i) - 'A' + 1);
		}
		return count;
	}
}