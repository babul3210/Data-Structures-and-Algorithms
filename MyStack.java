package com.blogspot.iambabul.datastructurenalgroithm;

public class MyStack {
    private final int CAPACITY = 5;
    private int[] stack;
    private int top;

    public MyStack(){
        stack = new int[CAPACITY];
        top = -1;
    }

    private void push(int element){
        if(isFull()){
            System.out.println("Stack is full!!!");
        }else {
            top++;
            stack[top] = element;
            System.out.println(element+" is inserted");
        }
    }

    private boolean isFull() {
        if (top==CAPACITY-1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
    }
}
