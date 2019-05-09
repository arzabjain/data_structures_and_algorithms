package com.stack;

public interface Stack<T> {

    public boolean isEmpty();

    public T peek();

    public T pop();

    public void push(T e);

    public void clear();

    public int size();
}
