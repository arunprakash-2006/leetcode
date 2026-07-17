class Solution {
    public double angleClock(int hour, int minutes) {
        double h=60*hour;
        double m=11*minutes;
        //System.out.print((h-m)/2);
        if(Math.abs((h-m)/2)>180)
        return (double) 360f- Math.abs((h-m)/2);

        return (double) Math.abs((h-m)/2);



        
        
        
    }
}