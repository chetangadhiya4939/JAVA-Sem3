// Final class (cannot be extended)
final class FinalClass {
    // Final method (cannot be overridden)
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Attempting to extend FinalClass will result in a compilation error
// class ExtendedClass extends FinalClass { } 

// Using final with variables
public class FinalKeywordDemo {
    public static void main(String[] args) {
        final int x = 10; // Final variable
        // x = 20; // This will cause a compilation error

        // Final class instance
        FinalClass obj = new FinalClass();
        obj.display();
    }
}

