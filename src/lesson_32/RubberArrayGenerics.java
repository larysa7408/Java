package lesson_32;

public class RubberArrayGenerics<E> {
    private final int INIT_DATA_SIZE = 3;
    private final float EXTEND_INDEX = 1.5f;
    private Object[] data;
    private int length;

    public RubberArrayGenerics() {
        this.data = new Object[INIT_DATA_SIZE];
        length = 0;
    }

    public E get(int idx) {
        return (E) data[idx];
    }

    public void add(E value) {
        if (length == data.length) {
            //create new array. lenght *=1,5
            Object[] newData = new Object[(int) (data.length * EXTEND_INDEX)];
            //move all items to new array
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // change link to new array
            data = newData;
        }
        //add value
        data[length] = value;
        length++;
    }

    public void add(E value, int idx) {
        if (length == data.length) {
            Object[] newData = new Object[(int) (data.length * EXTEND_INDEX)];
            for (int i = 0; i < idx; i++) {
                newData[i] = (int) data[i];
            }
            newData[idx] = value;
            for (int i = 0; i <= length; i++) {
                newData[i] = (int) data[i - 1];
            }
            data = newData;
        } else {
            for (int i = length; i > idx; i--) {
                data[i] = data[i - 1];
            }
            data[idx] = value;
        }
        length++;
    }

    public void remove(int idx) {
        // move elements right to left from idx
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    public int indexOf(E value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            str.append(data[i]);
            if (i < length - 1) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}

