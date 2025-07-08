class Solution {
    public int[] sortArray(int[] nums) {
        List<Integer> a1=new ArrayList<>();
        for(int i:nums)
        {
            a1.add(i);
        }
        Collections.sort(a1);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a1.get(i);
        }
        return nums;
    }
}