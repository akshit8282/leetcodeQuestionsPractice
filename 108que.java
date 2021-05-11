
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
    public TreeNode bst(int[] a,int l,int r){
        if(l>r){return null;}
        int mid=(l+r)/2;
        TreeNode t=new TreeNode(a[mid]);
        t.left=bst(a,l,mid-1);
        t.right=bst(a,mid+1,r);
        return t;
    }
}