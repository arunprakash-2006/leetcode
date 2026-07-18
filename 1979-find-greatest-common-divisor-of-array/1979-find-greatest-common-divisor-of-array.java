class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i:nums)
        {
            if(max<i)
            max=i;
            if(min>i)
            min=i;
        }

        //System.out.print(max+" "+min);
        return find(max,min);
    }

    int find(int a,int b)
    {
        if(b==0) return a;
        
        return find(b,a%b);
    }
}