import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char arr[] = s.toCharArray();
			Arrays.sort(arr);
			String sort = new String(arr);
			List<String> list = map.get(sort);
			if (list == null)
				list = new ArrayList<String>();
			list.add(s);
			map.put(sort, list);
		}

		List<List<String>> lists = new ArrayList<List<String>>(map.values());
		return lists;
	}
}