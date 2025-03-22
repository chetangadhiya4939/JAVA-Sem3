// Grandparent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Parent class
class Mammal extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mammal makes a sound");
    }
}

// Child class
class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to test runtime polymorphism
public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal animal;
        
        animal = new Dog(); // Upcasting
        animal.makeSound(); // Calls Dog's makeSound method due to runtime polymorphism
    }
}

