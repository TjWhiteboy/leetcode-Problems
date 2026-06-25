class Solution {
    public double angleClock(int hour, int minutes) {
        int min=minutes*6;
        double hr=(hour*30)+minutes*0.5;
        double angle=Math.abs(min-hr);
        return Math.min(angle,360-angle);
    }
}