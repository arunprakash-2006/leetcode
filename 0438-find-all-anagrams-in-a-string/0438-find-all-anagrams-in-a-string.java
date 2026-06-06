class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int freq[]=new int[26];
        int freq1[]=new int[26];
        int leng=s.length();
        for(char c:p.toCharArray())
        {
            freq[c-'a']++;
        }
        int k=p.length();
        for(int i=0;i<k;i++)
        {
            freq1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq1))
        {
            list.add(0);
        }

        for(int i=k;i<s.length();i++)
        {
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freq1,freq))
            {
                list.add(i-k+1);
            }
        }

        return list;


    }
}