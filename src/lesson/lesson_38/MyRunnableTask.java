package lesson.lesson_38;

public class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Add order");

    }
}
