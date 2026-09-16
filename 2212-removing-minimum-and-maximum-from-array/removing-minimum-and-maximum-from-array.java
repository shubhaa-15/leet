class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0];
        int maxIn=0;
        int min=nums[0];
        int minIn=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
                maxIn=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIn=i;
            }
        }
        int left= Math.min(minIn, maxIn);
        int right=Math.max(minIn, maxIn);
        int A =right+1;
        int B =nums.length-left;
        int C =left+1+nums.length-right;

        return Math.min(A,Math.min(B,C));

    }
}