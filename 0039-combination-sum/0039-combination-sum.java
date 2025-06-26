class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        back(ans,temp,target,candidates,0);
        return ans;
    }
        void back(List<List<Integer>> ans,List<Integer> temp,int target,int [] candidates,int ind)
        {
        
    
        {
            if(ind==candidates.length)
            {
                if(target==0)
                {
                    ans.add(new ArrayList<>(temp));
                }
                return;
            }

            if(candidates[ind]<=target)
            {
                temp.add(candidates[ind]);
                back(ans,temp,target-candidates[ind],candidates,ind);
                temp.remove(temp.size()-1);
            }

            back(ans,temp,target,candidates,ind+1);
        }
        
    }
}