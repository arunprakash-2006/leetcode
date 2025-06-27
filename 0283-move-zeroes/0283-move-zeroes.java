class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> a=new ArrayList<>();
        int count=0;
        int zero=0;
        for(int i:nums)
        {
            if(i!=0)
            {
            a.add(i);
            }
            if(i==0){
                count++;
            }
        }

        while(count!=0)
        {
            a.add(zero);
            count--;
        }

        for(int i=0;i<a.size();i++)
        {
            nums[i]=a.get(i);
        }

        
    }
}