class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false; 
        int w_size=s1.length();
        int freq[]=new int[26];
        int freq1[]=new int[26];
        for(int i=0;i<w_size;i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<w_size;i++)
        {
            freq1[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq1))
        {
            return true;
        }

        for(int i=w_size;i<s2.length();i++)
        {
            freq1[s2.charAt(i)-'a']++;
            freq1[s2.charAt(i-w_size)-'a']--;
            if(Arrays.equals(freq,freq1)) 
            {
                return true;
            }
        }

        return false;
        
    }
}