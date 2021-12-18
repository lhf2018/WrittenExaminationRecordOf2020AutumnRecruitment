package test.datastruct;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private LinkedHashMap<Integer,Integer> cache;
    private final int CAPACITY=10;
    public LRU(int capacity){
        cache=new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>CAPACITY;
            }
        };
    }
    public int get(int key){
        return cache.getOrDefault(key,-1);
    }
    public void put(int key,int value){
        cache.put(key,value);
    }
}
