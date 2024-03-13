package lesson.lesson_02.lesson_17;

//Массив Обьектов
public class ArrayObjects {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 31, "Photo");
        //Создаем обьект класса
        //Person это тип данных

        System.out.println(garry.toString());// Выводи информацию в консоль
        garry.name = "Harold";// Переприсвоили новое имя Harold
        System.out.println(garry.name);
        garry.age = 18;
        System.out.println(garry.toString());
        Person john = new Person("John", 75, "Reading,Music");// можем таких Persоn создавать сколько хотим

        String[] strings = new String[5];
        //тип данных String[] ;название переменной strings; инициализация new String ;с количеством элементов [5];
        //Массив 5 ячеек с 5 null
        Person[] people = new Person[5];//Создаем МАССИВ
        //Person[] people = new Person[5]; набор ссылок из 5 штук
        // Массив Person[] нечто иное как набор ссылок у которого нет свое имени но можно получить обратившись к массиву
        people[0] = john;//people[0] присваеваем ссылку john
        people[1] = garry;
        System.out.println("====================");

        people[4] = new Person("Tom", 5, "crying");
        System.out.println(people[1].name);
        System.out.println(garry.name);
        people[1].name = "Oskold";
        garry.age = 77;
        System.out.println(people[1].toString());
        System.out.println(garry.toString());

        for (int i = 0; i < people.length; i++) {//Перебираем индекс в массиве;
            // можно перебирать все в циклах от i=0 до размера массива people.length
            if (people[i] != null) { // проверяем если в текущей ссылке нет имени null
                //people[i]если текущая ячейка[i]  не!=  null тогда возмем новое имя
                System.out.println(people[i].name);
                System.out.println(people[i].hobby);
            } else {
                people[i] = new Person("Name" + i, 18 + i, "Java");
                System.out.println(people[i].toString());
                System.out.println("Игнорируем ссылку null");
            }

        }
        Person test = new Person("Test", 50, "test");
        people[3] = test;
        test = null;

        System.out.println(people[3].hobby);

        test = people[1];

    }
}
