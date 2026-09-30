class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[] = new int[seq.length()];
        int depth=0;
        for(int i=0; i<seq.length(); i++){
            if(seq.charAt(i)=='(' ){
                arr[i]=depth%2;
                depth++;
            }else{
                depth--;
                arr[i]=depth%2;
            }
        }
        return arr;
    }
}