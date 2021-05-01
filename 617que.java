/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        int val = calcSum(root1, root2);
        
        TreeNode leftNode = mergeTrees(root1 != null ? root1.left : null, 
                                       root2 != null ? root2.left : null);
        TreeNode rightNode = mergeTrees(root1 != null ? root1.right : null, 
                                        root2 != null ? root2.right : null);
        
        TreeNode root = new TreeNode(val);
        root.left = leftNode;
        root.right = rightNode;
        
        return root;
    }
    
    private int calcSum(TreeNode root1, TreeNode root2) {
        int val = root1 != null ? root1.val : 0;
        val += root2 != null ? root2.val : 0;
        
        return val;
    }
}