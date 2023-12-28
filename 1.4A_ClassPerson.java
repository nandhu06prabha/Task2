public class ClassPerson {
    //Base class
    protected String name;
    protected int age;

    // Constructor for the base class
    public ClassPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayDetail() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends ClassPerson {
    //Subclass
    private int employeeID;
    private double salary;

    // Constructor for the subclass using super
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display info about the employee
    public void displayEmployeeInfo() {
        super.displayDetail(); // Call the displayInfo method of the base class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
