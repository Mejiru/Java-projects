package queue.examples;

// ANSWER TO EX 2 IS 24

import queue.myqueue.MyLinkedListQueue;
import queue.myqueue.MyQueue;


public class MyLinkedListQueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyLinkedListQueue<Integer>();

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        System.out.println(queue.first());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        queue.enqueue(16);
        System.out.println(queue.dequeue());

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        //This shows it's in FIFO basis

        MyQueue<String> studentlist = new MyLinkedListQueue<String>();
        studentlist.enqueue("Ahmed");
        studentlist.enqueue("Mohammed");
        studentlist.enqueue("Hamza");
        studentlist.enqueue("Rashed");
        studentlist.enqueue("Ramad");
        System.out.println();
        while(!studentlist.isEmpty()) {
            System.out.println(studentlist.dequeue());
        }

    }
}
