public class StringRotationChecker {

    // Method to check if str2 is a rotation of str1
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are the same and neither string is empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }
        
        // Concatenate str1 with itself
        String concatenated = str1 + str1;
        
        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "tip";
        String str2 = "pit";
        
        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is not a rotation of " + str1);
        } else {
            System.out.println(str2 + " is a rotation of " + str1);
        }
    }
}

