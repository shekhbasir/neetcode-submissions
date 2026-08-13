class Solution {

    public static int kam1(TreeNode root) {

        // Base case
        if(root == null) {
            return 0;
        }

        // Left subtree ki height
        int left = kam1(root.left);

        // Left subtree unbalanced hai
        if(left == -1) {
            return -1;
        }

        // Right subtree ki height
        int right = kam1(root.right);

        // Right subtree unbalanced hai
        if(right == -1) {
            return -1;
        }

        // Current node par balance check
        if(Math.abs(left - right) > 1) {
            return -1;
        }

        // Current subtree ki height
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return kam1(root) != -1;
    }
}