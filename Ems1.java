import java.util.ArrayList;
import java.util.List;

class Ems {
    
    private int id;
    private String name;
    private double salary;

    public Ems(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("----------------------------");
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Ems1 {
    public static void main(String[] args) {
         Ems emp1 = new Ems(1, "John Doe", 50000);
       Ems emp2 = new Ems(2, "Jane Smith", 60000);
       Ems emp3 = new Ems(3, "Jim Brown", 45000);

        List<Ems> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Ems employee : employees) {
            employee.displayDetails();
        }
    }
}
