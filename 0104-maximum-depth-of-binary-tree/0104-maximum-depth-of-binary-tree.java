class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root, int curr){
        if (root == null) {
            return curr;
        }
        
        int a = helper(root.left,curr+1);
        int b = helper(root.right,curr+1);
        
        return Math.max(a,b);
    }
}