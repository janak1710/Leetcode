public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		return generateTree(nums, 0, nums.length - 1);
	}

	private TreeNode generateTree(int[] nums, int start, int end) {
		TreeNode root = null;
		if (start <= end) {
			int mid = start + (end - start) / 2;
			root = new TreeNode(nums[mid]);
			root.left = generateTree(nums, start, mid - 1);
			root.right = generateTree(nums, mid + 1, end);
		}
		return root;
	}
}