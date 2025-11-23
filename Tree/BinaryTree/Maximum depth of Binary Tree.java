//Maximum depth of Binary Tree- Maximum depth of binary tree is a no of nodes in a longest path from root to the farthest Node.
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}