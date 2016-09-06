public class Solution {
    public String addBinary(String a, String b) {

		int length1 = a.length();
		int length2 = b.length();
		if (length1 != length2) {

			int diff = Math.abs(length1 - length2);
			StringBuffer sb = new StringBuffer();
			while (diff > 0) {
				sb.append("0");
				diff--;
			}
			if (length1 < length2)
				a = sb.toString() + a;
			else
				b = sb.toString() + b;
		}

		int length = a.length();
		StringBuffer s = new StringBuffer();
		int carry = 0;

		for (int i = length - 1; i >= 0; i--) {
			int first = a.charAt(i) - '0';
			int second = b.charAt(i) - '0';
			int sum = first ^ second ^ carry;
			s.insert(0, Integer.toString(sum));
			carry = (first & second) | (first & carry) | (second & carry);
		}

		if (carry == 1)
			s.insert(0, '1');

		return s.toString();
	}
}