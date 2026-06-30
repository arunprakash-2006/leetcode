class Solution {
    public int numberOfSubstrings(String s) {
        int len=s.length();
        int freq[]=new int[3];
        //int len=s.length();
        int ans=0;
        int left=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0)
            {
                ans+=len-i;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }

        return ans;
        
    }
}