public class distance {
    class Feet {
        double length;
        public Feet(double length) {
            this.length = length;
        }
        public void displayLength() {
            System.out.println("Feet length: " + length);
        }
    }

    class Inches {
        double measureLength;

        public Inches(double measureLength) {  // Changed from private to public
            this.measureLength = measureLength;
        }

        public void displayLength() {
            System.out.println("Inches length: " + measureLength);
        }
    }

    // Method to display feet length
    public void displayInfo() {
        Feet f = new Feet(11);  // Create an instance of the Feet class
        f.displayLength();      // Call displayLength method to print
    }

    public static void main(String[] args) {
        // Creating an object of the Distance class
        distance distanceObj = new distance();

        // Accessing methods and fields through the object
        distanceObj.displayInfo();  // This will call the displayInfo method
    }
}
