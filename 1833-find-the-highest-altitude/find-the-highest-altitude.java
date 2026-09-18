class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> ans= new ArrayList<>();
        int alt=0;
        ans.add(alt);
        int i=0;
        while(i<gain.length){
            alt+=gain[i];
            ans.add(alt);
            i++;
        }
        int[] arr= new int[ans.size()];
        for(int j=0; j<ans.size(); j++){
            arr[j]=ans.get(j);
        }
        int max=0;
        for(int k=0; k<arr.length;k++){
            if(arr[k]>max){
                max=arr[k];
            }
        }
        return max;
    }
}