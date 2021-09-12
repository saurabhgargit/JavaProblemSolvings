package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderLeetCode {

    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> li = new ArrayList<Integer>();
        // if(root!=null){
        //     inorderTraversal(root.left);
        //     li.add(root.val);
        //     inorderTraversal(root.right);
        // }
        // return li;
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    public static void main(String[] args) {

        new BinaryTreeInorderLeetCode().inorderTraversal(new TreeNode());
    }
}


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
          this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


