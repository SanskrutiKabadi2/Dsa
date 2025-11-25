// sorted array to Bst
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBst(nums,0,nums.length-1);
    }
    public TreeNode buildBst(int nums[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode tn=new TreeNode(nums[mid]);
        tn.left=buildBst(nums,start,mid-1);
        tn.right=buildBst(nums,mid+1,end);
        return tn;
    }
}