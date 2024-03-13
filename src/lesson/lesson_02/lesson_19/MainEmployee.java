package lesson.lesson_02.lesson_19;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("John P.", 2000);
        Employee employee1 = new Employee("John P.", 2000);
        Employee employee2 = new Employee("Basti G.", 10000);

        System.out.println(employee.info());
        System.out.println(employee1.info());
        System.out.println(employee2.info());

        // id - уникальный идентификатор -- что-то уникальное для каждого объекта
        // Не повторяющееся. Признак, по которому можно "опознать" объект
    }
}
