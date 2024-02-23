package lesson_17;

public class Cat17 {
    private String name;
    String color;
    int age;

    //доступ к полям всегда закрыт
    public Cat17(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {// чтобы изменять код
        if (name != null) // защита чтобы не присвоили коту имя ноль
            this.name = name;
    }

    public String getName() {//  чтобы читать поле
        return name;
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
