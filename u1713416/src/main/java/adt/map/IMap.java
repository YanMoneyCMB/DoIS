package adt.map;

/**
 * An interface for a generic map, from keys of type K to values of type V.
 * 
 * <p>DO NOT CHANGE. Identical to IMap.java from CS126 lab4
 * 
 * @param <K> type of keys
 * @param <V> type of values
 */
public interface IMap<K, V> {

  /**
   * Adds a mapping from key to value to the map
   * 
   * @param key
   * @param value
   */
  public void add(K key, V value);

  /**
   * Finds the respective value that is mapped to from key
   * 
   * @param key
   * @return the value to which the specified key is mapped
   */
  public V get(K key);

}
