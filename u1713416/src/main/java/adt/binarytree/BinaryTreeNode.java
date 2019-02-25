package adt.binarytree;

/**
 * Node of Binary Tree.
 * 
 * <p>DO NOT CHANGE. Identical to BinaryTreeNode.java from CS126 lab5
 *
 * @param <E> the type of elements in this node
 */
public class BinaryTreeNode<E extends Comparable<E>> {

  private E value;
  private BinaryTreeNode<E> left;
  private BinaryTreeNode<E> right;

  /**
   * Create node of the tree from specified value.
   * 
   * @param val value to be assigned to this node.
   */
  public BinaryTreeNode(E val) {
    value = val;
    left = null;
    right = null;
  }

  /**
   * Return value of this node.
   * 
   * @return value of this node
   */
  public E getValue() {
    return value;
  }

  /**
   * Return left branch of this node.
   * 
   * @return left branch of this node
   */
  public BinaryTreeNode<E> getLeft() {
    return left;
  }

  /**
   * Return right branch of this node.
   * 
   * @return right branch of this node
   */
  public BinaryTreeNode<E> getRight() {
    return right;
  }

  /**
   * Set value of this node.
   * 
   * @param v value to be set.
   */
  public void setValue(E v) {
    value = v;
  }

  /**
   * Set left branch of this node.
   * 
   * @param p node to be set.
   */
  public void setLeft(BinaryTreeNode<E> p) {
    left = p;
  }

  /**
   * Set right branch of this node.
   * 
   * @param p node to be set.
   */
  public void setRight(BinaryTreeNode<E> p) {
    right = p;
  }

}
