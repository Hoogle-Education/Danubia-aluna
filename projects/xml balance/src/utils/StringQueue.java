package utils;

class Node {
  
  String text;
  Node next;

  public Node(String text){
    this.text = text;
    next = null;
  }

}

public class StringQueue {

  Node first, last;

  public void enqueue(String character){
    
    if(first == null) {
      first = new Node(character);
      last = first;
      return;
    }

    last.next = new Node(character);
    last = last.next;
  }

  // removendo elemento da fila
  public void dequeue() {

    if(first == null){
      return;
    }

    first = first.next;
  }

  // removendo elemento da fila
  public void dequeueLast() {

    if(first == null){
      return;
    }

    if(first == last){
      first = null;
      last = first;
      return;
    }

    Node current = first;
    while(current.next != last){
      current = current.next;
    }

    last = current;
    last.next = null;
  }

  // pegar o primeiro da fila
  public String peek() {

    if(first == null) {
      return null;
    }

    return first.text;
  }

  // pegar o ultimo da fila
  public String peekLast() {

    if(last == null) {
      return null;
    }

    return last.text;
  }

  public boolean isEmpty() {
    
    if(first == null) 
      return true;

    return false;
  }

  @Override
  public String toString() {
    Node current = first;
    String aux = "<Queue>\n";

    while(current != null) {
      aux += current.text + "\n";
      current = current.next;
    }

    return aux;
  }


}
