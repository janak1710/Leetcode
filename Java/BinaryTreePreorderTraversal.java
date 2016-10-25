import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> l = new ArrayList<Integer>();
		if (root == null)
			return l;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				l.add(root.val);
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				root = root.right;
			}
		}
		return l;
	}
}