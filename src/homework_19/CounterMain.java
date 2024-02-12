package homework_19;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment();
        System.out.println("Увеличение счетчика : " + counter.getValue());
        counter.decrement();
        System.out.println("Уменьшение счетчика : " + counter.getValue());
        counter.getValue();
        System.out.println("Получение текущего значения счетчика : " + counter.getValue());
    }
}
