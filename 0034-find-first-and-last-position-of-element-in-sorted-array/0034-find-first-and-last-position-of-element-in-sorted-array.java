class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int start=findFirst(nums,target,left,right);
        int end=findLast(nums,target,left,right);
        return new int[]{start,end};        
    }

    public int findFirst(int nums[],int target,int left,int right)
    {
        int ans=-1;
        int mid=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        return ans;
        
    }

    public int findLast(int nums[],int target,int left,int right)
    {
        int ans=-1;
        int mid=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        return ans;
        
    }
}