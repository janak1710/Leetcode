import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int num1 : nums1) {
			set1.add(num1);
		}
		Set<Integer> set2 = new HashSet<Integer>();
		for (int num2 : nums2) {
			if (set1.contains(num2))
				set2.add(num2);
		}

		int arr[] = new int[set2.size()];
		int i = 0;
		for (int x : set2)
			arr[i++] = x;
		return arr;
	}
}