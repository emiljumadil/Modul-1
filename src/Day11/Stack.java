//package Day11;
//import java.util.*;
//
//public class Stack {
//    private int maxSize;
//    private int top;
//    private int[] stackArray;
//
//    public Stack(int maxSize) {
//        this.maxSize = maxSize;
//        this.top = -1;
//        this.stackArray = new int[maxSize];
//    }
//    public boolean isEmpty() {
//        return (top == -1);
//    }
//
//    public boolean isFull() {
//        return (maxSize - 1 == top);
//    }
//
//    public void push(int value) {
//        if (!isFull()) {
//            top++;
//            stackArray[top] = value;
//            System.out.println("Pushed element:" + value);
//        } else {
//            System.out.println("Stack is full, Cannot push element: " + value);
//        }
//    }
//    public int pop() {
//        if (!isEmpty()) {
//            int value = stackArray[top];
//            top--;
//            System.out.println("Popped element :" + stackArray[value]);
//            return stackArray[value];
//
//        } else {
//            System.out.println("Stack is empty!");
//            return -1;
//        }
//    }
//    public int peek() {
//        if (!isEmpty()) {
//            return stackArray[top];
//        } else {
//            System.out.println("Stack is empty! ");
//            return -1;
//        }
//    }
//    public static void main(String[] args) {
//        Stack stack = new Stack(100);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//    }
//}
