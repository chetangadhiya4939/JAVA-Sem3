// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class to test hierarchical inheritance
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Parent class method
        dog.bark(); // Child class 1 method

        Cat cat = new Cat();
        cat.eat(); // Parent class method
        cat.meow(); // Child class 2 method
    }
}

