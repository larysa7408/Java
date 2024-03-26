package lesson.lesson_25;

public class Wrappers {
    /*
    Byte  - обертка для byte
    Short - обертка для short
    Integer -обертка для int
    Long - обертка для long
    Float - обертка для float
    Double - обертка для double
    Character -обертка для char
    Boolean - обертка для boolean
     */
    public static void main(String[] args) {
        Integer integer;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue " + maxValue);
        System.out.println("min " + Integer.MIN_VALUE);
        integer = null; // Поддержка null
        //Автоматическое приведение типов
        //Авто-упаковка и авто-распаковка

        Integer wrappedInt = 5; // Авто-упаковка примитива int в ссылочный тип Integer
        System.out.println(wrappedInt);
        int primitiveInt = wrappedInt; // авто-распаковка из типа Integer преобразoвало в примитив int

        //Сравнение обьектов == сравнение по ссылке
        //Допустимо сравнивать  -128... 127 сравнение по ссылкам может работать не так ка мы ожидаем


        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);// false
        System.out.println(c.equals(d));//true

        //Схожие методы для всех оберточных типов
        // 1 . valueOf() Преобразует явным образом примитив или строку в соответствующую обертку
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf == : " + (e == f));

        Integer insStr = Integer.valueOf("123");
        System.out.println(insStr + 100);

        // 2. parseXXX() = Преобразует строку в соответствующий примитив
        Integer.parseInt("456");
        Double.parseDouble("344.56");
        System.out.println(Integer.parseInt("456") + 100);
        System.out.println(Double.parseDouble("344.56") + 200);

        //System.out.println(Integer.parseInt("RRR")); //выбросит исключение (ошибку)

        //toString - возвращает строковое представление числа
        System.out.println(insStr.toString() + ", hello");

        // equals сравнивает два обьекта по значению
        //compareTo() Сравнивает текущий обьект с другим обьектом
        System.out.println(e.compareTo(f)); // 127 vs 127 ->0
        System.out.println(e.compareTo(d)); // 127 vs 128 -> -1 отрицательное значение

        //xxxValue() возвращает обьект как соответствующий примитив

        Double d1 = Double.valueOf(125.67); // запаковал
        double dPrimitive = d1.doubleValue(); // явная / принудительная распаковка

        //=============
        // все числовые обертки над примитивами наследуются от абстрактного класса Number

        Number number = Integer.valueOf(125);

        /* Методы для приведения любого числового оберточного типа к примитиву
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer1 = 31844;
        Double dblValue = 345.78;

        System.out.println(integer1.doubleValue());
        short sh = integer1.shortValue();

        int intFromDouble = dblValue.intValue();
        System.out.println(intFromDouble);

        System.out.println(0.1 + 0.2);
        Double s1 = 0.1;
        Double s2 = 0.2;


    }
}
