class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[]sq=new int[nums.length];
        for(int i=0; i<nums.length; i++){
        sq[i]=nums[i]*nums[i];
        }
        Arrays.sort(sq);
        long left=0;
        long right=0;
        for(int i=0; i<sq.length/2; i++){
                left+=sq[i];
            }
        for(int i=sq.length/2; i<sq.length; i++){
                right+=sq[i];
        }
        return right-left;
    }
}