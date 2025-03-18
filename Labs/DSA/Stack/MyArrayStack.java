import java.util.Arrays;
public class MyArrayStack<T> implements MyStack<T>{
    private static final int DEFAULT_STACK_SIZE = 100;
    T[] stackArray;
    int top = 0;

    public MyArrayStack() {
        this(DEFAULT_STACK_SIZE);
    }
    public MyArrayStack(int defaultSize) {
        top = 0;
        stackArray = (T[])new Object[defaultSize];
    }

    public void push(T o) {
        if (size() == stackArray.length) expandCapacity();
        stackArray[top] = o;
        top++;
    }
    private void expandCapacity() {
        stackArray = Arrays.copyOf(stackArray, stackArray.length*2);
        System.out.println("StackArray size is automatically expanded:" + stackArray.length);
    }

    public T pop() throws StackEmptyException {
        if (isEmpty()) throw new StackEmptyException("Stack is empty");
        top--;
        T o = stackArray[top];
        stackArray[top] = null;
        return o;
    }

    public T peek() {
        if (isEmpty()) return null;
        return stackArray[top-1];
    }
    public boolean isEmpty() {
        if (top==0) return true;
        return false;
    }

    public int size() {
        return top;
    }
}
