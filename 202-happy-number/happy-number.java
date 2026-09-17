class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4) return false;
        int sqr=0;
        while(n>0){
            int num=  n%10;
            sqr+=num*num;
            n/=10;
        }
        n=sqr;
        return isHappy(n);
    }
}