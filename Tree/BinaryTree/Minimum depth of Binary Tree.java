//Minimum depth of Binary Tree- Minimum depth of binary tree is a no of nodes in a shortest path from root to the nearest Node.

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        return 1+Math.min(minDepth(root.right),minDepth(root.left));
    }
}