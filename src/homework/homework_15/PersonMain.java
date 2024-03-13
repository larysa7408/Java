package homework.homework_15;

public class PersonMain {
    public static void main(String[] args) {

        Person Student = new Person("Валера", 18, "Cтудент");
        Person Doctor = new Person("Максим", 35, "Cтоматолог");
        Person Teacher = new Person("Олег", 38, "Учитель начальных классов");


        String studentName = Student.name;

        System.out.println("Привет! Меня зовут " + studentName);
        System.out.println("Мне " + Student.age + " лет");
        System.out.println("Cтудент");

        Student.everyday();

        System.out.println("==================");

        String DoctorName = Doctor.name;

        System.out.println("Привет! Меня зовут " + DoctorName);
        System.out.println("Мне " + Doctor.age + " лет");
        System.out.println("По професии я " + Doctor.profession);

        Doctor.everyday1();

        System.out.println("==================");

        String TeacherName = Teacher.name;

        System.out.println("Привет! Меня зовут " + TeacherName);
        System.out.println("Мне " + Teacher.age + " лет");
        System.out.println("По професии я " + Teacher.profession);

        Teacher.everyday2();


    }


}
