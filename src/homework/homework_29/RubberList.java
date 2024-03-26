package homework.homework_29;

import org.w3c.dom.Node;

import static extend.SimpleStack.idx;

public class RubberList {
    private int size = 0; //- «размер», чтобы отслеживать количество узлов в списке.
    private Node first; // - «голова» для ссылки на первый узел в списке.
    private Node last;// - «хвост» для ссылки на последний узел в списке.
    private int findIndex;

    public int size() { // возвращает текущий размер списка.
        return size;
    }

    public Integer get(int idx) {
        Node findNode = findByIndex(idx);
        if (findNode != null) {
            return findNode.item;
        }
        return null;
    }

    public void add(int value) {
        // добавляет в конец списка новый узел с заданным значением.
        // Он обрабатывает три случая: когда список пуст,
        // когда список содержит только один элемент и когда список содержит более одного элемента.
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

    //Task 3: Implement the add(int value, int idx) method in the rubberlist class.
    public void add(int value, int idx) {
        if (idx == 0) {
            first = new Node(null, value, null);
            last = first;
        } else {
            Node newFirst = new Node(null, value, first);
            first.prev = newFirst;
            first = newFirst;
        }
        if (idx == size) {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor != null) {
                if (index == idx) {
                    Node newNode = new Node(cursor.prev, value, cursor);
                    cursor.prev.next = newNode;
                    cursor.prev = newNode;
                    break;
                }
                cursor = cursor.next;
                index++;
            }
        }
        size++;
    }

    //Task 1: Implement the contains() method in the rubberlist class.
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }
    //Task 2: Implement the indexOf() method in the rubberlist class.

    public int indexOf(int value) {
        Node node = findByValue(value);
        if (node != null) {
            return findIndex;
        }
        return -1; // Return -1 if the value is not found
    }

    public void remove(int idx) {
        // if we want to remove first element
        if (idx == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
            }
            size--;
            // if we want to remove last element
        } else if (idx == size - 1) {
            Node newLast = last.prev;
            newLast.next = null;
            last.prev = null;
            last = newLast;
            size--;

        } else {
            Node findNode = findByIndex(idx);
            if (findNode == null) {
                return;
            }
            Node nodeA = findNode.prev;
            Node nodeC = findNode.next;
            nodeA.next = nodeC;
            nodeC.prev = nodeA;
            findNode.prev = null;
            findNode.next = null;
            size--;
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

    private Node findByIndex(int idx) {
        if (idx == 0) {
            return first;
        }
        if (idx == size - 1) {
            return last;
        }
        int findIndex = 0;
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (idx == findIndex) {
                return cursor;
            }
        }
        return null;
    }

    private Node findByValue(int value) {
        if (size == 0) {
            return null;
        }
        findIndex = 0;
        if (first.item == value) {
            return first;
        }
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (cursor.item == value) {
                return cursor;
            }
        }
        return null;
    }

    private static class Node {
        Node prev;
        int item;
        Node next;

        public Node(Node prev, int item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}


