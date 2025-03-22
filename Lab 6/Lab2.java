// Abstract class Employee
abstract class Employee {
    String name;
    int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayInfo();
}

// Subclass Manager
class Manager extends Employee {
    double basicSalary;

    Manager(String name, int id, double basicSalary) {
        super(name, id);
        this.basicSalary = basicSalary;
    }

    // Implement calculateSalary() for Manager
    double calculateSalary() {
        return basicSalary + 0.1 * basicSalary; // Example bonus
    }

    // Implement displayInfo()
    void displayInfo() {
        System.out.println("Manager Name: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

// Subclass Programmer
class Programmer extends Employee {
    double basicSalary;

    Programmer(String name, int id, double basicSalary) {
        super(name, id);
        this.basicSalary = basicSalary;
    }

    // Implement calculateSalary() for Programmer
    double calculateSalary() {
        return basicSalary + 0.05 * basicSalary; // Example bonus
    }

    // Implement displayInfo()
    void displayInfo() {
        System.out.println("Programmer Name: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 50000);
        Employee programmer = new Programmer("Bob", 102, 40000);
        
        manager.displayInfo();
        programmer.displayInfo();
    }
}

