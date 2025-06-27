class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int min=0;
        if(word1.length()>=word2.length())
        {
            min=word2.length();
        }
        else
        {
            min=word1.length();
        }

        for(int i=0;i<min;i++)
        {
            str+=word1.charAt(i);
            str+=word2.charAt(i);
        }
        
        if (word1.length() > word2.length()) {
            str += word1.substring(min);
        } else if (word2.length() > word1.length()) {
            str += word2.substring(min);
        }
        return str;

        }
        

        

        
    }
