package utilities;

import exceptions.TreeNotCreatedException;

public interface BinarySearch<T> {
  boolean isEmpty();
  void add(T element);
  int count();
  T highest() throws TreeNotCreatedException ;
  T lowest() throws TreeNotCreatedException ;
}
