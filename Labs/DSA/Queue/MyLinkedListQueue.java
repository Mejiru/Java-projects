package queue.myqueue;

import linkedlist.MyLinkedList;
import linkedlist.Node;

public class MyLinkedListQueue<T> implements MyQueue<T> {
    MyLinkedList<T> list = new MyLinkedList<T>();

    public void enqueue(T element) {
        list.addLast(new Node<T>(element));
    }


    public T dequeue() {
        if (isEmpty()) throw new QueueEmptyException("Queue is empty");
        // remove element from  the front of the list
        Node<T> o = list.removeFirst();
        return o.getElement();
    }


    public T first() {
        if (isEmpty()) return null;
        return list.first().getElement();
    }

    public boolean isEmpty() {
        if (list.size()==0) return true;
        return false;
    }


    public int size() {
        return list.size();
    }


    public String toString() {
        return "Queue";
    }

}
