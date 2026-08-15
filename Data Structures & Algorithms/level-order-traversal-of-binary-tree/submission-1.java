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
    // now i am going to printing the value of the new data and the task and all the value
    public static List<List<Integer>> kamkar(TreeNode root) {
        Queue<TreeNode> st = new LinkedList<>();

        ArrayList<List<Integer>> finalarr = new ArrayList<>();
        if (root == null)
            return finalarr;

        st.add(root);

        while (!st.isEmpty()) {
            int size = st.size();
            ArrayList<Integer> firstarr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = st.poll();
                firstarr.add(currentNode.val);
                if (currentNode.left != null) {
                    st.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    st.add(currentNode.right);
                }
            }
       
            finalarr.add(firstarr);
          
        }
        return finalarr;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        return kamkar(root);
    }
}
