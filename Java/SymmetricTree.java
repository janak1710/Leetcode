/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return isSymmetricUtils(root, root);
	}

	private boolean isSymmetricUtils(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		else if (p == null)
			return false;
		else if (q == null)
			return false;
		else
			return p.val == q.val && isSymmetricUtils(p.left, q.right)
					&& isSymmetricUtils(p.right, q.left);
	}
}