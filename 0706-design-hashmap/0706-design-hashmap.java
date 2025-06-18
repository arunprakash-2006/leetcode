import java.util.*;
import java.util.Map.Entry;
class MyHashMap {
    HashMap<Integer,Integer> s1;


    public MyHashMap() {
        s1=new HashMap<Integer,Integer>();
    }
    
    public void put(int key, int value) {
        s1.put(key,value);
        
    }
    
    public int get(int key) {
         return s1.getOrDefault(key, -1);
        
    }

    
    public void remove(int key) {
        s1.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */