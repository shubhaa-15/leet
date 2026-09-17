class Solution {
    public int countDigits(int num) {
        int x=num;
        int count=0;
        while(x>0){
            int digits=x%10;
            if(num%digits==0) count++;
            x/=10;
        }
        return count;
    }
}