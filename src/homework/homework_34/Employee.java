package homework.homework_34;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private String email;
    private String phone;
    private double salary;
    private String position;

    public Employee(String name, int age,
                    String email, String phone,
                    double salary, String position) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
    }
    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
               ", phone='" + phone + '\'' +
                ", salary=" + salary +
               ", position='" + position + '\'' +
                '}';
    }
}
