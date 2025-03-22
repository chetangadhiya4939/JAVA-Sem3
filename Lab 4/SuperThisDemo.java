// Parent class
class Parent {
    int x;

    Parent(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Parent x: " + x);
    }
}

// Child class
class Child extends Parent {
    int x;

    Child(int x, int y) {
        super(x); // Call Parent class constructor
        this.x = y; // Set Child class x
    }

    void display() {
        super.display(); // Call Parent class method
        System.out.println("Child x: " + x);
    }
}

// Main class to test `super` and `this`
public class SuperThisDemo {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display();
    }
}

