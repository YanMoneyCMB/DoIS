package adt.map;

import adt.list.KeyValuePairLinkedList;

/**
 * Implementation of HashMap.
 * 
 * <p>based on HashMap.java from CS126 lab4
 * 
 * @param <K> type of keys
 * @param <V> type of values
 */
public class HashMap<K extends Comparable<K>, V> implements IMap<K, V> {

  protected KeyValuePairLinkedList<K, V>[] table;

  /**
   * Create empty HashMap with predefined size.
   */
  public HashMap() {
    /* for very simple hashing, primes reduce collisions */
    this(11);
  }

  /**
   * Create empty HashMap of specified initial size.
   * 
   * @param size initial size
   */
  @SuppressWarnings("unchecked")
  public HashMap(int size) {
    table = new KeyValuePairLinkedList[size];
    initTable();
  }

  protected void initTable() {
    for (int i = 0; i < table.length; i++) {
      table[i] = new KeyValuePairLinkedList<>();
    }
  }

  protected int hash(K key) {
    int code = Math.abs(key.hashCode());
    return code;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.map.IMap#add(java.lang.Object, java.lang.Object)
   */
  @Override
  public void add(K key, V value) {
    int hash_code = hash(key);
    int location = hash_code % table.length;

    // commented out by Till Bretschneider
    // System.out.println("Adding " + value + " under key " + key + " at location "
    // + location);

    table[location].add(key, value);
  }
    

  /*
   * (non-Javadoc)
   * 
   * modified by Till Bretschneider to catch if a key does not exist
   * 
   * @see adt.map.IMap#get(java.lang.Object)
   */
  @Override
  public V get(K key) {
    int hash_code = hash(key);
    int location = hash_code % table.length;

    KeyValuePair<K, V> kvp = table[location].get(key);

    // was: return (V)table[location].get(key).getValue();
    // changed to
    if (kvp == null)
      return null;

    return kvp.getValue();
  }

}
