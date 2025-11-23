//Postorder Traversal
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> hs=new ArrayList<>();
        inorderTravel(root,hs);
        return hs;
    }
    void inorderTravel(TreeNode root,List<Integer> hs) {
       if(root==null) return;
        inorderTravel(root.left,hs);
        inorderTravel(root.right,hs);
        hs.add(root.val);
    }
}