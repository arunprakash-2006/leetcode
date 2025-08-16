class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int maxr=-1;
        for(int i=len-1;i>=0;i--)
        {
            int cur=arr[i];
            arr[i]=maxr;
            maxr=Math.max(cur,maxr);
        }
        return arr;


    }
}