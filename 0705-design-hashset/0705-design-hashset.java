class MyHashSet {
    HashSet<Integer> s1;

    public MyHashSet() {
        s1=new HashSet<Integer>();
    }
    
    public void add(int key) {
        s1.add(key);
        
    }
    
    public void remove(int key) {
        s1.remove(key);
        
    }
    
    public boolean contains(int key) {
        if(s1.contains(key))
        return true;
        else
        return false;

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */