class Solution {
    public int countPrimes(int n) {
        boolean[]  arr =new boolean[n+1];
        if(n<=2)
        return 0;
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(arr[i])
            {
            for(int j=i*i;j<=n;j+=i)
            {
                arr[j]=false;
            }
            }
        }
        for(int i=2;i<n;i++)
        {
        if(arr[i])
        {
            count+=1;
        }
        }
        return count;


        
    }
}