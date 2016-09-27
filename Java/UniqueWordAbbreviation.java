import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordAbbreviation {
	Map<String, Boolean> map = new HashMap<String, Boolean>();
	Set<String> set;

	public UniqueWordAbbreviation(String[] dictionary) {
		set = new HashSet<>(Arrays.asList(dictionary));
		for (String word : set) {
			String abbr = genereateAbbr(word);
			map.put(abbr, !map.containsKey(abbr));
		}
	}

	public boolean isUnique(String word) {
		Boolean hasAbbr = map.get(genereateAbbr(word));
		return hasAbbr == null || (hasAbbr && set.contains(word));
	}

	private String genereateAbbr(String word) {
		int len = word.length();
		if (len <= 2)
			return word;
		return word.charAt(0) + Integer.toString(len - 2)
				+ word.charAt(len - 1);
	}
}

// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");