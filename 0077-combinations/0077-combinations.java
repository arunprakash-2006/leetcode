class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            a.add(i);
        }
        List<List<Integer>> a1=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        back(k,a,a1,0,temp);
        return a1;
    }
        void  back( int k,List<Integer> a, List<List<Integer>> a1,int ind,List<Integer> temp)
        {
            if(temp.size()==k)
            {
               a1.add(new ArrayList(temp));
               return;
            }

            if(ind==a.size()) return;
                temp.add(a.get(ind));
                back(k,a,a1,ind+1,temp);
                temp.remove(temp.size()-1);
                back(k,a,a1,ind+1,temp);
        }

        
    }
