package LLDProjects.InMemoryCacheYT.cache.storage;

import LLDProjects.InMemoryCacheYT.cache.exceptions.NotFoundException;
import LLDProjects.InMemoryCacheYT.cache.exceptions.StorageFullEException;

import java.util.HashMap;
import java.util.Map;
//Hashmap based Storage
public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {
    Map<Key, Value> mp = new HashMap<>();

    @Override
    public void add(Key key, Value value) throws StorageFullEException {
        mp.put(key, value);
    }

    @Override
    public void remove(Key key) throws NotFoundException {
        mp.remove(key);
    }

    @Override
    public Value get(Key key) throws NotFoundException {
        return mp.get(key);
    }
}
