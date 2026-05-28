class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0,rem;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            if(map.containsKey(rem)){
                int oldIndex=map.get(rem);
                if(i-oldIndex>=2) return true;
            }
            else map.put(rem,i);
        }
        return false;
    }
}