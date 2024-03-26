package lesson.lesson_29;

public class RubberList {
    private int size = 0;
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public Integer get(int idx) {
        if (idx == 0) {
            return first.item;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                index++;
                cursor = cursor.next;
                if (idx == index) {
                    return cursor.item;
                }
            }
        }
        return null;
    }

    public void add(int value) { // 1. Добавление элемента
        if (size == 0) {
            first = new Node(null, value, null);
        } else if (size == 1) {
            last = new Node(first, value, null);
            first.next = last;
        } else {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void add(int value, int idx) { // TODO 3. Добавление по индексу

    }

    public void remove(int idx) {
        if (idx == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
            }
            size--;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                    Node left = cursor.prev;
                    Node right = cursor.next;
                    left.next = right;
                    if (right != null) {
                        right.prev = left;
                    }
                    cursor.prev = null;
                    cursor.next = null;
                    size--;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (size > 0) {
            sb.append(first.item);
        }
        if (size > 1) {
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                sb.append(", ").append(cursor.item);
            }
        }
        return sb.append("]").toString();
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }
    //Task 2: Implement the indexOf() method in the rubberlist class.

    public int indexOf(int value) {
//        Node node = findByValue(value);
//        if (node != null) {
//            return findIndex;
//        }
        return -1; // Return -1 if the value is not found
    }


    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "prev=" + (prev == null? null : "<-link") +
                    ", item=" + item +
                    ", next=" + (next == null? null : "link->") +
                    '}';
        }
    }
}
