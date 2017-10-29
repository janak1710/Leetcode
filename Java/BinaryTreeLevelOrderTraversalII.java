import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        if(root != null){
            
            Queue<TreeNode> curr = new LinkedList<TreeNode>();
            curr.add(root);
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            List<Integer> numberList = new ArrayList<Integer>();
            while(!curr.isEmpty()){
                TreeNode x = curr.poll();
                numberList.add(x.val);
                if(x.left != null)
                    next.add(x.left);
                if(x.right != null)
                    next.add(x.right);
                
                if(curr.isEmpty()){
                    curr = next;
                    next = new LinkedList<TreeNode>();
                    listOfList.add(numberList);
                    numberList = new ArrayList<Integer>();
                }
                
            }
            Collections.reverse(listOfList);
            
        }
        return listOfList;
    }
}