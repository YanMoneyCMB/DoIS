package adt.set;

/**
 * An interface for a generic set.
 * 
 * <p>DO NOT CHANGE. Identical to ISet.java from CS126 lab1
 * 
 * @param <E> type of elements in this set.
 */
public interface ISet<E> {

  /**
   * Adds element to the list when it does not already exist.
   * 
   * @param element element to be added.
   * @return true on success and false otherwise.
   */
  public boolean add(E element);

  /**
   * Clears (empties) the list.
   */
  public void clear();

  /**
   * Returns true when element is in the list, false otherwise.
   * 
   * @param element element to be checked.
   * @return true when element is in the list, false otherwise.
   */
  public boolean contains(E element);

  /**
   * Returns true when the list contains no elements.
   * 
   * @return true when the list contains no elements.
   */
  public boolean isEmpty();

  /**
   * Removes an element form the list.
   * 
   * @param element elelent to be removed.
   * @return true on success, false if the element was not found.
   */
  public boolean remove(E element);

  /**
   * Returns the number of elements stored in the list.
   * 
   * @return the number of elements stored in the list.
   */
  public int size();

}
