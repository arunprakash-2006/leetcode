class Solution {
    public int longestSubstring(String s, int k) {
        return solve(s,k);
        
    }

    public int solve(String s,int k)
    {
        if(s.length()<=0) return 0;
        int freq[]=new int[26];
        int len=s.length();
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }

        for(int i=0;i<len;i++)
        {
            if(freq[s.charAt(i)-'a'] <k)
            {
                int left=solve(s.substring(0,i),k);
                int right=solve(s.substring(i+1),k);
                return Math.max(left,right);
            }

             
        }

        return s.length();


       
    }
}