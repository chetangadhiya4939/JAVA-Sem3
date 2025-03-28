import java.io.*;
import java.util.*;
public class vovel_Conso {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0; i<arr.length; i++){
            char ch=arr[i];
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch+"is Vovel.");
            }else if (Character.isLetter(ch)){
                System.out.println(ch+"is Consonant.");
            }else{
                System.out.println(ch+" is neither a Vovel or Consonant.");
            }
        }

    }
}
