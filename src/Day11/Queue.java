//package Day11;
//
//public class Queue {
//    Node front, rear;
//    int length;
//
//    public Queue() {
//        this.front = null;
//        this.rear = null;
//        this.length = 0;
//    }
//
//    void enqueue(int data) {
//        this.length++;
//        Node temp = new Node(data);
//
//        if (this.rear == null){
//            this.rear = temp;
//            this.front = temp;
//            return;
//        }
//        this.rear.next = temp;
//        this.rear = temp;
//    }
//
//    void dequeue() {
//        if (this.front == null) {
//            return;
//        }
//        Node temp = this.front;
//        this.front = this.front.next;
//
//        if (this.front == null) this.rear = null;
//
//        temp.next = null;
//    }
//
//    int peek() {
//        if (this.front != null) return this.front.data;
//
//        return Integer.MIN_VALUE;
//    }
//
//    int size() {
//        return this.length;
//    }
//
//    void printQueue() {
//        Node temp = this.front;
//
//        System.out.print("Element of Queue: ");
//
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//class Node {
//    int data;
//    Node next;
//
//    private Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.enqueue(1);
//        q.enqueue(2);
//
//        q.printQueue();
//        System.out.println("Size :" + q.size());
//        q.dequeue();
//        q.dequeue();
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.printQueue();
//        System.out.println("Size: " + q.size());
//        System.out.println("Front item is: " + q.peek());
//    }
//}