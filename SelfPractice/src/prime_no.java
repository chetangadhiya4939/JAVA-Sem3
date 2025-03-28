import java.util.*;
public class prime_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        int flag = 1;
        if(n==0 || n==1){
            System.out.println("0,1 is not a prime numbers.");
        }
        for(int i=2; i *i <= n ; i++){
            if(n%i==0){
                flag = 0;
                System.out.print(n+" is prime not numbers.");
                break;
            }
        }
        if(flag == 1){
            System.out.print(n+" is prime numbers.");
        }
    }
}
