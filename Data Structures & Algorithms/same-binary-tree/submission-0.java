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

    //now here i am going to checking the two tree are same or not 
    public static boolean samebaa(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val !=q.val) return false;

        return samebaa(p.left,q.left) && samebaa(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return samebaa(p,q);
    }
}
