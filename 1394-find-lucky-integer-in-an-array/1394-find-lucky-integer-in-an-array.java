class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> a1=new HashMap<>();
        for(int i:arr)
        {
            if(a1.containsKey(i))
            {
                a1.put(i,a1.get(i)+1);
            }
            else
            {
                a1.put(i,1);
            }
        }
        int maxf=-1;
        for(int key:a1.keySet())
        {
            if(key==a1.get(key))
            {
                maxf=Math.max(key,maxf);
            }
        }


        return maxf;
        
    }
}