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
    static int max=Integer.MIN_VALUE;
    public static int sabkam1(TreeNode root){
        if(root==null) return 0;
        int left=sabkam1(root.left);
        int right=sabkam1(root.right);
        int path=root.val+Math.max(left,right);
        return Math.max(0,path);
    }
    public static void finalkam(TreeNode root){
        if (root == null) return ;
        int left = sabkam1(root.left);
        int right = sabkam1(root.right);
        max = Math.max(max, root.val + left + right);
        finalkam(root.left);
        finalkam(root.right);

        
        
    }
    public int maxPathSum(TreeNode root) {
        finalkam(root);
        return max;
        
    }
}
