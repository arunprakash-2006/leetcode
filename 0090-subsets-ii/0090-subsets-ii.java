import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Set<List<Integer>> ans = new HashSet<>(); 
        List<Integer> a1=new ArrayList<>();
        Arrays.sort(nums);
        back(0,a1,ans,nums);
        return new ArrayList<>(ans);
    }
    public void back(int ind,List<Integer> a1, Set<List<Integer>> ans,int[] nums)
    {
        if(ind==nums.length)
        {
            ans.add(new ArrayList<>(a1));
            return;
        }
        a1.add(nums[ind]);
        back(ind+1,a1,ans,nums);
        a1.remove(a1.size()-1);
        back(ind+1,a1,ans,nums);

    }

}