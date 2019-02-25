package adt.list;

/**
 * Implementation of queue.
 * 
 * <p>DO NOT CHANGE. Identical to MyQueue.java from CS126 lab3
 * 
 * @param <E> the type of elements in this queue.
 */
public class MyQueue<E> implements IQueue<E> {

  private ListElement<E> head;
  private ListElement<E> tail;

  /**
   * Create empty queue.
   */
  public MyQueue() {
    head = null;
    tail = null;
  }

  /*
   * (non-Javadoc)
   * 
   * Added Override annotation by PB
   * 
   * @see adt.list.IQueue#isEmpty()
   */
  @Override
  public boolean isEmpty() {
    return (head == null);
  }

  /*
   * (non-Javadoc)
   * 
   * Added Override annotation by PB
   * 
   * @see adt.list.IQueue#dequeue()
   */
  @Override
  public E dequeue() {
    if (isEmpty()) {
      return null;
    }

    ListElement<E> tmp = head;
    head = tmp.getNext();

    if (head == null) {
      tail = null;
    }

    return tmp.getValue();
  }

  /*
   * (non-Javadoc)
   * 
   * Added Override annotation by PB
   * 
   * @see adt.list.IQueue#enqueue(java.lang.Object)
   */
  @Override
  public void enqueue(E value) {
    ListElement<E> tmp = new ListElement<>(value);

    if (isEmpty()) {
      tail = head = tmp;
    } else {
      tail.setNext(tmp);
      tail = tmp;
    }
  }
}
