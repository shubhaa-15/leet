class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mini=nums[0];
        int maxi=nums[0];
        for(int i=0; i<nums.length; i++){
            mini=Math.min(nums[i],mini);
            maxi=Math.max(nums[i],maxi);
        }
        return Math.max(0,maxi-mini-2*k);
    }
}