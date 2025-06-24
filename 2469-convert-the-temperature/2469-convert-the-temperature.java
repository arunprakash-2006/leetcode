class Solution {
    public double[] convertTemperature(double celsius) {
        List <Double> a1=new ArrayList<Double>();
        double kelvin=(double)celsius+273.15;
        a1.add(kelvin);
        double faren=(double) celsius*1.80+32.00;
        a1.add(faren);
        double [] a=new double[a1.size()];
        for(int i=0;i<a1.size();i++)
        {
            a[i]=a1.get(i);
        }
        return a;
    



        
    }
}