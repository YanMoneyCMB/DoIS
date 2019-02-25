package patient;

import adt.binarytree.BinaryTree;
import adt.binarytree.BinaryTreeNode;
import adt.map.KeyValuePair;

/**
 * Implementation requirement: Each found patient must be added to {@link #foundRecords} list.
 * 
 * @author by Till Bretschneider
 */
public class BinaryPatientTree extends BinaryTree<KeyValuePair<String, Patient>> {

    /**
   * Store found patients here.
   */
  private PatientArrayList foundRecords = new PatientArrayList();

  /**
   * Find patients whose names start with specified string.
   * 
   * @param s pattern to search for
   * @return true if found at least one name, false otherwise
   */
  public boolean findPatientsWhoseNamesStartWith(String s) {

    // find first node whose first characters match s
    BinaryTreeNode<KeyValuePair<String, Patient>> n = firstNodeStartingWith(getRoot(), s);
    if (n == null) {
      System.out.println("Names starting with \"" + s + "\" not found");
      return false;
    } else {
      outputPatientsWhoseNamesStartWith(n, s);
      return true;
    }
  }

  /*
   * INCOMPLETE
   */
  
  private BinaryTreeNode<KeyValuePair<String, Patient>> firstNodeStartingWith(
          BinaryTreeNode<KeyValuePair<String, Patient>> root, String s) {

 /*   // Possible strategy:
      MyQueue<BinaryTreeNode<KeyValuePair<String, Patient>>> queue = new MyQueue<>();
        BinaryTreeNode<KeyValuePair<String, Patient>> temp = super.getRoot();
      queue.enqueue(root);
      while(temp != null){
      if(temp.getLeft().getValue().getLastName().contains.(s)){
          queue.enqueue(temp.getLeft()); 
          return temp.getLeft();
        }
      if (temp.getRight().getValue().getLastName().contains.(s)){
        return temp.getRight()  
        }
          temp = temp.getLeft();
 }
      temp = root;
      while(temp != null){
          if(temp.getLeft().getValue().getLastName().contains.(s)){
            return temp.getLeft();
        }
      if (temp.getRight().getValue().getLastName().contains.(s)){
        return temp.getRight()  
        }
          temp = temp.getRight();
    }
      throw new NullPointerException("No patients found");
} */
      
      
    // Enqueue the root node
    // Dequeue nodes as long as the queue is not empty
    // Enqueue left or right children depending on how the lastname compares to s

    throw new RuntimeException("not yet implemented");

  }

  /**
   * INCOMPLETE
   * 
   * <p>Please add each found patient record to {@link #foundRecords}, which is required for
   * automated testing. If you want, you can also print out those records to the console for
   * debugging.
   * 
   * @param n
   * @param s
   */
  protected void outputPatientsWhoseNamesStartWith(BinaryTreeNode<KeyValuePair<String, Patient>> n, String s) {

    // traverse the tree in a recursive manner

    throw new RuntimeException("not yet implemented");

  }

  /**
   * Return records of patients found by {@link #findPatientsWhoseNamesStartWith(String)}
   * 
   * <p>DO NOT MODIFY.
   * 
   * @return the foundRecords
   */
  public PatientArrayList getFoundRecords() {
    return foundRecords;
  }

}