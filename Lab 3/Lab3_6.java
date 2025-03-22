public class Lab3_6 {
    private int value;

    // Default constructor
    public Lab3_6() {
        this.value = 0;
    }

    // Parameterized constructor
    public Lab3_6(int value) {
        this.value = value;
    }

    // Copy constructor
    public Lab3_6(Lab3_6 other) {
        this.value = other.value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Lab3_6 defaultObject = new Lab3_6();
        Lab3_6 parameterizedObject = new Lab3_6(10);
        Lab3_6 copyObject = new Lab3_6(parameterizedObject);

        defaultObject.display();
        parameterizedObject.display();
        copyObject.display();
    }
}

