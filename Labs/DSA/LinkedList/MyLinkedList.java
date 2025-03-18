public class MyLinkedList<T> {
    Node<T> front = null;
    Node<T> end = null;
    int size = 0;

    public void addFirst(Node<T> t) {
        if (front == null){
            front = t;
            end = t;
        }
        else {
            t.next = front;
            front = t;
        }
        size++;
    }

    public void addLast(Node<T> t) {
        Node n = new Node(t);
        if (front == null) {
            front = t;
            end = t;
            size++;
        }
        else{
            end.next = t;
            end = t;
        }
        }

    public Node<T> removeFirst() {
        Node <T> temp = front;
            front = front.next;
            size--;
            return front;
    }

    public boolean remove(int index) {
        Node h = front;
        if (index<0||index>=size) {
            return false;
        }
        if (index==0){
            removeFirst();
            return true;
        }
            Node<T> current = front;
            for (int i = 0; i<index ; i++) {
                current= current.next;
            }
            current.next = current.next.next;
            size--;
            return true;
        }
    public Node<T> first(){
        return front;
    }
    public int size(){
        return size;
    }
}