import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		int i = 0;
		while (i < s.length()) {
			Character s1 = s.charAt(i);
			Character t2 = t.charAt(i);
			if (!map.containsKey(s1)) {
				if (map.containsValue(t2))
					return false;
				else
					map.put(s1, t2);
			} else if (map.get(s1).compareTo(t2) != 0) {
				return false;
			}
			i++;
		}

		return true;
	}
}