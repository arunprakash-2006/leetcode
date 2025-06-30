class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>ans;
        int b=nums.size();
        for(int i=0;i<b-1;i++)
        {
            for(int j=i+1;j<b;j++)
            
                if(nums[i]+nums[j]==target)
                {
                    ans.push_back(i);
                    ans.push_back(j);
                    break;
                    
                }
            }
            
             return ans;

        }
};