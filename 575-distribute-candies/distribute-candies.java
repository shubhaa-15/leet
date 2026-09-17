class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int min=1;
        for(int i=1; i<candyType.length; i++){
            if(candyType[i] != candyType[i-1]) min++;
        }
        return Math.min(min, candyType.length/2);
    }
}