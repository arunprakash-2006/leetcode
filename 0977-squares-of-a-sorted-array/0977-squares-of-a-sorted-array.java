import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int size=nums.length;
        int arr[]=new int[size];
       
        for(int i=0;i<size;i++)
        {
            arr[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(arr);
         
         return arr;
         
    }
}