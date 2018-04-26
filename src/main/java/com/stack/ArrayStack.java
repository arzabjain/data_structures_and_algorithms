package com.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<AnyType> implements Stack<AnyType>{


    private List<AnyType> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public AnyType peek() {

        if (stack.isEmpty()){
            return null;
        }else{
            return stack.get(stack.size() - 1);

        }
    }

    @Override
    public AnyType pop() {

        if (!stack.isEmpty())
            return stack.remove(stack.size() - 1);
        else {
            return (AnyType) new IndexOutOfBoundsException();
        }
    }

    @Override
    public void push(AnyType e) {
        stack.add(e);
    }

    @Override
    public void clear() {
        for (int pos = 0 ; pos < stack.size() ; pos++){
            stack.remove(pos);
        }
    }

    @Override
    public int size() {
        return stack.size();
    }
}
