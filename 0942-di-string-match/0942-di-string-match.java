class Solution {
    public int[] diStringMatch(String s) {
        int len=s.length();
        int ans[]=new int[len+1];
        int low=0;
        int high=len;
       
            for(int i=0;i<len;i++)
            {
                if(s.charAt(i)=='I')
                {
                    ans[i]=low++;
                    System.out.println(low);
                }
                else
                {
                    ans[i]=high--;
                }
            }
        

        ans[len]=low;
        return ans;

        
    }
}