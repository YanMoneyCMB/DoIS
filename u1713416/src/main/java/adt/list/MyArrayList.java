package adt.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A generic implementation of the IList interface.
 * 
 * <p>MODIFY THIS FILE. Based on MyArrayList.java from CS126 lab 1. See adt/Readme.md
 * 
 * @author Till Bretschneider
 *
 * @param <E> the type of elements in this list.
 */
public class MyArrayList<E> implements IList<E>, Iterable<E> {

  private Object[] array;
  private int size;
  private int capacity;


  /**
   * Create empty list with initial capacity.
   */
  public MyArrayList() {
    this.capacity = 100;
    this.array = new Object[capacity];
    this.size = 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#add(java.lang.Object)
   */
  @Override
  public boolean add(E element) {
    // COMPLETE.
    // Adds element to the list, returns true on success and false otherwise.
      if (size < capacity) {
        this.array[this.size] = element;
        this.size++;
          return true;
      }
      else{
            capacity *= 2;
          Object[] tempArray = new Object[capacity];
          for(int i=0; i < size ; i++) {
          tempArray[i] = array[i];
        }
        tempArray[size] = element;
        size++;
        array = tempArray;
          
      }
      return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#contains(java.lang.Object)
   */
  @Override
  public boolean contains(E element) {
    // COMPLETE.
    // Returns true when element is in the list, false otherwise.
       for(int i = 0; i < this.size; i++) {

          if (element.equals(this.array[i])) {
          return true;
        }

        }
      return false;
    
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#clear()
   */
  @Override
  public void clear() {
    this.capacity = 100;
    this.array = new Object[capacity];
    this.size = 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#isEmpty()
   */
  @Override
  public boolean isEmpty() {
    return this.size() == 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#size()
   */
  @Override
  public int size() {
    return size;
  }

  // This line allows us to cast our object to type (E) without any warnings.
  // For further details, please see:
  // http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/SuppressWarnings.html
  @Override
  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) this.array[index];
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#indexOf(java.lang.Object)
   */
  @Override
  public int indexOf(E element) {
    for (int i = 0; i < this.size(); i++) {
      if (element.equals(this.get(i))) {
        return i;
      }
    }
    return -1;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#remove(java.lang.Object)
   */
  @Override
  public boolean remove(E element) {
    int index = this.indexOf(element);
    if (index >= 0) {
      E removed = this.get(index);
      for (int i = index + 1; i < this.size(); i++) {
        this.set(i - 1, this.get(i));
      }
      this.array[size - 1] = null;
      size--;
      return true;
    }
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see adt.list.IList#set(int, java.lang.Object)
   */
  @Override
  public E set(int index, E element) {
    if (index >= this.size()) {
      throw new ArrayIndexOutOfBoundsException("index > size: " + index + " >= " + size);
    }
    E replaced = this.get(index);
    this.array[index] = element;
    return replaced;
  }

  /*
   * (non-Javadoc)
   * Example for use of for-each loop.
   * modified by Till Bretschneider
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    if (this.isEmpty())
      return "[]";

    String s = "[";

    for (E e : this)
      s += e.toString() + ", ";

    return s.substring(0, s.length() - 2) + "]";
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<E> iterator() {
    return new ArrayIterator();
  }
  private class ArrayIterator implements Iterator<E> {
    /** Index of the next element to report. */
    private int j = 0;                   // index of the next element to report
    private boolean removable = false;   // can remove be called at this time?

    /**
     * Tests whether the iterator has a next object.
     * @return true if there are further objects, false otherwise
     */
    public boolean hasNext() { return j < size; }   // size is field of outer instance

    /**
     * Returns the next object in the iterator.
     *
     * @return next object
     * @throws NoSuchElementException if there are no further elements
     */
    public E next() throws NoSuchElementException {
      if (j == size) throw new NoSuchElementException("No next element");
      removable = true;   // this element can subsequently be removed
      return MyArrayList.this.get(j++);   // post-increment j, so it is ready for future call                                 //to next
    }

    /**
     * Removes the element returned by most recent call to next.
     * @throws IllegalStateException if next has not yet been called
     * @throws IllegalStateException if remove was already called since recent next
     */
    public void remove() throws IllegalStateException {
      if (!removable) throw new IllegalStateException("nothing to remove");
      MyArrayList.this.remove(MyArrayList.this.get(j-1));  // that was the last one returned
      j--;                         // next element has shifted one cell to the left
      removable = false;           // do not allow remove again until next is called
    }
  }
}
