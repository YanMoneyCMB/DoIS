package adt.map;

/**
 * A pair that maps key to value.
 * 
 * <p>DO NOT CHANGE. Identical to KeyValuePair.java from CS126 lab 4
 *
 * @param <K> type of key
 * @param <V> type of value
 */
public class KeyValuePair<K extends Comparable<K>, V> implements Comparable<KeyValuePair<K, V>> {

  protected K key;
  protected V value;

  /**
   * Create mapping between key and value.
   * 
   * @param k key
   * @param v value
   */
  public KeyValuePair(K k, V v) {
    key = k;
    value = v;
  }

  /**
   * Returns key from this pair.
   * 
   * @return key
   */
  public K getKey() {
    return key;
  }

  /**
   * Returns value from this pair.
   * 
   * @return value
   */
  public V getValue() {
    return value;
  }

  /*
   * (non-Javadoc)
   * 
   * Added Override annotation by PB
   * 
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(KeyValuePair<K, V> o) {
    return this.getKey().compareTo(o.getKey());
  }

}
