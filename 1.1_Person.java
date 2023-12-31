public class Person {
    private String name;
    private int age;

    //Default Person age is 18
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Display name and age of person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Get methods for name and age
    public String getName() {
        return name;
    }
    // Set methods for name
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    // Set methods for age
    public void setAge(int age) {
        this.age = age;
    }
    // Print the person name and age
    public static void main(String[] args) {
        Person CP = new Person("NANDHINI", 25);
        System.out.println("\nPerson");
        CP.displayInfo();
    }
}
