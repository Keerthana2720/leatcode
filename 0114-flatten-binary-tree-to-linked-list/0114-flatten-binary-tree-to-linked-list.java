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
    public void flatten(TreeNode root) {
        move(root);
    }

    // Helper function that flattens the tree and returns the tail node
    private TreeNode move(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Base case: if it’s a leaf node, return it
        if (root.left == null && root.right == null) {
            return root;
        }

        // Flatten left and right subtrees
        TreeNode leftTail = move(root.left);
        TreeNode rightTail = move(root.right);

        // If left subtree exists, attach it to the right
        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        // Return the rightmost tail
        return rightTail != null ? rightTail : leftTail;
    }
}
