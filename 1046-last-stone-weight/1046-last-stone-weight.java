class Solution {
    public int lastStoneWeight(int[] stones) {
        int s=stones.length;
        while(s!=1)
        {
            Arrays.sort(stones);
            stones[s-2]=Math.abs(stones[s-1]-stones[s-2]);
            s-=1;
        }
        return stones[0];




        }
        
    }
