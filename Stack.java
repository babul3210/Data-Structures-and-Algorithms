package com.blogspot.iambabul.datastructurenalgroithm;

import java.util.Scanner;

public class Stack {
    private static int[] stack;
    private static int size;
    private static int top;
    private static Scanner in;

    static {
        Stack.create();
    }

    public static void main(String[] args) {
        int ch, item;

        while (true){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. traverse");
            System.out.println("5. exit");

            System.out.println("===========");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter item: ");
                    item = in.nextInt();
                    Stack.push(item);
                    break;

                case 2:
                    item = Stack.pop();
                    if (item==0){
                        System.out.println("Stack is underflow");
                    }else {
                        System.out.println("Popped "+item);
                    }
                    break;

                case 3:
                    item = Stack.peek();
                    if (item==0){
                        System.out.println("Stack is underflow");
                    }else {
                        System.out.println("Peek "+item);
                    }
                    break;

                case 4:
                    Stack.traverse();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void create() {
        in = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        size = in.nextInt();

        stack = new int[size];
        top = -1;
    }

    private static void push(int element){
        if(isFull()){
            System.out.println("Stack is overflow");
        }else {
            top++;
            stack[top] = element;
            System.out.println(element+" is inserted");
        }
    }

    private static int pop() {
        if(Stack.isEmpty()){
            return 0;
        }else {
            return stack[top--];
        }
    }

    private static int peek() {
        if(Stack.isEmpty()){
            return 0;
        }else {
            return stack[top];
        }
    }

    private static void traverse() {
        if(Stack.isEmpty()){
            System.out.println("Stack is empty!!!");
        }else {
            for(int i = top; i>=0; i--){
                System.out.println(stack[i]);
            }
        }
    }

    private static boolean isFull() {
        if (top== Stack.size-1){
            return true;
        }else {
            return false;
        }
    }

    private static boolean isEmpty() {
        if (top==-1){
            return true;
        }else {
            return false;
        }
    }
}
