class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int pre=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='(') pre++;
            else{
                if(pre>0) pre--;
                else ans++;
            }
            i++;
        }
        return pre+ans;
    }
}