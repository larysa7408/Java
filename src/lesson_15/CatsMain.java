package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat();//создаем обьект класса КОТ
        //Cat() вызов конструкторв класса специальный метод кот автоматич при создании метода иництализировать пол в классе
        //
        //ссылочные типы данных null
        //числовые примитивы0(0.0)
        // boolean-false
        //конструктор вызывается после обьектов класса

        cat.seyMeow();
        cat.run();
        cat.sleep();

        //при создании обьекто класса все его поля инициализируюся конструктором
        //инициализируются значениями по умолчанию

        String catNameVar = cat.name;
        System.out.println("Имя кота:"+catNameVar);
        System.out.println("Возраст кота"+ cat.age);
        System.out.println("Цвет:"+ cat.color);

     //Создаем ещ

        Cat cat1= new Cat("Max");// дали имя констуктору Макс

        cat1.run();
        cat1.sleep();
        System.out.println("Имя cat1:"+cat1.name);
        System.out.println("Возраст cat1"+cat1.age);

        System.out.println("Имя первого кота:" +cat.name);
     cat.whoAmI();
     cat1.whoAmI();

    }

}
