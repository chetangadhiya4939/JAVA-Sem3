// Parent class
class Parent {
    // Constructor of Parent class
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

// Child class extending Parent
class Child extends Parent {
    // Constructor of Child class
    public Child() {
        super(); // Calls the Parent's constructor
        System.out.println("Child Constructor");
    }
}

// Main class with the entry point
public class Lab3_5 {
    // Main method to run the program
    public static void main(String[] args) {
        new Child(); // Create an instance of Child
    }
}

