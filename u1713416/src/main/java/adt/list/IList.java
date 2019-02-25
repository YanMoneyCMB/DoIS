package adt.list;

/**
 * An interface for a generic list.
 * 
 * <p>DO NOT CHANGE. Identical to IList.java from CS126 lab1
 * 
 * @param <E> the type of elements in this list
 */
public interface IList<E> {

  /**
   * Adds element to the list.
   * 
   * @param element element to be added to list.
   * @return true on success and false otherwise.
   */
  public boolean add(E element);

  /**
   * Clears (empties) the list.
   */
  public void clear();

  /**
   * Returns true if this list contains the specified element.
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
   * @param element element to be removed from list.
   * @return true on success, false if the element was not found.
   */
  public boolean remove(E element);

  /**
   * Returns the number of elements in this list.
   * 
   * @return the number of elements stored in the list.
   */
  public int size();

  /**
   * Returns the element at the specified position in this list.
   * 
   * @param index position of the element to be returned.
   * @return the element stored at position index.
   */
  public E get(int index);

  /**
   * Returns the index of the specified element in this list.
   * 
   * @param element
   * @return the index of element in the list, returns -1 if element was not found.
   */
  public int indexOf(E element);

  /**
   * Sets position index of the list to element.
   * 
   * @param index
   * @param element
   * @return this element
   */
  public E set(int index, E element);

}
