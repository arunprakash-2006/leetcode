class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int temp[]=arr.clone();
        //int res[]=new int[arr.length];
        Arrays.sort(temp);
        int rank=1;
        for(int i:temp)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank++);
                
            }
        }
        int len=0;
        for(int i:arr)
        {
            temp[len]=map.get(i);
            len++;
        }

        return temp;


        
    }
}