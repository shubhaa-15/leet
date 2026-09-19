class Solution {
    public int minMoves(int[] nums) {
        int min= nums[0];
        int moves=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int j=0; j<nums.length; j++){
            moves+=nums[j]-min;
        }
        return moves;
    }
}