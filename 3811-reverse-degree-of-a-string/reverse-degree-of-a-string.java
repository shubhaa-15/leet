class Solution {
    public int reverseDegree(String s) {
        int add=0;
        for(int i=0; i<s.length(); i++){
            int reverse=26-(s.charAt(i)-'a');
            add+=reverse*(i+1);
        }
        return add;
    }
}
