class Solution {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        String result="";
        boolean negative=false;

        if(num<0) {
            negative=true;
            num=-num;
        }
        while(num>0) {
            int rem=num % 7;
            result=rem+result;
            num/= 7;
        }
        if(negative)
            result="-" +result;
        return result;
    }
}