package adt.list;

/**
 * An interface for generic bidirectional linked list.
 *
 * <p>DO NOT CHANGE. Identical to ListElement.java from CS126 lab4
 * 
 * @param <E> the type of element.
 */
public class ListElement<E> {
  private final E value;
  private ListElement<E> next;
  private ListElement<E> prev;

  /**
   * Assign specified value to this element.
   * 
   * @param value value to be assigned.
   */
  public ListElement(E value) {
    this.value = value;
  }

  /**
   * Return value assigned to this element.
   * 
   * @return value assigned to this element.
   */
  public E getValue() {
    return this.value;
  }

  /**
   * Return next element of the list.
   * 
   * @return next element of the list
   */
  public ListElement<E> getNext() {
    return this.next;
  }

  /**
   * Return previous element of the list.
   * 
   * @return previous element of the list
   */
  public ListElement<E> getPrev() {
    return this.prev;
  }

  /**
   * Set next element on the list.
   * 
   * @param e next element
   */
  public void setNext(ListElement<E> e) {
    this.next = e;
  }

  /**
   * Set previous element on the list.
   * 
   * @param e previous element
   */
  public void setPrev(ListElement<E> e) {
    this.prev = e;
  }

}
