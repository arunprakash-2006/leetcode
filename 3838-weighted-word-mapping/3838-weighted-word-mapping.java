class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(String s:words)
        {
            sum=0;
            for(char c:s.toCharArray())
            {
                sum+=weights[c-'a'];
            }
            int rem=sum%26;
            char c=(char)('z'-rem);
            sb.append(c);
        }
        return sb.toString();
        
    }
}