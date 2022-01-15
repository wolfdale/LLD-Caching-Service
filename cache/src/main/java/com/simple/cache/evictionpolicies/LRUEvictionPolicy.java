package com.simple.cache.evictionpolicies;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {
    @Override
    public void keyAccessed(Key key) {

    }

    @Override
    public Key evict(Key key) {
        return null;
    }
}
