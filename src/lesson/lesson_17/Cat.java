package lesson.lesson_17;

public class Cat {
    // Все поля класса должны быть закрыты от прямого доступа из вне
    // помечены модификатором доступа private
    private String test;
    private String name;
    private int age;
    private int weight;

    //для каждых полей пишем сетр гетр  если поле не будем менять мы для него не пишем сетр



    public Cat(String test, String name, int age, int weight) {
        //Конструктор
        this.test = test;
        setName(name);
        setAge(age);
        this.weight = weight;
    }

    public void sayMeow() {
        System.out.println("Meow!!! " + name);
    }
   // Метод

    // Когда приват Геттеры get и сеттеры. Это методы возвращающие или изменяющие поля класса
// Каждое поле которое закрыто private пишем геттеры сетееры
    public String getName() { // геттер для поля Name
        return this.name;
    }

    public int getAge() {
        return age;
    }


    //МКТОД public void setAge мы регулируем какой интерфейс доступа мы оставляем нашим обьектам которые мы помечаем словом  public будут доступны для нашего класса они смогут им воспользоваться

    // Сеттеры set
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Некорректное значение возраста");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {

        if (name != null) {
            this.name = name;
            sayHello();
        } else {
            this.name = "default";
        }
    }
    //МКТОД  private void sayHellо никакой другой обьект его не видет
    private void sayHello() {
        System.out.println("Hello");
    }

}
