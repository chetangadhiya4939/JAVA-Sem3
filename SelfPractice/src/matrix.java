import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("Col : ");
        int col = sc.nextInt();
        System.out.println("Matrix will be : " + row + "x" + col + " Having Elements = " + row * col);

        int[][] arr = new int[row][col];
//Taking User inputs for the Array.
        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                System.out.print("Element at [" + a + "][" + b + "]: ");
                arr[a][b] = sc.nextInt();
            }
        }
        //Printing the array.
        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                System.out.println(arr[a][b]);
            }
        }
    }
}