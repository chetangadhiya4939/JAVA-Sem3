public class Lab3_1 {
    private int feet;
    private int inches;

    // Constructor to initialize feet and inches
    public Lab3_1(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to display the distance
    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Lab3_1 distance = new Lab3_1(5, 10); // Create a Distance object
        distance.display(); // Display the distance
    }
}

