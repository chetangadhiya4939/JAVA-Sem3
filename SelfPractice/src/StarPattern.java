import java.util.*;
public class StarPattern {
    public static void main(String[] args){
        System.out.println("Jay Swaminarayan");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number n:");
        int n=sc.nextInt();
        int j=0;
        for(int i = 0 ; i < n ; i++){
            for(j = 0 ; j < 2*n - 1 ; j++) {
                if (n-i-1 >= j && j >=i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
