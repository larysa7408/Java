package homework_17.homework17;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Employee("Kirill", "Manager", "kirill@exzample.com", "+490536857834", 1800, 27);
        employees[1] = new Employee("Vlad", "Manager", "vlad@exzample.com", "+490533576835", 1800, 25);
        employees[2] = new Employee("Nikita", "IT", "nikita@exzample.com", "+4905326789939", 2400, 33);
        employees[3] = new Employee("Valeriya", "Designer", "valeriya@exzample.com", "+490533702677", 2200, 24);
        employees[4] = new Employee("Marina", "Administrator", "marina@exzample.com", "+4905373126954", 3000, 37);
        employees[5] = new Employee("Olga", "Accountant", "olga@exzample.com", "+4905313468023", 2800, 43);
        employees[6] = new Employee("Dmitriy", "Director", "dmitriy@exzample.com", "+4905325653890", 4000, 45);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println("Employee over 40: ");
                System.out.println("Employee");
                System.out.println("Name: " + employee.getName());
                System.out.println("Position: " + employee.getPosition());
                System.out.println("Email: " + employee.getEmail());
                System.out.println("Phone: " + employee.getPhone());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Age: " + employee.getAge());
            }
        }
    }
}
