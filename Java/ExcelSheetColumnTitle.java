public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
		while (n > 0) {
			n--;
			sb.append((char) (n % 26 + 'A'));
			n /= 26;
		}
		return sb.reverse().toString();
	}
}