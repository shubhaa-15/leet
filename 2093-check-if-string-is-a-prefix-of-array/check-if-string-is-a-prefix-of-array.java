class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String t="";
        for(int i=0; i<words.length; i++){
            t+=words[i];
            if(t.equals(s)) return true;
            if(t.length()>s.length()) return false;
        }
        return false;
    }
}