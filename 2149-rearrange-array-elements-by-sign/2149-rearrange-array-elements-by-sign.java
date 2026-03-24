class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int k=0;
        int l=0;
        int final_len=0;
        int arr1[]=new int[len/2];
        int arr2[]=new int[len/2];
        for(int i=0;i<len;i++)
        {
            if(nums[i]>0)
            {
                arr1[k]=nums[i];
                k++;
            }
            else
            {
                arr2[l]=nums[i];
                l++;
            }
        }

        for(int i=0;i<len/2;i++)
        {
            nums[final_len]=arr1[i];
            final_len++;
            nums[final_len]=arr2[i];
            final_len++;
        }

        return nums;
        

        
    }
}