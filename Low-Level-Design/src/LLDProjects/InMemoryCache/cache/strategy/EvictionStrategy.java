package LLDProjects.InMemoryCache.cache.strategy;

//Interface for defining eviction strategies
public interface EvictionStrategy<Key> {
    //This method tells that this "key" is accessed just now
    //So that it can do something to update the state of key:
    //Like to increase its count
    //to put it in front or back etc.
    //And this data will help in evicting the right data
    void keyAccessed(Key key);

    //This method will remove one key from the database
    Key evictKey();
}
//We can have many implementations of it:
//-LRU(Least Recently Used)
//-Time based eviction strategy