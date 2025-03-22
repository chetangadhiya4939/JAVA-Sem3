import java.util.*;

class Lab2_1 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the Number N : ");

        //int N = Integer.parseInt(p.nextLine());
        int N = p.nextInt();

        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // p.close();
    }
}
