class Solution {
    public int findMaxLength(int[] nums) {
        int len=nums.length;
        int max_len=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int val;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==0)  val=-1;
            else val=1;
            sum+=val;
            if(map.containsKey(sum))
            {
                int cur_len=i-map.get(sum);
                max_len=Math.max(max_len,cur_len);
            }
            else
            {
                map.put(sum,i);
            }
        }

        
        return max_len;

        
    }
}