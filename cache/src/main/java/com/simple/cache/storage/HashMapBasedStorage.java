package com.simple.cache.storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {
    private Map<Key, Value> map;
    private int capacity;

    public HashMapBasedStorage(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    @Override
    public void put(Key key, Value val) {
        if (!isCacheFull()) {
            map.put(key, val);
        }
    }

    @Override
    public Value get(Key key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    @Override
    public void remove(Key key) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

    private boolean isCacheFull() {
        return map.size() == this.capacity;
    }
}
