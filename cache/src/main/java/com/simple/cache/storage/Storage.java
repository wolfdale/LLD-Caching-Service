package com.simple.cache.storage;

public interface Storage<Key, Value> {
    void put(Key key, Value val);

    Value get(Key key);

    void remove(Key key);
}
