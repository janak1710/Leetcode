
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (isBalancedUtils(root) == Integer.MIN_VALUE)
			return false;
		else
			return true;
	}

	private int isBalancedUtils(TreeNode root) {
		if (root == null)
			return -1;
		int lh = isBalancedUtils(root.left);
		int rh = isBalancedUtils(root.right);
		if (lh == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (rh == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (Math.abs(lh - rh) > 1)
			return Integer.MIN_VALUE;
		else
			return 1 + Math.max(lh, rh);
	}
}