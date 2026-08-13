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

    public class Solution {

    // Check whether two trees are exactly same
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Dono null hain -> same
        if (p == null && q == null) {
            return true;
        }

        // Ek null hai aur doosra nahi -> different
        if (p == null || q == null) {
            return false;
        }

        // Values different -> different
        if (p.val != q.val) {
            return false;
        }

        // Left aur right dono same hone chahiye
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    // Check whether subRoot exists inside root
    public boolean sabsahibaa(TreeNode root, TreeNode subRoot) {

        // Agar root khatam ho gaya
        if (root == null) {
            return false;
        }

        // Current node se same tree mil gaya
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Left ya right subtree mein search karo
        return sabsahibaa(root.left, subRoot)
                || sabsahibaa(root.right, subRoot);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return sabsahibaa(root,subRoot);
    }
}
