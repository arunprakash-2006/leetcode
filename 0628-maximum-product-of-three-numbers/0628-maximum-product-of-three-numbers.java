class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int maxi=nums[size-1]*nums[size-2]*nums[size-3];
        int max2=nums[size-1]*nums[0]*nums[1];
        if(maxi<max2) return max2;
        return maxi;

    }
}