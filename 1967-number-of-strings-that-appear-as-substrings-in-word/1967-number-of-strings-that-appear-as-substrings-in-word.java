class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int co=0;
        for(String s:patterns)
        {
            if(word.contains(s))
            {
                co++;
            }
        }

        return co;
        
    }
}