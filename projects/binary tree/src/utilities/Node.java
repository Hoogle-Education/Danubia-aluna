package utilities;

public class Node<T> {

  public T element;
  public Node<T> right;
  public Node<T> left;

  public Node() {
  }

  public Node(T element) {
    this.element = element;
  }

  public Node(T element, Node<T> right, Node<T> left) {
    this.element = element;
    this.right = right;
    this.left = left;
  }

}
