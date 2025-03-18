public interface MyStack<T> {
    public void push(T o);
    public T pop() throws StackEmptyException;
    public T peek();
    public boolean isEmpty();
    public int size();
}
