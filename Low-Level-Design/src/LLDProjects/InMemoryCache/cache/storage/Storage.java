package LLDProjects.InMemoryCache.cache.storage;

import LLDProjects.InMemoryCache.cache.exceptions.NotFoundException;
import LLDProjects.InMemoryCache.cache.exceptions.StorageFullEException;

//It is just a interface which is providing some functions to our Storage
public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullEException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
//We can override these functions in any data structure in which
//We want to store our data