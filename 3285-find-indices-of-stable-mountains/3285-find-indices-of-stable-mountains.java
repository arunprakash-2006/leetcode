class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> a1=new ArrayList<>();
        for(int i=1;i<height.length;i++)
        {
            if( height[i-1]>threshold)
            {
                a1.add(i);
            }
        }
        return a1;
        
    }
}