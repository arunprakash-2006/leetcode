class Solution {
    public List<String> letterCombinations(String digits) {
        String [] map={ "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        back(digits,map,0,new StringBuilder(),res);
        return res;
    }

    void back(String digits,String[] map,int ind,StringBuilder temp,List<String>res)
    {
        if(ind==digits.length())
        {
            res.add(temp.toString());
            return;
        }
        String word=map[(digits.charAt(ind)-'0')-1];
        for(char c: word.toCharArray())
        {
            temp.append(c);
            back(digits,map,ind+1,temp,res);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}