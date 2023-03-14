package hw4;

import java.util.LinkedList;

public class Task42 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        enqueue(ll, "one");
        enqueue(ll, 2);
        enqueue(ll, "three");
        enqueue(ll, 4);
        System.out.println(ll);
        System.out.println(first(ll));
        System.out.println(dequeue(ll));
        System.out.println(ll);
    }

    public static void enqueue(LinkedList<Object> ll, Object e) {
        ll.addLast(e);
    }

    public static Object dequeue(LinkedList<Object> ll) {
        return ll.removeFirst();
    }

    private static Object first(LinkedList<Object> ll) {
        return ll.getFirst();
    }
}
