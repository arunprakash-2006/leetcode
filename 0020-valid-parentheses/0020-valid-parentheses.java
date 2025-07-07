class Solution {
    public boolean isValid(String s) {

        Stack<Character> a1=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='{'|| c=='['|| c=='(')
            {
                a1.push(c);
            }
            else
            {
                if(a1.isEmpty()) return false;
                char top=a1.pop();
                if(c=='}' && top!='{' || c==')' && top!='(' || c==']' && top!='[')
                {
                    return false;
                }
            }
        }

        return a1.isEmpty();
        
    }


}