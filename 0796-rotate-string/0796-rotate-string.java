class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
       return  can(s,goal,0);
    }
    public boolean can(String s,String goal, int c)
    {
        if(c==s.length()) return false;
        if(s.equals(goal)) return true;
        String str=s.substring(1)+s.charAt(0);
       return  can(str,goal,c+1);
    }
        
    }
