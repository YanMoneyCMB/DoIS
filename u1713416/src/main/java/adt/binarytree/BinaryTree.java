package adt.binarytree;

/**
 * Implementation of BinaryTree.
 *
 * <p>DO NOT CHANGE. Based on BinaryTree.java from CS126 lab5.
 * 
 * @param <E> type of element of this tree.
 */
public class BinaryTree<E extends Comparable<E>> {
  private BinaryTreeNode<E> root;

  /**
   * Create empty tree.
   */
  public BinaryTree() {
    setRoot(null);
  }

  /*
   * Scope changed to protected by PB.
   */
  protected void addToSubTree(BinaryTreeNode<E> n, E v) {
    if (n != null) // sanity check!
    {
      E nValue = n.getValue();
      if (v.compareTo(nValue) <= 0) {
        // commented out by Till Bretschneider
        // System.out.println("Adding " + v + " to left sub-tree of " + nValue);
        if (n.getLeft() == null)
          n.setLeft(new BinaryTreeNode<>(v));
        else
          addToSubTree(n.getLeft(), v);
      } else {
        // commented out by Till Bretschneider
        // System.out.println("Adding " + v + " to right sub-tree of " + nValue);
        if (n.getRight() == null)
          n.setRight(new BinaryTreeNode<>(v));
        else
          addToSubTree(n.getRight(), v);
      }
    }
  }

  /**
   * Add element to tree.
   * 
   * @param v element to be added
   */
  public void add(E v) {
    if (root == null) {
      // commented out by Till Bretschneider
      // System.out.println("Adding " + v + " to root.");
      setRoot(new BinaryTreeNode<>(v));
    } else
      addToSubTree(root, v);
  }

  // added by Till Bretschneider
  protected BinaryTreeNode<E> getRoot() {
    return root;
  }

  private void inOrder(BinaryTreeNode<E> n) {
    if (n != null) {
      inOrder(n.getLeft());
      System.out.print(n.getValue() + " \n");
      inOrder(n.getRight());
    }

  }

  // COMPLETED by Till Bretschneider
  private void preOrder(BinaryTreeNode<E> n) {
    if (n != null) {
      System.out.print(n.getValue() + "\n");
      preOrder(n.getLeft());
      preOrder(n.getRight());
    }
  }

  // COMPLETED by Till Bretschneider
  private void postOrder(BinaryTreeNode<E> n) {
    if (n != null) {
      postOrder(n.getLeft());
      postOrder(n.getRight());
      System.out.print(n.getValue() + "\n");
    }
  }

  public void traversal() {
    System.out.print("Inorder traversal: ");

    inOrder(root);

    System.out.println();
  }

  /**
   * Set new root.
   * 
   * @param root node to be root
   */
  public void setRoot(BinaryTreeNode<E> root) {
    this.root = root;
  }
}
