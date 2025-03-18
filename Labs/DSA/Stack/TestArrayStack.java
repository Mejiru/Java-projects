public class TestArrayStack {
    public static void main(String[] args) {
        MyArrayStack<Integer> s = new MyArrayStack<Integer>();
        s.push(100);
        s.push(50);
        System.out.println();
        System.out.println(s.peek() + "is the top of the stack");
        System.out.println(s.pop() + "has been popped");
        System.out.println(s.peek() + "is the new top");
    }
}
