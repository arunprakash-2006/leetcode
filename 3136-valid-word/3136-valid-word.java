class Solution {
    public boolean isValid(String word) {
         boolean vow=false;
            boolean con=false;
        if(word.length()<3) return false;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(!Character.isLetterOrDigit(c))
            {
                return false;
            }
           

            if(Character.isLetter(c))
            {
                char low=Character.toLowerCase(c);
                if("aeiou".indexOf(low)!=-1)
                {
                    vow=true;
                }
                else
                {
                    con=true;
                }
            }
           
        }
        

             return vow&&con;

        
    }
}