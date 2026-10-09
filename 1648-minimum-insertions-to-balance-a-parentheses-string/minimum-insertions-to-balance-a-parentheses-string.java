class Solution {
    public int minInsertions(String s) {
        int left=0;
        int ans=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(left%2!=0){ 
                    ans++; 
                    left--;
                }
                left+=2;
            }
            else{
                left--;
                if(left<0){
                    ans++;
                    left=1;
                }
            }
        }
        return ans+left; 
    }
}