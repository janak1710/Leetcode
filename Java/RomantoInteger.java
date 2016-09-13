import java.util.HashMap;

public class RomantoInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int count = 0;
		int prev = 0;
		int curr = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			curr = map.get(s.charAt(i));
			if (i == s.length() - 1 || prev <= curr) {
				count += curr;
			} else {
				count -= curr;
			}
			prev = curr;
		}
		return count;
	}
}