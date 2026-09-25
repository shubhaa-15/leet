class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int i=1;
        while(i<arr.length){
            min = Math.min(min, arr[i] - arr[i - 1]);
            i++;
        }
        for(int j=1; j<arr.length; j++){
            if(arr[j]-arr[j-1]==min){
                list.add(Arrays.asList(arr[j-1],arr[j]));
            }        
        }
        return list;
    }
}
