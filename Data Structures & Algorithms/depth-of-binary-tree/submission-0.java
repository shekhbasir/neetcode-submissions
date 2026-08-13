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
    public static int kam(TreeNode root){
        if(root==null) return 0;

        int left=kam(root.left);
        int right=kam(root.right);

        int sabdata=Math.max(left,right);
        return 1+sabdata;
    }
    public int maxDepth(TreeNode root) {

        return kam(root);
        
    }
}
