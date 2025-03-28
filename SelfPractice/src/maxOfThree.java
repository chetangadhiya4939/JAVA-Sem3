import java.util.*;
public class maxOfThree {
    public static void main(String[]args){
        int temp, largest;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        System.out.print("Enter c : ");
        int c=sc.nextInt();
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);
        }
}
