package com.linkedlist;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        linkedList.addLast(5);
        linkedList.addLast(7);
        linkedList.addFirst(9);
        linkedList.addLast(10);
//        linkedList.removeLast();
        linkedList.add(50,0);
//        linkedList.remove(3);
        linkedList.set( 19, 4);
        linkedList.traverse();

        linkedList.reverse();

        linkedList.traverse();
    }
}
