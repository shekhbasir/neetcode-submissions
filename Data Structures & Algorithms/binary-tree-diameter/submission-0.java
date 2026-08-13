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
    static int  ans=0;
    public static int kam(TreeNode root){
        if(root==null) return 0;

        int left=kam(root.left);
        int right=kam(root.right);

        if(left+right>ans){
            ans=left+right;
        }

        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        kam(root);
        return ans;
    }
}
