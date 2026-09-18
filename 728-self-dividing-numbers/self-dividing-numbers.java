class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans= new ArrayList<>();
        for(int i= left; i<=right; i++){
            int num=i;
            int count=0;
            while(num>0){
                int digits= num%10;
                if(digits !=0 && i%digits==0) count++;
                else break;
                num/=10;
            }
            if(num==0 && count>0) ans.add(i);
        }
        return ans;
    }
}