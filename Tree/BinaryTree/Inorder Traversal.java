//Inorder Traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> hs=new ArrayList<>();
        inorderTravel(root,hs);
        return hs;
    }
    void inorderTravel(TreeNode root,List<Integer> hs) {
       if(root==null) return;
        inorderTravel(root.left,hs);
        hs.add(root.val);
        inorderTravel(root.right,hs);
    }
}