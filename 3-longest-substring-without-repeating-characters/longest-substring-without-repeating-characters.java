class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            int idx = s.indexOf(s.charAt(i),ans);
            if(idx<i) ans=idx+1;
            max = Math.max(max,i-ans+1);
        }
        return max;
    }
}