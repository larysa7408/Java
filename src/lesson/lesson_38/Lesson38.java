package lesson.lesson_38;

public class Lesson38 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnableTask());
        Thread t2 = new Thread(new MyRunnableTask());
        Thread t3 = new Thread(new MyRunnableTask());
        t1.start();
        t2.start();
        t3.start();

    }
}
