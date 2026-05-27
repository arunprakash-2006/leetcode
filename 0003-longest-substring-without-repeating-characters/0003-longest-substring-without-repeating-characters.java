class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max_len=0;
        Set<Character> s1=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            while(s1.contains(s.charAt(i)))
            {
                s1.remove(s.charAt(left));
                left++;
            }

            s1.add(s.charAt(i));
            max_len=Math.max(max_len,i-left+1);
        }

        return max_len;

    }
}