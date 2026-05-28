class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int size=words.length;
        int [] pre=new int[size+1];
        int res[]=new int[queries.length];
        for(int i=0;i<size;i++)
        {
            char f_chr=words[i].charAt(0);
            char l_chr=words[i].charAt(words[i].length()-1);
            if(isvowel(f_chr) && isvowel(l_chr))
            {
                pre[i+1]=pre[i]+1;
            }
            else
            pre[i+1]=pre[i];

        }

        for(int i=0;i<queries.length;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            res[i]=pre[right+1]-pre[left];
        }

        return res;

        
    }

    public boolean isvowel(char ch)
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        return true;
    return false;
    }
}