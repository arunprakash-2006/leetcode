class Solution {
    List<Integer> temp=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean [] arr=new boolean[nums.length];
        back(nums,temp,ans,arr);
        return ans;
    }
        
    void back(int [] nums,List<Integer> temp, List<List<Integer>> ans,boolean[] arr)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!arr[i])
            {
                temp.add(nums[i]);
                arr[i]=true;
                back(nums,temp,ans,arr);
                temp.remove(temp.size()-1);
                arr[i]=false;
                
            }


        }
    }
    
        
        
    
}