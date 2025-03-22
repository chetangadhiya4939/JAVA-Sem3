import java.util.Scanner;

public class PyramidPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            for (int k = 0; k < str.length() - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

