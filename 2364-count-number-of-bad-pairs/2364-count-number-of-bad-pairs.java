class Solution {
    public long countBadPairs(int[] nums) {
        long count = 0;
        int n = nums.length;
        long pairNumb = (long) n * (n - 1) / 2;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            int freq = hm.getOrDefault(key, 0);
            count += freq;
            hm.put(key, freq + 1);
        }
        return pairNumb - count;
    }
}
