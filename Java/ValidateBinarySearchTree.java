public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return checkValidBST(root, Double.NEGATIVE_INFINITY,
				Double.POSITIVE_INFINITY);
	}

	private boolean checkValidBST(TreeNode root, double min, double max) {
		if (root == null)
			return true;
		else if (root.val > min && root.val < max)
			return checkValidBST(root.left, min, root.val)
					&& checkValidBST(root.right, root.val, max);

		return false;
	}
}