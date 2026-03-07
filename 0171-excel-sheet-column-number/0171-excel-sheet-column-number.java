class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Integer,Integer> m1=new HashMap<>();
        int pos=1;
        int res=0;
        for(int i=65;i<=90;i++)
        {
            m1.put(i,pos);
            pos++;
        }
        int len=columnTitle.length();

        for(int i=0;i<len;i++)
        {
            int ch=columnTitle.charAt(i);
            res=res*26+m1.get(ch);

        }
        return res;
    }
}