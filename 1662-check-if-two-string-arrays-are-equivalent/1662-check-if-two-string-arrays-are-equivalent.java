class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str="";
        String str1="";
        for(String x:word1){
            str+=x;
        }
        for(String x:word2)
        {
            str1+=x;
        }

        return str.equals(str1);
        
        
    }
}