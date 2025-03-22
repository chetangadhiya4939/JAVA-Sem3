public class Lab3_3 {
    private int privateValue = 10; // Private field
    public int publicValue = 20;   // Public field

    // Method to change private value
    private void setPrivateValue(int value) {
        privateValue = value;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Private Value: " + privateValue);
        System.out.println("Public Value: " + publicValue);
    }

    public static void main(String[] args) {
        Lab3_3 demo = new Lab3_3();
        demo.displayValues();
        
        // Primitive type (passed by value)
        int number = 5;
        modifyPrimitive(number);
        System.out.println("Number after modification: " + number);

        // Object (passed by reference)
        int[] array = {1, 2, 3};
        modifyArray(array);
        System.out.println("Array after modification: " + array[0]);
    }

    // Modify primitive value
    static void modifyPrimitive(int value) {
        value = 10;
    }

    // Modify array (object) value
    static void modifyArray(int[] arr) {
        arr[0] = 99;
    }
}

