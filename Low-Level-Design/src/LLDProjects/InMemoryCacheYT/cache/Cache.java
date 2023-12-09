package LLDProjects.InMemoryCacheYT.cache;

import LLDProjects.InMemoryCacheYT.cache.exceptions.NotFoundException;
import LLDProjects.InMemoryCacheYT.cache.exceptions.StorageFullEException;
import LLDProjects.InMemoryCacheYT.cache.storage.Storage;
import LLDProjects.InMemoryCacheYT.cache.strategy.EvictionStrategy;

//https://www.youtube.com/watch?v=B7iCXl_KSoM - Source of this code
public class Cache<Key, Value> {
    //It has 2 properties: EvictionStrategy and Storage
    //Eviction Strategy will remove the key if cache is full
    //Using "final" to make it immutable-helps in debugging and will not get changed anywhere else
    private final EvictionStrategy<Key> evictionStrategy;
    //Storage will provide use storage for data
    private final Storage<Key, Value> storage;

    public Cache(EvictionStrategy<Key> evictionStrategy, Storage<Key, Value> storage) {
        this.evictionStrategy = evictionStrategy;
        this.storage = storage;
    }

    public void put(Key key, Value value) {
        try {
            //Storing value as per the key
            this.storage.add(key, value);
            //Marking key as accessed
            this.evictionStrategy.keyAccessed(key);
        } catch (StorageFullEException exception) {
            System.out.println("Got Storage full! Will try to evict!");
            Key keyToRemove = evictionStrategy.evictKey();
            if (keyToRemove == null) {
                throw new RuntimeException("Unexpected State! Storage full and no key to evict!");
            }
            //Removing old data from Storage
            this.storage.remove(keyToRemove);
            //After removing one data from Storage we have space to add new data
            put(key, value);
        }
    }

    public Value get(Key key) {
        try {
            Value value = this.storage.get(key);
            //Marking key as accessed
            this.evictionStrategy.keyAccessed(key);
            return value;
        } catch (NotFoundException notFoundException) {
            System.out.println("Tried to access non-existing key!");
            return null;
        }
    }
}
