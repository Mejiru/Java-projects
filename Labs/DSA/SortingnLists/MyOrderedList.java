package list.library;

import java.util.ArrayList;
import java.util.Collections;

public class MyOrderedList {
    private ArrayList<Integer> ol;

    public MyOrderedList() {
        ol = new ArrayList<>();
    }

    public void add(Integer num) {
        ol.add(num);
        Collections.sort(ol);
    }

    public void remove(Integer num) {
        ol.remove(num);
    }

    public int indexOf(Integer num) {
        if (num >= 0 && num < ol.size()) {
            return ol.get(num);
        }
        return -1;
    }

    public void printol() {
        System.out.println("ordered List: " + ol);
    }

    public static void main(String[] args) {
        MyOrderedList ol = new MyOrderedList();

        ol.add(2);
        ol.add(3);
        ol.add(4);
        ol.add(5);

        ol.printol();

        ol.remove(3);
        ol.printol();

        int index = ol.indexOf(0);
        System.out.println("Index of 0" +": " + index);
    }
}
