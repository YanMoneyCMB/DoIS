package adt.set;

import adt.list.MyArrayList;

/**
 * A generic implementation of the ISet interface.
 * 
 * <p>Based on Set.java from CS126 lab1. Replace the following method with the ones you have
 * completed in the lab: {@link #add(Object)}
 * 
 * @param <E> type of elements in this set.
 */
public class Set<E> implements ISet<E> {

  private MyArrayList<E> array = new MyArrayList<>();

  /*
   * (non-Javadoc)
   * 
   * @see adt.set.ISet#add(java.lang.Object)
   */
  public boolean add(E element) {
   
        if(array.contains(element) == false) {
          array.add(element);
          return true;
        }

        return false;
  }

  /*
   * (non-Javadoc)
   * DO NOT MODIFY THIS METHOD
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    // Returns a string representation of this Set object.
    return array.toString();
  }

  @Override
  public void clear() {
    array.clear();
  }

  @Override
  public boolean contains(E element) {
    return array.contains(element);
  }

  @Override
  public boolean isEmpty() {
    return array.isEmpty();
  }

  @Override
  public boolean remove(E element) {
    return array.remove(element);
  }

  @Override
  public int size() {
    return array.size();
  }

  /**
   * Return this set as array.
   * 
   * <p>Added by PB. This method is intended to be used in test suite. Do not change.
   * 
   * @return list of set elements.
   */
  public MyArrayList<E> toList() {
    return array;
  }

}
