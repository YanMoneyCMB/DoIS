package adt.list;

/**
 * An interface for a generic queue.
 * 
 * <p>DO NOT CHANGE. Identical to IQueue.java from CS126 lab3.
 * 
 * @param <E> the type of elements in this queue
 */
public interface IQueue<E> {

  /**
   * Add an element to the (end of) queue.
   * 
   * @param element Element to be added.
   */
  public void enqueue(E element);

  /**
   * Remove and return element from the (start of) queue.
   * 
   * @return element from the (start of) queue.
   */
  public E dequeue();

  /**
   * Returns true when the queue has no elements, false otherwise.
   * 
   * @return true when the queue has no elements, false otherwise.
   */
  public boolean isEmpty();

}
