class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len=gas.length;
        int tank=0;
        int start=0;
        int ttank=0;
        int tcost=0;
        for(int i=0;i<len;i++)
        {
            ttank+=gas[i];
            tcost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0)
            {
                start=i+1;
                tank=0;
                
            }
        }
        if(ttank<tcost) return -1;
        return start;


        
    }
}