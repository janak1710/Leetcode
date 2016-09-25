import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		if (root == null)
			return lists;
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> curr = new Stack<TreeNode>();
		Stack<TreeNode> next = new Stack<TreeNode>();
		curr.push(root);
		boolean readleft = true;
		while (!curr.empty()) {
			TreeNode currNode = curr.pop();
			result.add(currNode.val);
			if (readleft) {
				if (currNode.left != null)
					next.push(currNode.left);
				if (currNode.right != null)
					next.push(currNode.right);
			} else {
				if (currNode.right != null)
					next.push(currNode.right);

				if (currNode.left != null)
					next.push(currNode.left);

			}
			if (curr.empty()) {
				curr = next;
				lists.add(result);
				next = new Stack<TreeNode>();
				result = new ArrayList<Integer>();
				readleft = !readleft;
			}
		}

		return lists;
	}
}