package utilities;

import exceptions.TreeNotCreatedException;

public class BinaryTree<T extends Comparable<T>> 
implements BinarySearch<T> {

  private Node<T> root;

  // --------------------------------------
  // interface methods

  @Override
  public boolean isEmpty() {
    return (root == null) ? true : false;
  }

  @Override
  public void add(T element) {
    if(root == null) 
      root = new Node<>(element);
    else
      add(element, root);
  }

  @Override
  public int count() {
    return count(root);
  }

  @Override
  public T highest() throws TreeNotCreatedException {

    if(isEmpty())
      throw new TreeNotCreatedException();

    return highest(root, root.element);
  }

  @Override
  public T lowest() throws TreeNotCreatedException {

    if(isEmpty())
      throw new TreeNotCreatedException();

    return lowest(root, root.element);
  }    

  // --------------------------------------
  // private methods
  
  private void add(T element, Node<T> node) {
    if(node.element.compareTo(element) > 0) {
      if(node.left == null) 
        node.left = new Node<>(element);
      else
        add(element, node.left);
    } else {
      if(node.right == null) 
        node.right = new Node<>(element);
      else
        add(element, node.right);
    }
  }

  private int count(Node<T> node) {
    if(node == null)
      return 0;
    else
      return 1 + count(node.left) + count(node.right);
  }

  private T highest(Node<T> node, T highestT) {

    highestT = (node.element.compareTo(highestT) > 0) ? 
                node.element : highestT;

    if (node.right == null && node.left == null)
      return highestT;
      
    if(node.right != null)
      return highest(node.right, highestT);
    else 
      return highest(node.left, highestT);
  }

  private T lowest(Node<T> node, T lowestT) {
    
    lowestT = (node.element.compareTo(lowestT) < 0) ? 
                node.element : lowestT;

    if (node.right == null && node.left == null)
      return lowestT;
    
    if(node.left != null)
      return lowest(node.left, lowestT);
    else 
      return lowest(node.right, lowestT);
  }

}
