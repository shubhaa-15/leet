class Solution {
    public double angleClock(int hour, int minutes) {
        double minhand= minutes*6;
        double hourhand= hour*30+minutes*0.5;
        double angle=Math.abs(hourhand-minhand);
        return Math.min(angle, 360-angle);
    }
}