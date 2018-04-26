package com.stack;

public interface Stack<AnyType> {

    public boolean isEmpty();

    public AnyType peek();

    public AnyType pop();

    public void push(AnyType e);

    public void clear();

    public int size();
}
