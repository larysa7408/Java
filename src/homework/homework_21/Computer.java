package homework.homework_21;
/*
Задание 2 по желанию
Компьютер и компоненты
Создайте базовый класс Componentс полями brand(брендами) и model(моделью).
производят производные классы: Processor, Memory, Storageот класса Component.
Создайте класс Computer, который будет содержать компоненты:
процессор, память и накопитель.
Реализуйте соотношение состава между Computerи компонентами.
Компонент не может существовать без компьютера.
 */

public class Computer {
    private String model;
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String model) {
        this.model = model;
        processor=new Processor("AMD","Ryzen-7", 2500);
        memory=new Memory("Samsung", "EVO PRO",16000);
        storage=new Storage("WD","Baracuda", 1000);
    }
public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Computer {");
        stringBuilder.append("processor: ").append(processor.getModel()).append("; ");
        stringBuilder.append("}");

        return stringBuilder.toString();
}

    public static void main(String[] args) {
        Computer computer = new Computer("ROG - AMD");
        System.out.println(computer.toString());
    }


}
