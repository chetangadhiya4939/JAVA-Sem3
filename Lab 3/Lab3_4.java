public class Lab3_4 {
    private int value;

    // Default constructor
    public Lab3_4() {
        this(0); // Call parameterized constructor
    }

    // Parameterized constructor
    public Lab3_4(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        Lab3_4 defaultObject = new Lab3_4();
        Lab3_4 parameterizedObject = new Lab3_4(10);

        defaultObject.display();
        parameterizedObject.display();
    }
}

