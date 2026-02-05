class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int size=nums.length;
        int [] res=new int[size];
        int newind=0;
        for(int i=0;i<size;i++)
        {
            if(nums[i]>0)
            {
                newind=(i+nums[i])%size;
                res[i]=nums[newind];
            }
            else if(nums[i]<0)
            {
                newind = ((i + nums[i]) % size + size) % size;
                System.out.print(newind+" ");
                res[i]=nums[newind];
            }
            else
            {
                res[i]=nums[i];
            }
        }

        return res;

        
        
    }
}