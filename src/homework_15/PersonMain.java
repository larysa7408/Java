package homework_15;

public class PersonMain {
    public static void main(String[] args) {

        Person Student = new Person();
        String studentName = Student.name;
        System.out.println("Привет! Меня зовут " + studentName);
        System.out.println("Мне " + Student.age + " лет");
        System.out.println("Я учусь на " + Student.profession + "а");
        Student.everyday();


        System.out.println("==================");


        Person Doctor = new Person();
        Doctor.PersonDoctor();

        Doctor.everyday1();


        System.out.println("===================");

        Person Teacher = new Person();
        Teacher.PersonTeacher();

        Teacher.everyday2();



    }




}
