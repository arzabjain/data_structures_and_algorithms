package com.stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new ArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());

        stack.push(7);

        System.out.println(stack.peek());

      /*  for (int i =0; i < stack.size() ; i++){
            System.out.println(stack.getFront());
        }*/
    }
}
