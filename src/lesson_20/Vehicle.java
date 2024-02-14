package lesson_20;

public class Vehicle {// Создаем класс транспортное средство
   private String model;// модель ТС
   private int yearManufactured;//год выпуска ТС добавляем в строку final чтобы строка больше не менялась

    public Vehicle(String model, int yearManufactured) { // создаем конструктор и оба поля генерируем
        System.out.println("Конструктор Vehicle start");
        this.model = model;
        this.yearManufactured = yearManufactured;

    }

    public void go() {

        System.out.println("Vehicle " + model + "начинает движение");
    }
    // наделим базовым функционалом для всех ТС что они умеют делать создаем два метода public void

    public void stop() {
        System.out.println("Vehicle " + model + "остановился");
    }


    public String toString() {
        return "Vehicle " + model + "; year:" + yearManufactured;
    }// Метод создаем строковую информацию о классе вида return


    public String getModel() {
        return model;
    } // гетеры

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }


}
