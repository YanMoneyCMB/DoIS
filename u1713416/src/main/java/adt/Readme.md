
# adt.binarytree

+ **`BinaryTree.java`**, based on `BinaryTree.java` from CS126 lab 5

CHANGED:

commented out a number of print statements

scope of `addToSubTree(BinaryTreeNode<E> n, E v)` changed to protected

added method `protected BinaryTreeNode<E> getRoot()`

completed `private void preOrder(BinaryTreeNode<E> n)`

completed `private void postOrder(BinaryTreeNode<E> n)`

+ **`BinaryTreeNode.java`**, identical to `BinaryTreeNode.java` from CS126 lab 5

no need to change

# adt.list

+ **`IList.java`**, identical to `IList.java` from CS126 lab 1

no need to change

+ **`IQueue.java`**, identical to `IQueue.java` from CS126 lab 3

no need to change

+ **`KeyValuePairLinkedList.java`**, identical to `KeyValuePairLinkedList.java` from CS126 lab 4

no need to change

+ **`ListElement.java`**, identical to `ListElement.java` from CS126 lab 4

no need to change

+ **`MyArrayList.java`**, based on `MyArrayList.java` from CS126 lab 1

CHANGED:

modified method `toString()` to illustrate use of for-each loop

included the method `public Iterator<E> iterator()`

**TODO:**

make 'class MyArrayList' iterable by implementing the nested class

`private class MyArrayListIterator implements Iterator<E>`

and completing `public Iterator<E> iterator()`

replace the following methods with the ones you have completed in the lab

`public boolean add(E element)`

`public boolean contains(E element)`

+ **`MyQueue.java`**, identical to `MyQueue.java` from CS126 lab 3

no need to change

# adt.map

+ **`HashMap.java`**, based on `HashMap.java` from CS126 lab 4

CHANGED:

commented out print statement in `public void add(K key, V value)`

modified `public V get(K key)` to catch if key is not present

+ **`IMap.java`**, identical to `IMap.java` from CS126 lab 4

no need to change

+ **`KeyValuePair.java`**, identical to `KeyValuePair.java` from CS126 lab 4

no need to change

# adt.set

+ **`ISet.java`** identical to `ISet.java` from CS126 Lab 1

no need to change

+ **`Set.java`** based on `Set.java` from CS126 Lab 1

**TODO:** replace the following methods with the ones you have completed in the lab

`public boolean add(E element)`

`public String toString()`



