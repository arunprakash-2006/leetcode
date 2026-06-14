class Solution {
    public int totalFruit(int[] fruits) {
        int len=fruits.length;
        int left=0;
        int right=0;
        int max_len=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(right<len)
        {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            
            while(map.size() > 2)
            {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0)
                {
                    map.remove(fruits[left]);
                }
                left++;
            }
            max_len=Math.max(max_len,right-left+1);
            right++;
        }
        return max_len;
    }
}