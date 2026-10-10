class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<timePoints.size(); i++){
            int hour1=Integer.parseInt(timePoints.get(i).substring(0,2));
            int minute1=Integer.parseInt(timePoints.get(i).substring(3,5));

            int hour2=Integer.parseInt(timePoints.get((i+1)%timePoints.size()).substring(0,2));
            int minute2=Integer.parseInt(timePoints.get((i+1)%timePoints.size()).substring(3,5));

            int time1=hour1*60+minute1;
            int time2=hour2*60+minute2;

            int diff= Math.abs(time2-time1);
            min= Math.min(min, Math.min(diff,1440-diff));
        }
        return min;
    }
}