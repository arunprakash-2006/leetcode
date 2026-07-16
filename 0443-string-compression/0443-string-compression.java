class Solution {
    public int compress(char[] chars) {
        int left=0,right=0,length=chars.length;
        int count=0;
        int res_len=0;
        while(right<length)
        {
           char cur=chars[left];
           count=0;
           while(right<length && chars[right]==cur)
           {
            count++;
            right++;
           }
           chars[res_len++]=cur;
           if(count>1)
           {
            String s=String.valueOf(count);
            for(char ch:s.toCharArray())
            {
                chars[res_len++]=ch;
            }
           }
           left=right;

        }

        return res_len;
    }
}