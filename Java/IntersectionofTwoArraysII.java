import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> numstb1 = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int num1 : nums1) {
			int count = 0;
			if (numstb1.containsKey(num1))
				count = numstb1.get(num1);
			numstb1.put(num1, count + 1);
		}
		for (int num2 : nums2) {
			if (numstb1.containsKey(num2) && numstb1.get(num2) > 0) {
				result.add(num2);
				numstb1.put(num2, numstb1.get(num2) - 1);
			}
		}
		int arr[] = new int[result.size()];
		int i = 0;
		for (int x : result)
			arr[i++] = x;
		return arr;
	}
}