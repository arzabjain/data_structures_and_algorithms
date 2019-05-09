package com.linkedlist;

public class SinglyLinkedList<T> {

  /**
   * class to create a Node with a data and a next pointer
   *
   * @param <T>
   */
  private static class Node<T> {

    private T data;

    private Node<T> next;

    public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }
  }

  private Node<T> head = null;

  private int size = 0;

  /**
   * @param data
   */
  public void addFirst(T data) {
    head = new Node<>(data, head);
    size++;
  }

  public void traverse() {

    Node<T> temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public void addLast(T data) {

    if (head == null) {
      addFirst(data);
    } else {
      Node<T> temp = head;

      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node<>(data, null);
      size++;
    }
  }

  public int size() {
    return size;
  }

  public void removeFirst() {
    head = head.next;
    size--;
  }

  public void removeLast() {

    Node<T> temp = head;

    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    size--;
  }

  public void add(T data, int position) {
    if (position < 0 || position >= size()) {
      throw new IndexOutOfBoundsException();
    }
    if (position == 0) {
      addFirst(data);
    } else if (position == size() - 1) {
      addLast(data);
    } else {
      Node<T> temp = head;

      Node<T> toInsert;

      int tempPosition = 1;

      while (tempPosition < position) {
        temp = temp.next;
        tempPosition++;
      }
      Node<T> current = temp;
      toInsert = new Node<>(data, current.next);
      current.next = toInsert;
      size++;
    }
  }

  public void remove(int position) {

    if (position < 0 || position >= size()) {
      throw new IndexOutOfBoundsException();
    }
    if (position == 0) {
      removeFirst();
    } else if (position == size() - 1) {
      removeLast();
    } else {
      int tempPosition = 1;

      Node<T> temp = head;

      while (tempPosition < position) {
        temp = temp.next;
        tempPosition++;
      }

      Node<T> current = temp;
      current.next = current.next.next;
      size--;
    }
  }

  public void removeAll() {
    int position = 0;

    while (position < size()) {
      remove(position);
      position++;
    }
    size = 0;
  }

  public void set(T data, int position) {

    if (data == null) throw new NullPointerException();
    if (position < 0 || position >= size()) throw new IndexOutOfBoundsException();

    Node temp = head;

    int tempPosition = 0;

    while (tempPosition < position) {
      temp = temp.next;
      tempPosition++;
    }
    temp.data = data;
  }

  public T get(int position) {
    if (position < 0 || position >= size()) throw new IndexOutOfBoundsException();

    Node temp = head;

    int tempPosition = 0;

    while (tempPosition < position) {
      temp = temp.next;
      tempPosition++;
    }
    return (T) temp.data;
  }

  public boolean find(T element) {

    int position = 0;

    Node temp = head;

    while (position < size()) {
      if (element == temp.data) {
        return true;
      } else {
        temp = temp.next;
        position++;
      }
    }

    return false;
  }

  /**
   * Arrange linkedList in reverse order
   */
  public void reverse() {
    Node<T> temp = head;
    Node<T> next = null;
    Node<T> previous = null;

    while (temp != null) {
      next = temp.next;
      temp.next = previous;
      previous = temp;
      temp = next ;
    }
    head = previous;
  }
}
