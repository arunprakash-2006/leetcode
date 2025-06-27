class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> m1=new HashMap<>();
        int flag=0;
        for(int i:nums)
        {
            if(m1.containsKey(i))
            {
                m1.put(i,m1.get(i)+1);
            }
            else
            {
            m1.put(i,1);
            }
        }

            for(Map.Entry<Integer,Integer> entry:m1.entrySet())
            {
                if(prime(entry.getValue()))
                {
                    flag=1;
                    break;
                }
                else
                {
                    flag=0;
                }
            }
            if(flag==1)
            {
                return true;
            }
            else
            {
                return false;
            }

    }
        public boolean prime(Integer num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}

    
