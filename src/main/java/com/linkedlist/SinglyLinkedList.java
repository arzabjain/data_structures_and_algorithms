package com.linkedlist;

public class SinglyLinkedList<AnyType> {

    private static class Node<AnyType>{

        private AnyType data;

        private Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<AnyType> head = null;

    private Integer count = 0;

    public void addFirst(AnyType data){
        head = new Node<>(data,head);
        count++;
    }

    public void traverse(){

        Node<AnyType> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addLast(AnyType data){

        if(head == null){
            addFirst(data);
        }else {
            Node<AnyType> temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node<>(data,null);
            count++;
        }
    }

    public Integer size(){
        return count;
    }

    public void removeFirst(){
        head = head.next;
        count--;
    }

    public void removeLast(){

        Node<AnyType> temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        count--;
    }

    public void add(AnyType data, int position){
        if (position < 0 || position >= size()){
            throw new IndexOutOfBoundsException();
        }
        if (position == 0){
            addFirst(data);
        }
        else if(position == size()-1){
            addLast(data);
        }else {
            Node<AnyType> temp = head;

            Node<AnyType> toInsert ;

            int tempPosition = 1;

            while(tempPosition < position){
                temp = temp.next;
                tempPosition++;
            }
            Node<AnyType> current = temp;
            toInsert = new Node<>(data, current.next);
            current.next = toInsert;
            count++;
        }
    }

    public void remove(int position){

        if(position < 0 || position >= size()){
            throw new IndexOutOfBoundsException();
        }
        if(position == 0){
            removeFirst();
        }else if (position == size()-1){
            removeLast();
        }else{
            int tempPosition = 1;

            Node<AnyType> temp = head;

            while(tempPosition < position){
                temp = temp.next;
                tempPosition++;
            }

            Node<AnyType> current = temp;
            current.next = current.next.next;
            count--;
        }
    }

    public void removeAll(){
        int position = 0;

        while(position < size()){
            remove(position);
            position++;
        }
        count = 0;
    }

    public void set(AnyType data, int position){

        if(data == null) throw new NullPointerException();
        if(position < 0 || position >= size()) throw new IndexOutOfBoundsException();

        Node temp = head;

        int tempPosition = 0;

        while(tempPosition < position){
            temp = temp.next;
            tempPosition++;
        }
        temp.data = data;
    }

    public AnyType get(int position){
        if(position < 0 || position >= size()) throw new IndexOutOfBoundsException();

        Node temp = head;

        int tempPosition = 0;

        while(tempPosition < position){
            temp = temp.next;
            tempPosition++;
        }
        return (AnyType) temp.data;
    }

    public boolean find(AnyType element){

        int position = 0;

        Node temp = head;

        while(position < size()){
            if(element == temp.data){
                return true;
            }else {
                temp = temp.next;
                position++;
            }
        }

        return false;
    }
}
