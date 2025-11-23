// Preorder Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preorderTrav(root,result);
        return result;
    }
    void preorderTrav(TreeNode root,List<Integer> result){
        if(root==null)return;
        result.add(root.val);
        preorderTrav(root.left,result);
        preorderTrav(root.right,result);
    }
}