package com.simple.cache.evictionpolicies;

public interface EvictionPolicy<Key> {
    void keyAccessed(Key key);

    Key evict(Key key);
}
