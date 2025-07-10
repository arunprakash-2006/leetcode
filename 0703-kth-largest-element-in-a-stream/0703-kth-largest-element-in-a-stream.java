class KthLargest {
    int k;
    PriorityQueue<Integer> q1;

    public KthLargest(int k, int[] nums) {
        q1=new PriorityQueue<>();
        this.k=k;
        for(int i:nums)
        {
            add(i);
        }
        
    }
    
    public int add(int val) {
        q1.offer(val);
        if(q1.size()>k)
        {
            q1.poll();
        }
        return q1.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */