class Solution {
    public int characterReplacement(String s, int k) {
        char arr[]=s.toCharArray();
        int left=0;
        int max_freq=0;
        int ans=0;
        int freq[]=new int[26];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]-'A']++;
            max_freq=Math.max(max_freq,freq[arr[i]-'A']);
            while((i-left+1) - max_freq>k)
            {
                freq[arr[left]-'A']--;
                left++;
            }

            ans=Math.max(i-left+1,ans);

        }

        return ans;
        
    }
}