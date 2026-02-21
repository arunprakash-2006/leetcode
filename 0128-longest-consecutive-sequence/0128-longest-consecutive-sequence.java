class Solution {
    public int longestConsecutive(int[] nums) {
        int max_len=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }

        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int curr=num;
                int len=1;
                while(set.contains(curr+1))
                {
                    len++;
                    curr++;
                }

                max_len=Math.max(max_len,len);

            }
        }
        
        return max_len;
    }
}