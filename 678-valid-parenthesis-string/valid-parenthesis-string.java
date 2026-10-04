class Solution {
    public boolean checkValidString(String s) {
        int left=0;
        int right=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                left++;
                right++;
            }
            else if(ch==')'){
                left--;
                right--;
            }
            else{
                left--;
                right++;
            }
            if(right<0) return false;
            if(left<0) left=0;
        }
        return left==0;
    }
}