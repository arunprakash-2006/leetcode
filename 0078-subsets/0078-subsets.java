class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        back(0, nums, a1, ans);
        return ans;
    }


        public void back(int start,int[] nums,List<Integer> a1,List<List<Integer>> ans)
        {
            if(start==nums.length)
            {
                ans.add(new ArrayList<> (a1));
                return;

            }
            a1.add(nums[start]);
            back(start+1,nums,a1,ans);
            a1.remove(a1.size()-1);
            back(start+1,nums,a1,ans);
        }
        
        
    }
