class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i==sum(nums[i]))
            return i;
        }
        return -1;
    }
    public static int sum(int A){
        int temp=A;
        int sum=0;
        while(temp>0){
            int digits=temp%10;
            sum+=digits;
            temp/=10;
        }
        return sum;
    }
}