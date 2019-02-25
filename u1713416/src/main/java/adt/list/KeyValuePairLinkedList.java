package adt.list;

import adt.map.KeyValuePair;

/**
 * Implementation of Linked List.
 * 
 * <p>DO NOT CHANGE. Identical to KeyValuePairLinkedList.java from CS126 lab4.
 * 
 * @param <K> the type of keys in this list
 * @param <V> the type of elements in this list
 */
public class KeyValuePairLinkedList<K extends Comparable<K>, V> {

  protected ListElement<KeyValuePair<K, V>> head;
  protected int size;

  /**
   * Create empty list.
   */
  public KeyValuePairLinkedList() {
    head = null;
    size = 0;
  }

  /**
   * Append specified value to the list under specified key.
   * 
   * @param key
   * @param value
   * @see #add(KeyValuePair)
   */
  public void add(K key, V value) {
    this.add(new KeyValuePair<K, V>(key, value));
  }

  /**
   * Append element to the list.
   * 
   * @param kvp element to be added.
   */
  public void add(KeyValuePair<K, V> kvp) {
    ListElement<KeyValuePair<K, V>> new_element = new ListElement<>(kvp);
    new_element.setNext(head);
    head = new_element;
    size++;
  }

  /**
   * Return size of the list.
   * 
   * @return size of the list.
   */
  public int size() {
    return size;
  }

  /**
   * Return head element of the list.
   * 
   * @return head element of the list
   */
  public ListElement<KeyValuePair<K, V>> getHead() {
    return head;
  }

  /**
   * Returns the value to which the specified key is mapped.
   * 
   * @param key the key whose associated value is to be returned
   * @return the value to which the specified key is mapped
   */
  public KeyValuePair<K, V> get(K key) {
    ListElement<KeyValuePair<K, V>> temp = head;

    while (temp != null) {
      if (temp.getValue().getKey().equals(key)) {
        return temp.getValue();
      }

      temp = temp.getNext();
    }

    return null;
  }
}
