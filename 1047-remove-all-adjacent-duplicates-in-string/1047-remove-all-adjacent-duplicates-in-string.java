class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a1=new Stack<>();
        String str="";
        for(char c:s.toCharArray())
        {
            if( !a1.isEmpty() &&  a1.peek()==c)
            {
                a1.pop();
            }
            else
            {
                a1.push(c);
            }
        }

        for(char ch: a1)
        {
            str+=ch;
        }

        return str;
        
    }
}