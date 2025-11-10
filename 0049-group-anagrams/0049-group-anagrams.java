import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int p[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Map<BigInteger,List<String>> m1=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String s:strs)
        {
            BigInteger pro=BigInteger.ONE;
            for(int i=0;i<s.length();i++)
            {
                pro=pro.multiply(BigInteger.valueOf(p[s.charAt(i)-'a']));
            }
            if(m1.containsKey(pro))
            {
                m1.get(pro).add(s);
            }
            else
            {
                m1.put(pro,new ArrayList<String>());
                m1.get(pro).add(s);
            }
        }

        for(List<String> v:m1.values())
        {
            ans.add(v);
        }

        return ans;
    }
}