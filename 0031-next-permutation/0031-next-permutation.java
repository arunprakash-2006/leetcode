class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int d_ind=-1;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                d_ind=i;
                break;
            }
        }
        if(d_ind==-1)
        {
            reverse(nums,0,len-1);
            return;
        }

        for(int i=len-1;i>=d_ind;i--)
        {
            if(nums[d_ind]<nums[i])
            {
                swap(nums,d_ind,i);
                break;
            }
        }

        reverse(nums,d_ind+1,len-1);
        
    }

    public void swap(int[] arr,int d_ind,int i)
    {
        int temp=arr[d_ind];
        arr[d_ind]=arr[i];
        arr[i]=temp;
    }

    public void reverse(int [] arr,int low,int high)
    {
        while(low<=high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }
}