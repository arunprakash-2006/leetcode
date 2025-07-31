class Solution {
    List<Integer> temp=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean [] arr=new boolean[nums.length];
        Arrays.sort(nums);
        back(nums,temp,ans,arr);
        return ans;
    }
        
    void back(int [] nums,List<Integer> temp, List<List<Integer>> ans,boolean[] arr)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !arr[i-1]) continue;
            
                temp.add(nums[i]);
                arr[i]=true;
                back(nums,temp,ans,arr);
                temp.remove(temp.size()-1);
                arr[i]=false;
                
            
        }
    }
    
        
        
    
}