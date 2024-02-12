package lesson_19;

public class FinalDemo {
    public static final double PI = 3.141519;// Константа
    public static final int[]INTS=new int[10]; // не являет константой, т.к. состояние объекта (значения элементов) могут быть изменены

    private final int x;
    private final int[] ints;


    public FinalDemo(int x) {
        this.x = x;
        ints = new int[10];

        //  this.x = 15;изменить значение final int нельзя

    }

    public int getX() {
        return x;
    }


    public void setX(int newValue) {
        //  this.x = newValue ; изменить значение final int нельзя
    }

    public void setNewSize(int size) {
        // int = new int[size];// Нельзя переписать ссылку для final переменной ссылочного типа
    }

    public void setNewValue() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 10*(int) PI;

        }
    }

    public void printArray() {
        System.out.println("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length -1) ? ", " : "]\n"));

        }

    }
}
