import java.util.Arrays;
class Solution {
    public int dominantIndex(int[] nums) {
        int num[]=nums.clone();
        Arrays.sort(nums);
        int max=nums[nums.length-1];
       int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                index = i;
                break;
            }
        }
        for(int i=0;i<num.length;i++)
        {

            if(i!=index && max<(num[i]*2))
            {
                return -1;
            }
        }
    
        return index;

        
    }
}