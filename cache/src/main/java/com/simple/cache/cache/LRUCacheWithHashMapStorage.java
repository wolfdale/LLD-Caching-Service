package com.simple.cache.cache;

import com.simple.cache.evictionpolicies.EvictionPolicy;
import com.simple.cache.storage.Storage;

public class LRUCacheWithHashMapStorage {
    private Storage storage;
    private EvictionPolicy evictionPolicy;

    public LRUCacheWithHashMapStorage(Storage storage, EvictionPolicy evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }


}
