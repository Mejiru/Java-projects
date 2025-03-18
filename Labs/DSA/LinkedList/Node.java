public class Node <T>{
    T element;
    Node next;
    public Node(T e){
        this.element=e;
    }
    public T getElement(){
        return element;
    }
    public String toString(){
        return "Node with element:" +element.toString();
    }
}
