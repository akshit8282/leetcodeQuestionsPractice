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
    ArrayList<String>  r=new ArrayList<String>();
   public List<String> binaryTreePaths(TreeNode root) {
     
       String s="";
       helper(root,s,r);
       return r;
   }
   void helper(TreeNode root,String s,ArrayList<String> r){
       if(root==null){return;}
       String temp=s+String.valueOf(root.val);
       if(root.left==null&&root.right==null){
           r.add(temp);
           return;
       }
       helper(root.left,temp+"->",r);
       helper(root.right,temp+"->",r);
   }
}