class Solution {
    public boolean isvowel(char ch)
    {
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int len=s.length();
        if(len==1) return 1;
        int max=0;
        int vowel=0;
        for(int i=0;i<k;i++)
        {
            if(isvowel(s.charAt(i)))
            {
                vowel++;
            }
        }
        max=vowel;
        

        for(int i=k;i<len;i++)
        {
            if(isvowel(s.charAt(i-k)))
            {
                vowel--;
            }
            if(isvowel(s.charAt(i)))
            {
                vowel++;
            }

            max=Math.max(max,vowel);

        }


        return max;
        
        
    }
}