//count subarrays whose sum equals k contains only positive
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0,count=0;
        int i=0,j=0;
        while(j<n){
            sum+=nums[j];
            while(sum>k && i<=j){
                sum-=nums[i];
                i++;
            }
            if(sum==k){
                count++;
            }
            j++;
        }
        return count;
    }
}