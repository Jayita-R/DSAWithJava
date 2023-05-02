package com.stacksandqueues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack=new DynamicStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(29);
        stack.push(19);
        stack.push(32);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
