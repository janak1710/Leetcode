public class ZigZagConversion {
	public String convert(String s, int numRows) {

		StringBuffer sbTotal = new StringBuffer("");
		StringBuffer sb[] = new StringBuffer[numRows];
		int len = s.length();
		int i = 0;
		while (i < len) {

			for (int idx = 0; idx < numRows && i < len; idx++) {
				if (sb[idx] == null)
					sb[idx] = new StringBuffer();
				sb[idx].append(s.charAt(i));
				i++;
			}
			for (int idx = numRows - 2; idx >= 1 && i < len; idx--) { // obliquely
																		// up
				if (sb[idx] == null)
					sb[idx] = new StringBuffer();
				sb[idx].append(s.charAt(i));
				i++;
			}
		}

		for (StringBuffer st : sb) {
			if (st != null)
				sbTotal.append(st);
		}
		return sbTotal.toString();

	}
}